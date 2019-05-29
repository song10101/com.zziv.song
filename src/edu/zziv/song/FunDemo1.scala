package edu.zziv.song

object FunDemo1 {

  //定义方法
  def add(x:Int,y:Int) = {x+y}
//参数列表的形式（柯里化）
  def add1(x:Int)(y:Int) = {x+y}
  //带有默认参数的方法
  def printMsg(msg:String = "scala")= println(msg)
  def add2(x:Int = 2,y:Int = 3,z:Int) = x+y+z
  //可变长参数,可变长参数要是最后一个参数
  def add3(x:Int*) = {
    for (elem <- x)
      println(elem)
  }

  //无参方法
  def printMsg2() =  println("I love scala")
  def printMsg3 =  println("I love scala")

  def main(args: Array[String]): Unit = {
    println(add1(2)(3))
    printMsg()
    printMsg("spark")
    add2(z=10)
    add2(10,z=20)
    add3(10,20,30,40)
    printMsg2()
    printMsg2
  // printMsg3()
    printMsg3
  }

}
