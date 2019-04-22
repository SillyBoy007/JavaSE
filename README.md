# JavaSE学习笔记

## 1.覆写

定义:子类与父类的方法同名

**1.1 方法覆写（重点) **

定义:当子类定义了与父类方法名称相同,参数及返回值类型相同的方法叫方法重写
特性:
1.**子类的重写方法控制访问权限(public<default<private)不能高于父类**
2.父类的权限级别高于子类,则无法覆盖更高级的父类
3.可以使用super.fun()调用父类方法(父类的访问权限和子类相同)

重载与重写的区别
1.重载发生在一个类中,重写发生在继承关系里
2.重载方法名称相同,参数类型及个数不同,重写方法名称相同,参数类型及个数相同返回值相同
3.重载没有访问权限限制,重写子类不能比父类访问权限高
4.考虑到程序统一性,重载返回值类型相同(可以不同),重写本身就相同

**1.2 属性覆盖**

定义:子类定义了和父类名称相同的属性

super与this的比较
1.this调用本类属性,方法，构造,super调用父类属性,构造，方法
2.this先查找本类,找不到再找父类,super直接查找父类调用父类操作
3.this表示当前对象,super不能单独使用。



## 2.final关键字

1.使用final定义的类不能有子类（太监类）
2.final定义的方法不能重写
3.final定义的变量成了常量(不可修改)
4.public static final 定义公共常量,全局常量



## 3.多态性

**方法多态性**

1.方法的重载
2.方法的重写

**对象的多态性**

1.向上转型(自动转型):父类 父类对象 = 子类实例
主要作用:参数类型统一
限制:只能调用子类重写方法,不能调用子类其它方法

2.向下转型(强制完成):子类 子类对象 = 父类实例
作用:将父类对象转化为子类对象,调用子类特殊方法
限制:要先进行向上转型,建立关系,直接转型会发生类转换异常,或使用instanceof避免

类转换异常,两个没有关系的类向下转型发生的异常



## 4.抽象类

**4.1抽象类的定义:**

在普通类的结构里增加抽象增加抽象方法的组成部分,抽象类和方法要用abstrat定义

**4.2 抽象类的特点:**

1.抽象类必须有子类
2.抽象类的子类必须覆写抽象类的方法
3.抽象类的实例化需要依靠子类完成，采用向上转型完成,不能直接实例化抽象类

开发标准:普通类一般继承抽象类

**4.3 抽象类的限制:**

1.不能用final声明
2.外部的抽象类不能用static声明,内部的抽象类可以用static声明(相当于外部抽象类)

**4.4 抽象类的应用:模板**

总结:
1.要用继承就用抽象类
2.抽象类规定了子类必须要做的事情,而且抽象类可以与普通方法相配合
2.单继承,一个子类只能继承一个抽象类



## 5.接口

**5.1 基本概念**

如果一个类之中只是有抽象方法和全局常量组成,通常定义成接口,接口属于特殊的抽象类,这个类中只有抽象方法和全局常量,没有构造。

**5.2 接口的使用**

1.接口不能直接用new实例化
2.接口必须要有子类(此时以一个子类可以使用inplements实现多个接口)
3.接口的子类如果不是抽象类,必须复写接口中的全部抽象方法
4.接口的对象可以利用子类对象的向上转型实现实例化
5.子类又要继承又要接口,先继承
6.接口中只能使用public访问权限(可以省略)

**5.3 接口和抽象类对比**
相同点:
1.都是上层的抽象层
2.都不能被实例化，依靠向上转型实例化
3.都能包含抽象的方法，这些抽象的方法用于描述类具备的功能，但是不比提供具体的实现
不同点:
1.一个抽象类只能继承一个抽象类（单继承）,一个接口能继承多个接口(接口多继承)
2.一个子类只能继承一个抽象类,但可以实现多个接口
3.在抽象类中可以写非抽象的方法，从而避免在子类中重复书写他们，这样可以提高代码的复用性，这是抽象类的优势；接口中只能有抽象的方法。
4.抽象类可以使用多个权限,接口只能是public


**注意点**
1.接口的主要为了解决单继承局限问题
2.接口内部结构可以定义普通内部类,抽象内部类，内部接口
3.一个接口如果用了static定义一个内部接口,表示是一个外部接口

**接口的核心作用**:
1.定义操作标准
2.表示一种操作能力
3.表示将于服务端的远程方法视图暴露给客户端.

**总结:**
自己写的接口,尽量不要用new直接实例化接口,使用工厂函数实例化接口
接口作为标准用于解耦合以及不同层之间的桥梁



## 6.工厂设计模式和代理设计模式

