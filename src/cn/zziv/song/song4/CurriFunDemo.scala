package cn.zziv.song.song4

//柯里化
//多个参数写成参数列表的形式，
//分布执行的函数
//每一步返回的都是一个函数
object CurriFunDemo {

  def currMethod(x:Int)(y:Int)(z:Int) = x+y+z

  def main(args: Array[String]): Unit = {
    println(currMethod(1)(2)(3))
    val f1 = currMethod(1)_
    println(f1.getClass)
    val f2 = f1(2)
    println(f2)
    println(f2(3))
  }

}
