# log4j2介绍
展示了用yml配置log4j2日志，可配置：日志路径、文件名、日志格式、同步或异步打印、日志分类

##  一日志效果
以下仅展示日志效果，具体配置可看项目配置文件
### 1.1、控制台打印效果：
```
2019-08-25 16:06:22,275:DEBUG main  com.wusiq.Log4j2YmlApplication.recordLog(Log4j2YmlApplication.java:18)   - debug
2019-08-25 16:06:22,281: INFO main  com.wusiq.Log4j2YmlApplication.recordLog(Log4j2YmlApplication.java:19)   - info
2019-08-25 16:06:22,282: WARN main  com.wusiq.Log4j2YmlApplication.recordLog(Log4j2YmlApplication.java:20)   - warn
2019-08-25 16:06:22,282:ERROR main  com.wusiq.Log4j2YmlApplication.recordLog(Log4j2YmlApplication.java:21)   - error

```

### 1.2、日志文件打印效果：
```
2019-08-25 16:06:22,275:DEBUG main  (Log4j2YmlApplication.java:recordLog:18)   - debug
2019-08-25 16:06:22,281: INFO main  (Log4j2YmlApplication.java:recordLog:19)   - info
2019-08-25 16:06:22,282: WARN main  (Log4j2YmlApplication.java:recordLog:20)   - warn
2019-08-25 16:06:22,282:ERROR main  (Log4j2YmlApplication.java:recordLog:21)   - error

```


##  二、日志格式配置介绍
以下介绍来源于：[Log4J日志整合及配置详解](https://www.cnblogs.com/wangzhuxing/p/7753420.html)

```
%p：输出日志信息的优先级，即DEBUG，INFO，WARN，ERROR，FATAL。
%d：输出日志时间点的日期或时间，默认格式为ISO8601，也可以在其后指定格式，如：%d{yyyy/MM/dd HH:mm:ss,SSS}。
%r：输出自应用程序启动到输出该log信息耗费的毫秒数。
%t：输出产生该日志事件的线程名。
%l：输出日志事件的发生位置，相当于%c.%M(%F:%L)的组合，包括类全名、方法、文件名以及在代码中的行数。例如：test.TestLog4j.main(TestLog4j.java:10)。
%c：输出日志信息所属的类目，通常就是所在类的全名。
%M：输出产生日志信息的方法名。
%F：输出日志消息产生时所在的文件名称。
%L:：输出代码中的行号。
%m:：输出代码中指定的具体日志信息。
%n：输出一个回车换行符，Windows平台为"rn"，Unix平台为"n"。
%x：输出和当前线程相关联的NDC(嵌套诊断环境)，尤其用到像java servlets这样的多客户多线程的应用中。
%%：输出一个"%"字符。
另外，还可以在%与格式字符之间加上修饰符来控制其最小长度、最大长度、和文本的对齐方式。如：
1) c：指定输出category的名称，最小的长度是20，如果category的名称长度小于20的话，默认的情况下右对齐。
2)%-20c："-"号表示左对齐。
3)%.30c：指定输出category的名称，最大的长度是30，如果category的名称长度大于30的话，就会将左边多出的字符截掉，但小于30的话也不会补空格。
```


## 三、FAQ
#### 3.1`通用编译命令
有时候gradle版本对不上，编译可能会失败，可以用如下命令：
```
chmod +x ./gradlew
./gradlew build -x test
```

#### 3.2 高低版本gradle引用lombok问题
低版本配置：
```
compile('org.projectlombok:lombok:1.18.2)
```
高版本配置：
```
  annotationProcessor 'org.projectlombok:lombok:1.18.2'
  compileOnly 'org.projectlombok:lombok:1.18.2'
  testAnnotationProcessor 'org.projectlombok:lombok:1.18.2'
  testCompileOnly 'org.projectlombok:lombok:1.18.2'
```