**6.1 工厂设计模式**

**代码标准:**
1.客户端获取简单，不需要关注具体细节
2.客户端之外的代码修改,不影响用户使用,用户不用关心是否变更

**问题引出**:需要在客户端多次实例化对象,每次更换对象都要实例化一次,耦合度太高,代码不方便维护

**工厂设计模式作用**
1.实例化对象，用工厂方法代替new操作。
2.实现类、创建对象统一管理和控制。从而实现了创建者和调用者的分离。

**6.2 代理设计模式**

1.核心思想:一个主题操作接口,多种方法.核心业务只完成核心功能.



## 7.Object类

**Object类的特征**:
1.Object类是所有类的父类,除了Object类外,所有类都是有继承关系的类
2.Object类可以接受任何类对象,向上转型
3.在不知道类型的情况下用Object类
4.Object类含有无参构造方法
5.Object类可以接收所有引用类型,包括接口和数组(数据统一)
**Object类的方法**:
1.输出对象会默认调用toString方法输出对象编码
2.对象比较用equals



## 8.扩展概念

1.**匿名内部类**:基于接口和抽象类使用,可以节约代码,减少类文件的定义

2.**基本数据类型包装类**:包装所有基本数据类型

|-对象型包装类(Object直接子类)
boolean(Boolean),char(Character)
|-数值型包装类(Number直接子类)
int(Integer),short(Short),long(Long),double(Double),byte(Byte),float(Float)

Number类定义了六个方法:intValue,longValue,doubleValue,byteValue,floatVlaue
装箱:将基本数据类型变为包装类形式
拆箱:从包装类取出基本数据类型(六个方法)
由于存在自动装箱,Object可以自动接收基本数据类型

**|-基本数据类型包装类数据类型转换**(核心)
public static int parseInt(String s)
public static double parseDouble(String s)
public static boolean parseBoolean(String s)



## 9.包的定义及使用

**一.包的定义**:程序的目录
所有的类都要定义在包中,完整的类名称是"包.类"
**二.包的导入**
1.只能导入public class,class类只能被本包的类访问
2.可以用包.*导入多个类,（按需导入）
3.两个不同包有名称相同类会报错,解决方法:在类名称前加入包名称
**三.系统包**
1.java.lang(自动导入)
2.java.lang.reflect 反射开发包
3.java.util: Java的工具包,提供了大量工具类,如链表.
4.java.util.regex:正则包
5.java.text:国际化处理程序包
6.java.io:输入输出处理,文件操作
7.java.net:网络编程
8.java.sql:数据库程序开发包
9.java.applet:java绘图(弃用) canvas代替
10.java.awt,java.swing:图形界面开发

**四.jar命令**
打包命令



## 10.访问控制权

**四种权限**
1.public:访问范围:不同包的非子类
2.protected:访问范围:不同包的子类
3.default:访问范围:同一包的不同类
4.private:访问范围:同一类中

**命名规范**:
1.类名称大写
2.方法属性开头小写,而后大写
3.包名称小写
4.常量大写

**单例设计模式(Singleton):**
特点:让一个类在整个系统里只有一个实例化对象

思路:用private static final 实例化对象,static方法返回这个对象,最终实现控制实例化对象的个数为1个
意义:构造方法私有化,不管外部产生多少个对象,只产生一个实例化对象

**多例设计模式(Singleton):**
让一个类产生指定多个实例化对象,如性别,和日期等

单例模式和多例模式核心:构造方法私有化

**构造方法私有化**:
构造方法私有化后无法进行new初始化



## 11.异常的捕获及处理

**一.异常的产生以及对程序的影响**
异常是导致程序中断的指令流.

**二.异常处理的格式**
try{ 可能出现异常的语句 } catch...
try{可能出现异常的语句}catch(异常的种类)(可添加多个){输出异常信息}finally{无论对错都执行的语句}

**三.异常的处理流程**(核心)
所有的异常类都是throwable的子类
error和exception的区别:error是JVM出错,用户无法处理,异常是程序运行中出现的异常

开始->产生异常->try语句捕获异常类产生的实例化对象[交给JVM输出默认信息并结束语句]->与try语句后的每一个catch比较->不管是否匹配都要向后执行->根据catch执行[交给JVM处理输出默认异常]

使用Exception 处理所有异常,捕获范围大的放在捕获范围小的异常之后,
异常分开捕获分开处理较好

**四.throw,throws等关键字的使用**
throws 用于方法声明:方法中出现异常后,交由被调用处处理,无论是否出现异常都要try..catch包裹调用方法
throw 人为抛出异常,可以自己定义的异常

