package com.zziv.suo

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Songts on 2019/5/20
  **/
object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    val arr2=ArrayBuffer[String]()
    val arr3=ArrayBuffer[Double]()
    println(arr3)
    println(arr3.length)
    arr2 +="java"
    arr2 +=("scala","python")
    println(arr2)
    println(arr2.length)
    //追加集合中的元素
    arr2++=Array("c","c++")
    println(arr2)
    arr2.append("html")
    println(arr2)
    arr2.insert(2,"json","xml")
    println(arr2)
    //从尾部删除N个元素
    arr2.trimEnd(2)
    //从头部删除N个元素
    arr2.trimStart(1)
    //删除第2个和第三个
    arr2.remove(1,2)
    //删除第2个
    arr2.remove(1)
    println(arr2)

    //定长数组和变长数组的转换
    val arr4=Array(10,20)
    arr4.toBuffer
    arr2.toArray

    //数组的构建
    //for推导
    //map映射
    val arr5=Array(10,20,30,40,50)
    //for推导
    val res1=for (elem<-arr5) yield elem+10
    //map映射
    val res2=arr5.map((x:Int)=>x+10)
    println(res1.toBuffer)
    println(res2.toBuffer)

    //被4整除的数
    val res3=arr5.filter((x:Int)=>(x%4==0))
      println(res3.toBuffer)

    //定义多维数组
    //定义一个2*2
    val matrix=Array.ofDim[Int](2,2)
     for (i<-0 to 1;j<-0 to 1)
       matrix(i)(j)=i*j
    //打印第一行的数组
    println(matrix(0).toBuffer)
    //定义一个不规则的数组,数组中的元素依然是数组
    val multiArr=new Array[Array[Int]](3)
    multiArr(0)=new Array[Int](3)
    multiArr(1)=new Array[Int](10)
    multiArr(2)=new Array[Int](20)

  }
}
