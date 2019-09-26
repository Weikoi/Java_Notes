
### 常用的集合对象

#### 1.ArrayList

ArrayList用数组存储元素的，这个数组可以动态创建，如果元素个数超过了数组的容量，那么就创建一个更大的新数组，并将当前数组中的所有元素都复制到新数组中

常用方法:

增删改：

    add
    
    get(index)
    
    remove(index或者elem)
    
    set(index, elem)

查询：
    
    contains(elem)
    
    isEmpty()
    
    size()

    
    



#### 2.LinkedList

实用双端列表实现，实现List和Deque接口, 现在一般的栈和队列都是用LinkedList实现；

增删改：

    add(elem) 末尾追加元素
    
    get(index) 指定位置元素
    
    remove(index或者elem)
    
    set(index, elem)
    
    pop()   模拟弹栈
    
    push(elem)  模拟压栈

查询：
    
    contains(elem)
    
    isEmpty()
    
    size()
    
    indexOf(elem)
    
    peek()




#### 3.HashSet

集合

增删：

    add
    
    remove
    
查：

    size()
    
    contains()
    
    isEmpty()


#### 4.HashMap

键值对, JDK1.8 之前 HashMap 由 数组+链表 组成的，数组是 HashMap 的主体，链表则是主要为了解决哈希冲突而存在的（“拉链法”解决冲突）.JDK1.8 以后在解决哈希冲突时有了较大的变化，当链表长度大于阈值（默认为 8）时，将链表转化为红黑树，以减少搜索时间。

装填因子一般维持在0.75以下，否则存在大量碰撞；超过0.75后需要进行rehash操作，非常消耗资源。


增删改：

    put(k, v)
    
    remove(k)
    
    remove(k, v)
    
 查：
    
    get(k)
 
    containsKey()
    
    containsValue()
    
    isEmpty()
    
    size()


#### 5.
