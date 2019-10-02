
### Java 基础IO操作

#### 1.FileWriter

FilwWriter对象在进行writer操作后，需要进行flush操作将数据刷新进入文件中，在close方法执行之前会自动执行一次，将缓存自动刷新一次；
第一个参数为文件名位置，第二个参数为是否追加写入；

Windows换行符是\r\n

Linux为\n

Mac为\r

#### 2.FileReader

FileReader对象的read方法每次只读取一个字符，读取到文件结尾，字符识别为-1；

#### 3.BufferedWriter 和 BufferedReader 缓冲流

接收参数为基本流对象，效率更高；


