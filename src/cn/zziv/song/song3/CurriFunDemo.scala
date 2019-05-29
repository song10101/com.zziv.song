package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 15:21
  **/
//柯里化
//多个参数写成参数列表的形式
//
object CurriFunDemo {
def currMethod(x:Int)(y:Int)=x+y

  def main(args: Array[String]): Unit = {
    println(currMethod(1)(2))
    val f1=currMethod(1)_
    println(f1.getClass)
    val f2=f1(2)
    println(f2)
    println(f1(2))
  }
}
