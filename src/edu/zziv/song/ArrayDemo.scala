package edu.zziv.song

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Songts on 2019/5/20
  **/
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //定长数组：数组容量不可变
    //    val arr = Array(10,30,1,2,3,4,5)
    //    val arr2 = new Array[Int](10)
    //    //访问数组,修改
    //    println(arr(1))
    //    arr(1)=100
    //    println(arr(1))
    //    //数组的遍历
    //    for(elem <- arr2)
    //      println(elem)
    //    for(i <- 0 until arr.length)
    //      println(arr(i))
    //    //数组的基本方法
    //    println(arr.sum)
    //    println(arr.max)
    //    println(arr.min)
    //    println(arr.sorted.toBuffer)
    //    println(arr.sorted.reverse.toBuffer)
    //    println(arr.sortWith(_>_).toBuffer)
    //    println(arr.sortWith(_<_).toBuffer)
    //    println(arr.sortWith((x:Int,y:Int)=>x>y))
    //变长数组
    val arr2 = ArrayBuffer[String]()
    val arr3 = new ArrayBuffer[Double]()
    println(arr3)
    println(arr3.length)
    //追加元素
    arr2 += "java"
    arr2 += ("scala","python")
    println(arr2)
    //追加集合中的元素
    arr2 ++= Array("c","c++")
    println(arr2)
    //append
    arr2.append("html")
    println(arr2)
    //insert,索引N之前插入多个元素
    arr2.insert(2,"json","xml")
    println(arr2)
    //删除操作
    //从尾部删除n个元素
    arr2.trimEnd(2)
    //从头部删除n个元素
    arr2.trimStart(1)

    arr2.remove(1,2)
    arr2.remove(1)
    println(arr2)
    //定长数组和变长数组的转换
    val arr4 = Array(10,20)
    arr4.toBuffer
    arr2.toArray

    //数组的构建
    //for推导
    //map映射
    val arr5 = Array(10,20,30,40,50)
    val res1 =  for (elem <- arr5) yield elem + 10
    val res2 = arr5.map((x:Int)=>x+10)
    println(res1.toBuffer)
    println(res2.toBuffer)
    val res3 = arr5.filter((x:Int)=>(x%4==0))
    println(res3.toBuffer)

    //定义多维数组
    //定义一个2X2
    val matrix = Array.ofDim[Int](2,2)
    for(i <- 0 to 1;j<- 0 to 1)
      matrix(i)(j)=i*j

    println(matrix(0).toBuffer)

    //定义一个不规则的数组
    val multiArr = new Array[Array[Int]](3)
    multiArr(0) = new Array[Int](3)
    multiArr(1) = new Array[Int](10)
    multiArr(2) = new Array[Int](20)

  }

}