**五.RuntimeException**
运行时的异常
Exception和RuntimeException区别
Exception是RuntimeException的父类,Exception必需处理,RuntimeException不一定要处理.
常见的RuntimeException:算术异常ArithmeticExecption，空指向异常NullPointerException



## 12.泛型

**一.泛型操作实现**
1.泛型的引出
类在定义时,可以使用标记,此标记表示类中属性或方法参数的类型标记,在使用的时候才动态设置类型
注意:
1.必须是引用类型,不能是基本数据类型,但可以用包装类Integer等
2.在使用泛型类或接口时,若没有设置类型，默认设置为Object类型
3.JDK1.7以后可以简化声明,实例化的泛型可以省略
4.重载只能解决参数类型,不能重载泛型
**二.通配符的使用**
1.?表示能接受任何参数,但不能改变参数类型，只能取出
2.? extends Number 只能接受Number的子类 int，double...
3.? super String 只能接受String和String的父类Object
**三.泛型接口**



## 13.枚举

**一.枚举的基本用处**
1.枚举可以替代简化的多例模式.
2.使用enum定义的枚举相当于一个类继承了enum类
3.enum类是一个抽象类,构造方法私有化
枚举的操作方法
1.取得枚举的索引:public final int ordinal()
2.取得枚举的名字:public final String name()
3.values(),将枚举对象以对象数组形式返回
**enum和Enum的区别**
enum是关键字,用enum定义的类继承了Enum类

**二.枚举的定义**
1.枚举之中定义的构造方法不能用public声明
2.枚举对象必须放在首行,随后定义属性,构造，普通方法
**枚举实现接口**
枚举属于高级多例设计模式



## 14.Annocation

**一.Annocation的作用**
1.可以用注解的形式实现程序的不同实现
**二.三种内置的Annocation的使用**
1.准确的重写:[@override](https://github.com/override)
2.声明过期操作:[@deprecated](https://github.com/deprecated)
3.压制警告:[@SuppressWarnings](https://github.com/SuppressWarnings)



## 15.java8新特性(了解)

**一.接口定义增强**
1.在接口里可以使用default定义普通方法
2.可以用static定义方法,这个方法可以直接用类名称调用
3.内部类访问方法参数的时候可以不加上final
这样做的意义是避免子类重复实现同样的代码,接口里还是以抽象方法为主

**二.lamda表达式**
1.函数式编程概念
2.形式
1)（参数）->单行语句
2)（参数）->{多行语句}
3)（参数）->表达式
避免匿名内部类过长的语法

**三.方法引用**
1.引用静态方法:   类名称::static方法名称
2.引用某个对象的方法：实例化对象::普通方法
3.引用特定类型的方法:  特定类::普通方法
4.引用构造方法:  类名称::new
注意:要实现函数的引用必须要有接口,接口里面只能有一个方法,为了接口里只能有一个方法,需要加注解@FunctionalInterface

**四.内建函数式接口**
针对方法引用,java.util.function提供四个核心接口
1.功能型接口（Function）:public interface Function <T,R>{public R apply(T t)}（返回处理结果）
2.消费型接口（Consumer）:public interface Consumer<T>{public void accept(T t)}（不返回结果）
3.供给型接口（Supper）:public interface Supper<T>{public T get()}（不接受参数，只返回结果）
4.断言型接口（Predicate）：public interface Predicate<T>{public boolean test(T t)}(进行判断操作使用)



## 16.Java多线程

**一.线程与进程**
进程:指程序的一次完成运行，运行过程中内存，处理器，IO等资源操作都要为这个进程服务
线程:在进程的基础上进一步划分,一个进程可以创建多个线程

**二.java多线程的实现**
**1.继承Thread类**
定义:一个支持多线程的类,只要有一个子类就可以实现多线程支持
启动多线程：start()启动run()方法
使用Thread类的start方法不仅仅要启动多线程的执行代码,还要根据不同的操作系统进行资源分配
线程之间互相抢占资源,不再顺序执行
**注意:**一个线程重复启动会有RuntimException异常抛出

**2.实现Runnable接口**
与继承Thread类相比,Runnable接口没有什么区别,但没有start方法,只能依靠Thread类完成
Thread类中的构造方法:public Thread(Runable target),可以接收Runnable接口对象
启动多线程:实例化Thread类,将Runnable的子类传进去,再调用start方法启动

**三.两种实现方式的区别**
1.Thread类实现了Runnable接口,是Runnable接口的子类,使用Runnable可以避免单继承局限
2.Runnable实现多线程比Thread实现多线程更加清楚的描述数据共享的概念

