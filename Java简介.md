#### 课程目标

- 全面深入掌握java平台开发能力
  - 面向对象编程，核心类库使用，多线程
- 培养架构思维和自我学习能力
  - 模块化开发，设计模式，如何学习开源项目
- 培养优秀的工程习惯和编码能力
  - 良好的项目接口，IDE技巧，代码格式，调试方法



### Java简介

1. 目前全球Top 1程序开发语言，有最大的开发社区；
2. 广泛应用于企业和互联网后端开发，Android开发，大数据开发；
3. 市场需求最大的软件工程师职位。

### Java的特点

1. 面向对象编程；
2. 字节码方式运行在虚拟机上；
3. 简单，健壮，安全
4. 跨平台。

### Java的版本

* Java SE：Standard Edition，标准版
* Java EE：Enterprise Edition，企业版
* Java ME：Micro Edition，移动版

### 名词解释

* JSR：Java Specification Request
* JCP：Java Community Process
* RI：Reference Implementation
* TCK：Technology Compatibility Kit
* JDK：Java Development Kit
* JRE：Java Runtime Environment

### 教程开发环境

* Windows XP ~ 10
* Oracle JDK 8
* Eclipse



### JDK下载地址

http://www.oracle.com/technetwork/java/javase/downloads/index.html

国内镜像 http://pan.baidu.com/s/1kU5OCOB#path=%252Fpub%252Fjava

### 安装JDK

* 安装JDK

安装后打开命令提示符检查java命令：

```
java -version
```

检查javac命令：

```
javac
```

需要把JDK的bin目录添加到环境变量Path中

### 在Eclipse中安装插件

Add Repository:
Name: feiyangedu
Location: http://static.feiyangedu.com/eclipse/site.xml

接受协议
重启Eclipse

### 打开插件

菜单Window -> Show View -> Other...
找到飞扬学院 -> 在线练习
登录后双击练习导入Eclipse

### 练习

计算前N个自然数的和可以根据公示：

```
(1 + N) * N
___________
     2
```

请根据公式计算前N个自然数的和。

#### 查找java format的格式

浏览器输入：java format string syntax



#### if-else

- if-else可以做条件判断，else可选

- 不推荐省略花括号
- 做个if-else串联要注意判断顺序
- 要注意边界条件
- 要注意浮点数判断相等
- 引用类型判断相等用equals，注意避免NullPointException



#### for

- for循环的计数器i尽量定义在for循环中，java的作用域越小越好

- 如果关心索引i就使用for循环
- 如果不关心索引，只关心数组本身，可以使用foreacn循环

#### foreach

- 可以遍历所有的**可迭代**类型，List，Map
- 无法获取数组的索引
- 无法指定遍历的顺序

#### 二维数组

```java
int [] [] ns={
    {1,2},
    {1,3,4,3}
}
```

- 二维数组就是数组的数组，一个数组，他的每一个元素又是另外一个数组的引用，这就是二维数组的本质。

- 二维数组每个数组长度可以不同