package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 16:01
  **/
//样例类，系统里面自动升apply unapply hashcode to String
//属性默认使val修饰的，可以访问，不能修改
case class Message(Title:String,From:String,To:String)
case class Message1(var Title:String,From:String,To:String)
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val obj=Message("error message","张三","李四")
    println(obj.From)
    println(obj.To)
    println(obj.Title)
    val obj1=Message1("error message","张三","李四")

  }
}
