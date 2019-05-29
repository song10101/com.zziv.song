package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 14:28
  **/
abstract class Animal{
  var name:String
  val age:Int=1
  def walk:String
}
class Cat extends Animal{
  //var name="cat"
  override var name: String = "cat"

  override def walk: String = "use leg walking"
  override val age: Int = 2
}
object AbstractDemo {
  def main(args: Array[String]): Unit = {
val obj=new Cat
    println(obj.age)
    println(obj.walk)
  }
}