**四.第三种实现多线程的方式**(理解)
Callable接口实现多线程,有返回值



## 17.线程的常用操作方法

**一.线程的命名与取得**
1.构造方法:public Thread(Runable target,String name)
2.设置名字:public final void setName(String name)
3.取得名字:public final String getName()
4.取得当前线程对象:public static Thread currentThread()
注意:
1.主方法是main线程,在main方法创建的线程都是子线程
2.每当用Java解释程序时对于操作系统而言相当于启动了一个进程
3.每个JVM启动时时要启动2个线程:
main线程：程序的主要执行,启动子线程
gc线程：负责垃圾收集

**二.线程的休眠**
让线程的执行速度稍微变慢一点
public static void sleep(long millis) throws InterruptedException
在休眠时若设置了多个线程对象,那么所有的线程对象将进入到run方法

**三.线程的优先级**
优先级越高,越有可能先执行
主线程的优先级为中等优先级
设置优先级:public final void setPriority(int newPriority)
取得优先级:public final int getPriority()
最高优先级:public final int MAX_PRIORITY
中等优先级:public final int NORM_PRIORITY
最低优先级:public final int MIN_PRIORITY



## 18.线程的同步与死锁

**一.线程同步产生原因**
同步是指多个线程访问同一资源时所需要考虑的问题,多个对象同时异步访问数据会发生安全问题
**二.线程的同步处理操作**
同步代码块:
synchronized(锁定对象){
代码
}
同步方法:
public synchronized 返回值 方法名称{代码}
异步操作速度较快,同步操作数据安全性高,属于安全的数据操作
**三.线程的死锁情况**
多个线程访问同一资源一定要处理好同步,但过多使用同步可能会造成死锁

**四.线程实战-生产者与消费者**
1.使用异步会发生错乱-解决方式:使用同步方法
2.使用同步方法会产生重复操作问题-解决方式:加入等待与唤醒机制
等待:public final void wait() throws InterruptedException
唤醒第一个等待线程:public final void notify()
唤醒全部等待线程,哪个优先级高先执行:public final void notifyAll()

**sleep()与wait()的区别**：
sleep()是Thread类定义的方法,wait()是Object是Object类定义的方法
sleep()可以设置休眠时间,时间一到自动唤醒,wait()需要等待notify进行唤醒



## 19.Java基础类库

**一.StringBuffer类 **

特点:1.StringBuffer类的字符串可以修改
连接字符串操作:public StringBuffer append(StringBuffer temp)
**String类与StringBuffer类对比**
1.都是CharSequence的子类
**String转换为StringBuffer类:**
1.利用StringBuffer类的构造方法
2.利用append方法
**StringBuffer转换为String类:**
1.利用toString()方法
2.String类的构造方法能接收StringBuffer对象,完成转换
**StringBuilder类**(JDK1.5)
StringBuffer类与StringBuilder类定义类似.
**String,StringBuffer,StringBuilder区别:**
1.String一旦声明不可改变,StringBuffer和StringBuilder可以改变
2.StringBuffer类中提供的是同步的方法,属于安全的线程操作,StringBuilder类中的属于异步方法,属于非线程安全操作.
90%需要使用String，需要频繁修改使用StringBuffer或StringBuilder

**二.Runtime类**

1.Runtime类的主要作用
在每个JVM进程里都会存在有一个Runtime对象,主要功能是
2.Runtime类的定义形式
在定义的时候构造方法已经私有化了,属于单例设计模式,只有唯一一个Runtime对象,在Runtime类里提供一个static方法-getRuntime,用来取得实例化对象

返回所有可用空间:public long totalMemory() 
返回最大可用内存空间:public long maxMemory()
返回剩余可用空间:public long freeMemory()
释放垃圾空间:public void gc(),
GC是垃圾收集器,指的是释放无用的内存空间,GC会由系统不定期进行回收,或者调用Runtime类的gc方法手工回收。
Runtime还可以调用本机可执行程序,调用进程
**总结:**
1.Runtime采用了单例设计模式
2.Runtime提供了gc方法,可以手工释放内存空间

**三.System类**

1.取得当前的系统时间:public static long currentTimeMillis()
2.等价于调用Runtime类的gc方法:public static void gc()
3.垃圾回收前执行:protected void finalize() throws Throwable
**final,finalize,finally的区别**
final:关键字,定义不能被继承的类，不能被重写的方法,常量
finally:关键字,异常的统一出口
finalize:Object类方法（protected void finalize() throws Throwable），对象回收前的收尾方法，即使出现异常,也不会导致程序中断执行

**四.对象克隆**

