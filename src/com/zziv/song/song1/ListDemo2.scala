package com.zziv.song.song1

import scala.collection.mutable.ListBuffer

/**
  * Created by Songts on 2019/5/21 15:06
  **/
object ListDemo2 {

  //可变列表
  def main(args: Array[String]): Unit = {
    val list1=ListBuffer[String]()
    list1+="scala"
    list1.append("spark","flink")
    list1++=List("a")
    println(list1(0))

  }
}
