package com.zziv.song.song1
import scala.collection.mutable._
/**
  * Created by Songts on 2019/5/21 16:06
  **/
object StackDemo {
  def main(args: Array[String]): Unit = {
    var s1=Stack[Int]()
   s1=s1.+:(10)
    //入栈
    s1.push(20)
    s1.push(30)
    s1.push(50)
    s1.push(100)
    //出栈
    s1.pop()
    val res=s1.top
    println(s1)
    println(res)
  }
}