protect Object clone throws ClonesNotSupportException



## 20.数字操作类

**一.Math类**
Math类里所有的方法都是static方法,没有普通属性
四舍五入:public static long round(double a)
注:负数四舍五入时需要大于0.5才进

**二.Random类**
rand.nextInt

**三.大整数类BigInteger**
超过double的范围,将其变为string,然后按位数取出进行起算
BigInteger类是Number的子类,其构造方法接收String型

**四.BigDecimal类(important)**
1.可以接收double和String类
2.可以使用它的除法操作进行准确的四舍五入操作
public BigDeciaml devide(BigDeciaml  divisor,int scale,int roundingMode)
BigDeciaml  divisor:被除数
int scale:保留位数
int roundingMode 进位模式



## 21.日期操作类

**一.Date类的使用**
Date类的重要操作方法
1.无参构造:public Date();
2.有参构造:public Date(long date)---将long型数据转化为date
3.将date转换为long:public long getTime()
**二.代码模型:SimpleDateFormat类**
SimpleDateFormat类将date型对象转化为string型---java.text包
构造方法:public SimpleDateFormat(String pattern),需要传递转换格式
将date变为string,public final String format(Date date)
将String变为date:public final Date parse(String source) throws ParseException
常见单位:年(yyyy),月(MM),日(dd),时(HH),分(mm),秒(ss),毫秒(SSS)

**二.Caleda类的使用**
抽象类,依靠子类进行对象实例化操作

**总结:**
1.数据库中的日期用java.util.Date表示
2.代码模型:SimpleDateFormat实现string与date互转



## 22.比较器

**一.Arrays类**

1.java.util包中的工具类
2.排序:java.util.Arrays.sort()
3.二分查找法:public int binarySearch(int[] arr,int key)
4.数组比较:public static boolean equals(数据类型[] a,数据类型a2)(需要顺序一致)
5.将数据b填充进数组a:public static void fill(数据类型[] a,数据类型 b)
6.对象数组排序:public satic void sort (Object [] a)

**二.Comparable接口(核心)**

public interface Comparable<T>{ public int compareTo(T o)}
String类是Comparable的子类
CompareTo()返回三类数据:1(大于),0(等于),-1(小于)
总结:以后不管何种情况,只要有一组对象要排序,就要实现Comparable接口

**三.二叉树**

树可以对数组进行排序,原理是:选择一个数为根节点,比根节点小的放在根节点的左节点,比根节点大的树放在右节点,取出数据采用中序遍历(左-中-右)
定义二叉树,所有二叉树都需要Node类支持

**四.Comparator接口**

java.util.Comparator
Comparator和Comparable两种比较器的区别:
如果对象数组要进行排序,必须设置排序规则,可以使用Comparator和Comparable俩种接口实现.
java.lang.Comparable是在一个类中定义的时候实现好的接口,这样本类对象数组就可以排序,Comparable接口下定义了 public int compareTo(T o)方法.
java.util.Compareable是专门定义一个类的比较规则,里面有俩个方法public int compare(),public boolean equals()



## 23.正则

**一.常用的正则标记:**
1.[abc]   2.[^abc]  3.[a-z]   4.[a-zA-Z]   5..   6.\d  7\D  8.\s  9\S 10.\w  
11.\W   12.^    13.$   14.?  15.+ 16.* 17.{n}  18.{n,}  19,{n,m}  
20.正则1正则2:正则1判断完成后继续判断正则2
21.正则1 | 正则2：正则1或则正则2有一组满足
22.(正则):将多个正则为一组

**二.String对正则的支持(important):**
1.正则测试,使用给定的字符串判断是否符合正则表达式:public boolean mathches(String regex)
2.全部替换:public  String  replaceAll(String regex,String replacement)
3.替换首个:public  String  replaceFirst(String regex,String replacement)
4.全部拆分:public  String[]  split(String regex)
5.部分拆分:public  String[]  split(String regex,int limit)

**三.java.util.regex:**
所有正则的类定义在java.util.regex包里
Pattern类:此类对象要想取得需使用compile()方法,编译正则
Matcher类:通过Pattern类取得



## 24.反射

**认识反射**
定义:对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性

**Class类对象实例化**
java.lang.Class是一个类,这个类是所有反射操作的源头,这个类有三种实例化方式:
1. Class<?> cls = 对象.getClass()
2. Class<?> cls2 = 类.class
3. Class<?> cls3 = Class.forName("java.util.Date")

**反射实例化对象**
newInstance()实例化
用new实例化容易造成耦合.
反射实例化对象的好处是可以解耦合,而且可扩展性很强

