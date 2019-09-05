# 登录demo

## 3种web会话管理的方式

1. 基于server端session的管理方式
2. cookie-base的管理方式
3. token-base的管理方式

[Details](!https://www.cnblogs.com/lyzg/p/6067766.html)

# OAuth2.0
The OAuth 2.0 authorization framework enables third-party applications to obtain limited access to a web service.

四种模式：
1. Implicity 用于静态页面，没有后台交互，只有一个token，易泄漏，不能刷新
2. authorization code 就是我们用的
3. resource owner password credentials 企业内部产品互相
4. client credentials 链式调用

单点登录就是一次登录，可以使用内部所有资源

[介绍](!http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)

先简要描述一下OAuth登录过程
1. 首先client向oauth layer发送请求，表示其想要获得登录权限，这个请求会打开server对应的oauth页面进行登录
2. 登录完之后server会向之前指定好的url发送code
3. client拿到code之后会连同secret ID发送出去，继续向服务器请求token
4. server核对code，确认无误后向client发送token，这个时候client就可以用token请求信息啦，这时候code会立即作废

Q: 为什么不在第二步直接发送token呢？
至于为什么不直接返回 access token? 是因为如果使用 code 方式的话，服务器获得用户授权后通过 302 跳转到你的 callback URI 上，并在 url query 上带上用于交换 accesd token 的 code ，
你在浏览器地址栏就可以看到这个code ，已经暴露有可能被不法应用，所以在 url 上直接返回 access token 是不安全的，
而client拿到code以后换取access token是client后台对认证服务器的访问，并且需要clientID和client secret，
不依赖浏览器，access token不会暴露出去。最终实现是通过okhttp即socket实现的

## Github OAuth

用github登录试试看：[ref](!https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)

1. GET ```https://github.com/login/oauth/authorize?client_id=***&redirect_uri=***```
2. 拿到code
3. 带着secretID和code再次发送出去 ```POST https://github.com/login/oauth/access_token```
4. 拿到token

## 登录之后如何持久化
access_token拿到之后，其实并不需要要太多操作，因为你只有在第一次登录的时候需要获取用户名等一些基本信息，这些信息是存储在server的sql上的，
因此access_token是没必要保存的，
1. 利用access_token获取用户信息
2. 保存用户信息到sql，其中一个column用来存储token，注意这里的token是自己生成的token，把这个token写到cookie里发送给用户, 下次用户就可以凭借这个token来登录server，
server则会findUserByToken，来拿到用户信息
3. 由于不想每次拿到token都查询一次数据库，因此可以用session存储这个user信息

这个其实就是基于session的管理方式






