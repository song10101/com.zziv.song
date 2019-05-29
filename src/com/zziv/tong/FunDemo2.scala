package com.zziv.tong

/**
  * Created by Songts on 2019/5/20
  **/
object FunDemo2 {
  //函数的定义方法
  val f1=(x:Int,y:Int)=>x*y

  //两个参数，返回值类型为Int
  var f2:(Int,Int)=>Int=(x,y)=>x*y


  def main(args: Array[String]): Unit = {
    f1(2,3)

    val arr=Array(10,20,30)
    val res1=arr.map(_*10)
    val res2=arr.map((x:Int)=>x*10)
 //println(res1:toBuffer)
    //println(res2:toBuffer)

  }
}
