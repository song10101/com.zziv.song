package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 14:38
  **/
class outer{
//  def getMsg={
//    //直接访问内部类对象的方法或者属性
//    inner.printMsg1
//    inner.name1
//    //访问内部类中的方法和属性先定义类的对象
//    val obj=new inner
//    obj.printMsg
//    obj.name
//
//  }
  class inner{
    var name:String="from inner class"
  }
  object inner{
    var name1="from inner object"
  }
}
object InnerClassDemo {
  def main(args: Array[String]): Unit = {
    val obj=new outer
    val objinner=new obj.inner
    println(obj.inner.name1)
    println(objinner.name)
//    println(obj.inner.printMsg1)
  }
}
