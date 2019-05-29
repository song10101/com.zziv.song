package com.zziv.song.song

/**
  * Created by Songts on 2019/5/20
  **/
object WhileDemo1 {
  def main(args: Array[String]): Unit = {
    //实现的集合内容相加
    val arr=Array(10,20,300,4321)
    var i =0
    var sum=0
    while (i<arr.length){
      sum +=arr(i)
      i+=1
  }
    //do while
    print("sum :"+sum)
  }
}