**反射调用构造方法**
若类里没有无参构造,无法进行对象实例化，需要反射调用有参构造
java.lang.reflect.Constructor类

**反射调用普通方法**
类中的普通方法在类产生实例化对象后才能由该对象调用
getMethods取得所有方法
getMethod取得指定方法
在整个过程中完全看不到操作类型,可以实现任意类的指定方法调用

**反射调用成员**
设置属性内容: public void set()
取得属性内容::public Object get()
Executable:下面继续继承了Method、Constructor



## 25.文件操作类---File类

由java.io包完成,五个核心类:File,InputStream,OutputStream,Reader,Writer,一个核心接口:Serializable
如果想用File类，需要使用其构造方法定义一个操作文件:
设置完整路径:pulic File (String pathname),(大部分使用)
设置父路径与子文件路径:public File(File parent,String Child) (安卓上使用)

**操作文件**
1.创建文件: public boolean createNewFile() throwsIOException
2.删除文件: public boolean delete() throwsIOException

**注意**: 
1.linux系统的分隔符和windows的分隔符不同,File类里有一个常量:public static final String separator来代替分隔符
2.java.io在操作过程中,会有延迟情况,因为Java是通过JVM间接调用操作系统的文件处理函数进行的文件操作。

**创建多级目录**:
1.先判断是否有父级目录:public boolean getParentFile() throwsIOException
2.如果没有创建父级目录:file1.getParentFile().mkdir[s]()

**取得文件信息**
1.取得文件大小:public  long length(),返回字节
2.判断是否是文件:public boolean isFile()
3.判断是否是目录:public boolean isDirectory()

**文件目录操作**
列出文件目录: public String [] list()
列出所有的信息以File类包装:public File[] listFiles()

**总结**:
1.File类本身只是操作文件的,不涉及到内容
2.File类中的重要方法:
配置完整路径:pulic File (String pathname)
删除文件: public boolean delete()
判断文件是否存在:public boolean exists()
找到父路径:public File getParentFile()
创建目录:public boolean mkdirs()
分隔符:File.separator



## 26.字节流与字符流

**以文件操作为例,输入和输出操作为:**
1.定义一个File类
2.通过字节流或字符流的子类对象为父类对象实例化
3.进行数据的读(输入)或写(输出)
4.资源操作关闭

**一.字节流**

**1.字节输出流OutputStream(important)**
OutputStream实现了Closeable,Flushable两个接口:
OutputStream提供三个输出方法:
1.输出单个字节:public abstract void write(byte b) throws IOException
2.输出全部字节数组:public void write(byte[] b) throws IOException
3.输出部分字节数组;public void write(byte[] b,int off , int len) throws IOException
**OutputStream子类方法:**
创建或覆盖已有文件:public FileOutputStream(File file) 
文件内容追加:public FileOutputStream(File file,boolean append)
**2.字节输入流InputStream**
InputStream实现了Closeable接口。
InputStream读取方法:
1.读取单个字节:public abstract int read() thros IOException
while循环,返回每次读取的字节数据或者-1(没有数据)
2.将读取的数据保存在字节数组里:public int read (byte[] b) throws IOException
返回读取的数据长度,读取到结尾返回-1
3.将读取的数据保存在部分字节数组里:public int read (byte[] b,int off,int len) throws IOException
返回部分数据的长度,若读取到结尾返回-1

**二.字符流**

**1.字符输出流Writer**
实现了Appendable,Closeable,Flushable接口
Writer类定义了如下方法:
1.输出全部字符数组:public void write(char [] cbuf) throws IOException
2.输出字符串:public void write (String str) throws IOException
字符流可以输出字符串.

**2.字符输入流Reader**
实现了Readable,Closeable接口
Reader类定义了如下方法:
1.读取内容到字符数组

**字节流与字符流的区别**
1.字节流直接与终端进行交互,字符流需要经过数据缓冲区进行交互
2.OutputStream即使没有关闭也能输出,而在Writer不能输出数据,可以使用flush()强制清空缓冲区
3.字符流最大的优点是可以对中文字符的有效处理
4.处理中文优先字符流,没有中文使用字节流
5.字符流的子类有转换流,磁盘上都是对字节的操作

**转换流**
InputStreamReader:Reader的子类
OutputStramWriter:Writer的子类



##27.打印流

**一.打印流的实现原理**

问题引出:如过要输出数据,需要将String变为byte，若是int或double等类型,需先将int或double转为String
java.lang.Object
  extends java.io.OutputStream
      extends java.io.FilterOutputStream ---write()
          extends  java.io.PrintStream
PrintStream类取代了write()方法

