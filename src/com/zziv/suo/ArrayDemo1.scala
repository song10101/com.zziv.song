package com.zziv.suo

/**
  * Created by Songts on 2019/5/20
  **/
object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    //定长数组:数组容量不可变
    val arr=new Array[Int](10)
    val arr2=new Array[Int](10)//前面指定的是数组类型，后面指定的是数组的长度
    //访问数组
    val arr3=Array(10,20,30,40)
    println(arr(1))
    arr2(1)=100
    println(arr2(1))
    //数组遍历
//    for (elem<- arr2)
//      println(elem)
    for (i<-0 until arr3.length){
   println(arr(i))
//      println(arr.sum)
//      println(arr.max)
//      println(arr.sorted.toBuffer)
//      println(arr.sorted.reverse.toBuffer)
//      println(arr.sortWith(_>_).toBuffer)
//      println(arr.sortWith(_<_).toBuffer)
//      println(arr.sortWith((x:Int,y:Int)=>x>y))
      println(arr3(i))
      println(arr3.sum)
      println(arr3.max)
      println(arr3.sortWith((x:Int,y:Int)=>x>y))
    }
  }
}
