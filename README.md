# spring-mvc-blog #
#### 系统说明 ####
这是一个用Spring Mvc搭建的一个博客系统；前台使用requirejs+jquery+bootstrap;后台使用Spring Mvc + Spring Data Jpa + Hibernate;

#### 系统使用 ####
0. 前置条件
	1. 安装gradle软件
	2. 安装MySQL软件
	> 本项目中默认使用的数据库spring_demo,数据库端口号3308，用户名platform_admin，密码weieyuan
1. 将工程下载下来后，执行build.bat脚步。
2. 将工程导入到eclipse中，设置web项目的根路径，例如将项目的根路径设置为"blog"。
![设置web项目的根路径](./images/1.png)
3. 根据需要修改数据库名称/端口号/用户名/密码等信息
3. 启动web工程。
4. 打开浏览器访问访问http://localhost:8080/blog/login
![登录界面](./images/2.png)
5. 输入用户名:admin,密码：admin然后点击Sign in，进入blog的主页面