**二.打印流操作类的使用**

PrintStream:打印字节流
PrintWriter:打印字符流
**总结**:只要是程序输出内容都会采用打印流PrintStream

jdk1.5之后String增加了新的功能:
格式化字符串:public static  String format(String format , Object... args)



## 28.IO高级应用

**一.缓冲流**
字符缓冲区流: 
BufferReader类
读取一行数据:public String readLine() throws IOE
 缓冲区流也可以进行文件读取
BufferWriter
字节缓冲区流: BufferInputStream,BufferOutputStream

**二.扫描流Scanner**
BufferedReader的问题:
1.只能返回String
2.所有分隔符固定

**Scanner类负责输入流,Scanner类中的方法:**
java.lang.Object
  继承者 java.util.Scanner
1.判断是否有指定数据: public boolean hasNextXXX()
2.取出数据: public  String nextXXX()
3.设置分隔符: public Scanner useDelimiter(String pattern)

**总结**:读取数据不再使用InputStream,使用Scanner,输出数据OutputStream有打印流PrintStream

**三.对象序列化(important)**
定义:将对象保存在内存中的对象数据转化为二进制数据流进行传输操作，但并不是所有对象都可以序列化,如果要被序列化的对象，其所在的类一定要实现java.io.Serializable接口(标识接口,没有方法)

实现序列化与反序列化:
序列化类:ObjectOutputStream
构造:public ObjectOutputStream (OutputStream out) throws IOException
输出对象:public final void writeObject(Object obj) throws IOException
反序列化:ObjectInputStram
构造:public ObjectInputStream (InputStream in) throws IOException
读取对象:public final void readObject(Object obj) throws IOException

**transient关键字**
序列化对象中某些属性的内容不需要序列化通过transient关键字实现

**对象序列化**
定义:将对象保存在内存中的对象数据转化为二进制数据流进行传输操作，但并不是所有对象都可以序列化,如果要被序列化的对象，其所在的类一定要实现java.io.Serializable接口(标识接口,没有方法)



## 29.网络编程

**定义:客户端与服务器端的开发操作实现**
网络编程的俩种实现形式:
1.C/S结构,需要编写俩套代码(客户端与服务端),安全性高，开发麻烦
2.B/S结构,不再开发客户端,只开发一套服务端程序,客户端将利用浏览器进行访问。使用公共的http协议和80端口,安全性不高

C/S程序分为:
TCP程序:采用可靠的连接方式进行传输
UDP程序:不可靠的连接,属于数据报协议

**网络程序开发**:
服务端:
服务器类ServerSocket:主要是在服务器端,用于接收用户请求
构造;public ServerSocket (int port) 设置监听端口
接收客户端连接:pulic Socket accept()
取得客户端输出:public OutputStream getOutputStream()
客户端:
客户端类Socket:每一个连接到服务器端的用户用Socket表示
构造:public Socket(String host,int port) host是主机ip地址(本机为localhost)
得到输入数据:public InputStream getInputStream() throws IOE

**Echo程序**
在主方法中实现了简单的服务端与客户端通讯,此程序只能连接一个客户端,为了能够让一个服务器端同时处理多个客户,使用多线程描述。把每一个连接到服务器端的客户作为独立的线程对象保留



## 30.类集框架一: Collection接口

**核心接口**:Collection,List,Set;Map;Iterator,Enumeration
类集就是java数据结构的实现,是动态的对象数组

Collection是类集接口中单值保存最大父接口。
**常用的操作方法**:
**向集合里保存数据:public boolean add(E e)**
追加一个集合: public boolean addAll (Collection <? extends E) c
清空集合: public void clear()
判断是否包含指定内容(需要equals支持): public boolean contains(Object o)
判断是否是空集合: public boolean isEmpty() 
删除对象(需要equals支持): public boolean remove(Object o) 
取得集合元素个数: public  int size()
将集合变为对象数组保存：public Object[] toArray()
**为Iterator接口实例化：public Iterator<E> Iterator()**

**一.List子接口**

操作方法：
1.取得索引编号的内容:public E  get(int index)
2.修改指定索引编号的内容: public  E set(int index , E element)
3.为ListIterator接口实例化: public ListIterator<E> ListIterator

特点:
1.List集合中保存的数据是按照保存的顺序存储,而且允许存在有重复数据
2.List子接口扩充了get()方法

子类:
1.ArrayList类
2.Vector类

**ArrayList类和Vector类区别**
1.ArrayList异步处理,Vector同步处理
2.ArrayList支持Iteartor,ListIteartor,foreach；Vector支持Iteartor,ListIteartor,foreach,Enumeration

