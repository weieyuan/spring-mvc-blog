# spring-mvc-blog #
#### 系统说明 ####
这是一个用Spring Mvc搭建的一个博客系统；前台使用requirejs+jquery+bootstrap;后台使用Spring Mvc + Spring Data Jpa + Hibernate;

#### 功能介绍 ####
* 简单的登录认证
* 编写新的博客
* 编辑博客信息
* 查看博客详情

#### 系统使用 ####
0. 前置条件
	1. 安装gradle软件
	2. 安装MySQL软件
	> 本项目中默认使用的数据库spring_demo,数据库端口号3308，用户名platform_admin，密码weieyuan
1. 将工程下载下来后，执行build.bat脚步。
2. 将工程导入到eclipse中，设置web项目的根路径，例如将项目的根路径设置为"blog"。
![设置web项目的根路径](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/1.PNG)
3. 根据需要修改数据库名称/端口号/用户名/密码等信息(数据库的配置文件src\main\resources\dataconfig.properties)
![修改数据库信息](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/3.png)
4. 启动web工程。
5. 打开浏览器访问访问http://localhost:8080/blog/login
![登录界面](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/2.png)
6. 输入用户名:admin,密码：admin然后点击Sign in，进入blog的主页面
![主界面](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/4.png)
7. 点击"Write Blog"进入blog编写界面
![编写博客](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/5.png)
8. 点击"save"保存博客
![编写博客](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/6.png)
9. 点击"Edit"可以进入博客编辑界面
10. 点击"Read More"可以查看博客的详情
![编写博客](https://github.com/weieyuan/spring-mvc-blog/blob/master/images/7.png)



