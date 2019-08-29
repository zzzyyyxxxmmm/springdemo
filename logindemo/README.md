# 登录demo

## 3种web会话管理的方式

1. 基于server端session的管理方式
2. cookie-base的管理方式
3. token-base的管理方式

[Details](!https://www.cnblogs.com/lyzg/p/6067766.html)

# OAuth2.0
The OAuth 2.0 authorization framework enables third-party applications to obtain limited access to a web service.

[介绍](!http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)

先简要描述一下OAuth登录过程
1. 首先client向oauth layer发送请求，表示其想要获得登录权限，这个请求会打开server对应的oauth页面进行登录
2. 登录完之后server会向之前指定好的url发送code
3. client拿到code之后会连同secret ID发送出去，继续向服务器请求token
4. server核对code，确认无误后向client发送token，这个时候client就可以用token请求信息啦

Q: 为什么不在第二步直接发送token呢？
至于为什么不直接返回 access token? 是因为如果使用 code 方式的话，服务器获得用户授权后通过 302 跳转到你的 callback URI 上，并在 url query 上带上用于交换 accesd token 的 code ，
你在浏览器地址栏就可以看到这个code ，已经暴露有可能被不法应用，所以在 url 上直接返回 access token 是不安全的，
而client拿到code以后换取access token是client后台对认证服务器的访问，并且需要clientID和client secret，
不依赖浏览器，access token不会暴露出去。最终实现是通过okhttp即socket实现的

## Github OAuth


