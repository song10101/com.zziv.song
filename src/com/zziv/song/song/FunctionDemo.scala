package com.zziv.song.song

/**
  * Created by Songts on 2019/5/20
  **/
object FunctionDemo {
//定义方法
  def add(x:Int,y:Int):Int=x+y
//参数列表的形式（柯里化）
  def add1(x:Int,y:Int):Int=x+y
  //带有默认参数的方法
def printMessage(msg:String="scala")=println(msg)
  def add2(x:Int=2,y:Int=3,z:Int):Int=x+y+z
  //可变长度,可变长参数是最后一个参数

  //无参构造
  def printMesaage2()=println("scala spark")





  def main(args: Array[String]): Unit = {
    var a=10
    var b=20
    var c:Float=add(a,b).toFloat
    println(c)
/*println(add1(2,3))
    printMessage("spark")
    add2(z=10)
 add2(10,z=20)*/
    printMesaage2()
  }
}
