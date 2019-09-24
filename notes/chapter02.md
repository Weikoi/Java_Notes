
### 常用API概述

---

#### 1.Scanner

nextline() 下一个输入的字符串
nextInt() 下一个输入的整形数


---

Object 中有哪些方法？

Object是所有类的根类，所有类都直接或者间接继承它；

    protected Object clone() 
    创建并返回此对象的副本。  
    
    boolean equals(Object obj) 
    指示一些其他对象是否等于此对象。  
    
    protected void finalize() 
    当垃圾回收器为了确认不再有对该对象的引用时，执行此方法。
      
    类<?> getClass() 
    返回此 Object的运行时类。  
    
    int hashCode() 
    返回对象的哈希码值。  
    
    void notify() 
    唤醒正在等待对象监视器的单个线程。  
    
    void notifyAll() 
    唤醒正在等待对象监视器的所有线程。  
    
    String toString() 
    返回对象的字符串表示形式。  
    
    void wait() 
    导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法。
      
    void wait(long timeout) 
    导致当前线程等待，直到另一个线程调用 notify()方法或该对象的 notifyAll()方法，或者指定的时间已过。  
    
    void wait(long timeout, int nanos) 
    导致当前线程等待，直到另一个线程调用该对象的 notify()方法或 notifyAll()方法，或者某些其他线程中断当前线程，或一定量的实时时间。 


---

#### 2.String，StringBuilder 和 StringBuffer

1)String

String是Java最原始的字符串对象，本质是字符数组，因此构造方法可以传入字符数组；

例如:

    char[] chs = {'H', 'E', 'L', 'L', 'O'};
            
    String s2 = new String(chs);

但是字符串是一种比较特殊的引用数据类型，打印的时候非地址而是保存成的数据；

一般创建字符串对象直接赋值就可以了，将"hello"直接赋值给s1就可以实现初始化；

如：

    String s2 = "HELLO";

但是注意，使用new创建的字符串申请了新的内存，但是将字符串直接赋值用的是原来的内存(方法区的常量池中)，方便字符串的重复使用；

String的常用方法：

判断功能：

    equals
    equalsIgnoreCase
    startsWith
    endsWith

获取功能：

    length()
    charAt
    indexOf
    substring








