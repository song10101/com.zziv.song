package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 15:13
  **/
//闭包，函数体内引用了函数外一个变量，变量和函数就形成一个所谓的闭包
object CoalesFunDemo {
val f1=(x:Int)=>x+100
  val a=100
  val f2=(x:Int)=>x+a

  def main(args: Array[String]): Unit = {
    println(f1(10))
    println(f2(10))

  }
}
