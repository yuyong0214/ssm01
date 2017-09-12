# ssm01
spring-mvc+spring+mybatis+mysql实战项目陆续更新
其中包括配置web.xml
  <!-- Spring 容器加载 -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	<context-param>
		<param-name>contextConfigLocation</param-name>
    <!--引用beans.xml文件-->
		<param-value>classpath:beans.xml</param-value>
	</context-param>
  等等。。。。。代码里面都有详细的描述
  
  由于我的mapper.xml和mapperClass放在相同的文件夹下所以我的MyBatisConf.xml配置相当简单
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
  <configuration>
     <!-- 配置Mapper文件的路径 -->
     <mappers>
         <!--在此声明我的MyBatis版本为3.2.8 低版本的此功能实效-->
         <!-- 如果采用2...版本的可以采用这种方法<mapper resource="com/yong/mapper/UserMapper.xml" /> -->
         <package name="com.yong.mapper"/>
     </mappers>
  </configuration>
