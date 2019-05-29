package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 14:48
  **/
//匿名类
abstract class Animal1{
  var name:String
  def skill
}
object NonameClassDemo {
  def main(args: Array[String]): Unit = {
    var dog=new Animal1 {
      override var name: String = "旺财"

      override def skill: Unit =println("咬人")
    }
    println(dog.name)
    dog.skill
  }
}
