package com.zziv.song.song1
import scala.collection.immutable
import scala.collection.mutable._
/**
  * Created by Songts on 2019/5/21 15:50
  **/
object QueueDemo {
  def main(args: Array[String]): Unit = {
    //构建队列
    val q1=Queue[String]()
    println(q1)
    q1 += "java"
    q1++=List("Scala","Hadoop","python")
    println(q1)
    val res1=q1+="ABC"
    println(res1)
    println(q1.size)
    println(res1.size)

//   // val it=q1.iterator
//    //队头的元素
//    val res2=q1.front
//    println(res2)
//    //去掉第一个元素的后面的元素
//    val res3=q1.tail
//    println(res3)
//    //取队尾
//    println(q1.last)
//    //后面元素的第一个元素
//    println(q1.tail.front)



  }
}
