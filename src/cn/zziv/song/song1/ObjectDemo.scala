package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 14:57
  **/
//单例对象，独立对象
//类似于Java中的单例对象，不能创建单例对象的对象
//单例对象中的方法，类似于Java类的静态方法
object Utils{
  val count=0
  def utilMethod()={
    println("object method")
  }
}
object ObjectDemo {
  def main(args: Array[String]): Unit = {
    println(Utils.count)
    Utils.utilMethod()
  }
}
