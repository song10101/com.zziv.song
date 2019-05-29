package cn.zziv.song.song4

import java.io.PrintWriter

import scala.io.Source

object FileProcessDemo {
  def main(args: Array[String]): Unit = {

    //读文件，按行读取
    val source = Source.fromFile("D:/test.txt")
    //返回文件访问的入口，迭代器
//    val it = source.getLines()
//    for(line <-  it){
//      println(line)
//    }
    //读取字符
//    for(c <- source)
//      println(c)
    //读取单词
//    val words = source.mkString.split(" ")
//    for(word <- words)
//      println(word)
    //读取网络文件
    val source1 = Source.fromURL("http://www.baidu.com")
    for(line <- source1.getLines())
      println(line)
    //写文件
    val writer = new PrintWriter("res.txt")
    for(elem <- Array("scala","spark"))
      writer.println(elem)

    writer.close()


  }

}
