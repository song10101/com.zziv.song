package com.zziv.song.song1

import scala.collection.immutable._

/**
  * Created by Songts on 2019/5/21 15:12
  **/
//无序，元素不重复
object SetDemo {
  def main(args: Array[String]): Unit = {
    var set1=new HashSet[String]()
    //元素追加
    set1= set1 +"ss"
    set1=set1++Set("ss","sb","sd")
    println(set1)

    //构建可变的set
    val set2=scala.collection.mutable.HashSet[Int]()
    set2+=10
    set2.add(20)
    //set2-=10
    //set2.remove(20)
    println(set2(10))//判断一个元素是不是在这个集合中
      //并交差
    val set3=scala.collection.mutable.HashSet[Int]()
    set3 add 30
    set3 add(20)
    val res1=set2.union(set3)
    val res2=set2++set3
    println("============并集============")
    println(res1)
    println(res2)
    //交集
    val res3=set2.intersect(set3)
    val res4=set2 & set3
    println("++++++++++++交集+++++++++++++")
    println(res3)
    println(res4)
    //差集
    val res5=set2.diff(set3)
    val res6=set2 &~ set3
    println("--------差集----------")
    println(res5)
    println(res6)

    //遍历

  }
}