**二.Set子接口**
Set接口只是简单地继承了Collection接口,没有扩充方法
特点：Set集合下没有重复元素

子类:
1.HashSet类
特点:无序排列
方法:
取得哈希码:public int hashCode()
先判断对象哈希码是否相同,依靠哈希码取得对象的内容
对象比较:public boolean equals(Object obj)
将对象的属性进行依次比较


2.ThreeSet类
特点:保存的内容自动排序
ThreeSet主要依靠实现Comparable接口中的compareTo()方法判断是否重复数据

总结:建议使用HashSet子类,Compare只能负责TreeSet子类进行重复元素判断


**集合输出**
四种输出:Iterator(95%),ListIterator,Enumeration(4.9%),foreach

1.迭代输出:Iterator(核心)
只要是集合输出基本都用Iterator

2.双向迭代:ListIterator(了解)
ListIterator是Iterator的子类,专门为List子接口定义的输出接口

3.foreach

4.Enumeration 输出
若想要取得Enumeration 接口的实例化对象只能够依靠Vectory子类
public Enumeration<E> elements() 



## 31. 类集框架二: Map接口

Map主要负责保存一对对象的信息
Map存放数据主要是为了查找,Collection存放数据是为了输出

**Map主要操作方法**:
1.向集合中保存数据:public V put (K key, V value)
2.根据key查找value:public V get(Object key)
3.将Map集合转化为Set集合: public Set<Map.Entry<K,V>> entrySet()
4.取出全部的Key:public Set <K> keySet()

**Map子类**
HashMap类:
特点:无序的,重复的key会覆盖,采用异步处理
Hashtable类:
特点:key和value值不能为null,同步

**关于Iterator输出的问题（important）**
1.利用Map接口的entrySet()方法将Map集合变为Set集合,泛型是Map.Entry
2.利用Set集合的Iterator()方法将Set集合进行Iterator输出
3.每一次Iteator取出的是Map.Entry接口对象,利用此对象进行key和value的取出

注意：要想用自定义类作为key，那么必须重写Object类之中的hashCode（）和equals（）方法,只有靠这俩方法,才能确定元素是否重复



##32.类集框架三:Stack与Properties

**Stack类**
Stack表示栈操作,是Vector的子类
Stack类的方法:
入栈: public E push (E item)
出栈: public E pop()
若栈已经没有数据了,则无法继续出栈

**Properties类**
Properties是Hashtable的子类，主要作用是进行属性操作(利用字符串设置key和value)
方法:
设置属性: public Object  setProperty (String key,String value)
取得属性: public String  getProperty(String key) 若key不存在,返回空
取得属性: public String  getProperty(String key,String defaultValue) ,若key不存在,返回默认值
输出操作: public void store(OutputStream out , String comments) thrws IO
输入操作: public void load(InputStream in) throws IO

总结:
    资源文件的特点:key=value
    资源文件中都是字符串

==================================================================

**Collections工具类**
主要功能:实现List,Map,Set集合的操作
主要方法:
public static <T> boolean addAll(Collection<?super T>c,)

**Collections和Collection的区别**
Collection是集合操作的接口,Collections是集合操作的工具类,可以进行List,Map,Set的操作



##33.类集框架四:数据流Stream 

Iterable接口定义的一个方法:
default void forEach(Consumer<?super T) action)
该方法只能实现输出,不能处理数据

**Stream类**
除了Iterator迭代取出数据并处理之外，jdk1.8提供了专门可以处理数据处理的类java.util.stream,这个类的对象可以利用Colletion接口提供的方法操作：default Stream<E> stream()

方法:
取消重复数据: public Stream<T> distinct()
收集器(最后使用收集): public <R,A> R collect(Coller<?super T,A,R>collector)
Collectors类: public static <T> Collector <T? List<T>> toList();
数据的筛选: public Stream<T> filter(Predicate<?super T> predicate) (断言型接口)
把每一个数据分别处理: public <R> Stream <R> map(Function<? super T,?extends R> mapper)

集合数据分页的操作:  
跳过数据行数: public Stream <T> skip(long n)
设置取出的数据个数: public Stream <T> limit (long maxSize)

全匹配:  public boolean allMatch(Predicate<? super T>predicate)
匹配任意一个:  public boolean anyMatch(Predicate<? super T>predicate)

断言型函数式接口提供如下操作方法:
或操作:default Predicate<T> or (Predicate<? super T>other)
与操作:default Predicate<T> and (Predicate<?super T>other)


结合MapReduce:
数据分析方法:public Optional<T> reduce (BinaryOperator<T>accumulator)