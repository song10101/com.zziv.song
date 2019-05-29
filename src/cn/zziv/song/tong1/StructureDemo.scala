package cn.zziv.song.tong1

/**
  * Created by Songts on 2019/5/22 17:45
  **/
class Person(val name:String){
  private [this] val person=name.split(" ")
  val firstName=person(0)
  val lastName=person(1)
}
object StructureDemo {
  def main(args: Array[String]): Unit = {
    val p=new Person("Fred Smith")
    println(p.firstName)
    println(p.lastName)
  }
}
