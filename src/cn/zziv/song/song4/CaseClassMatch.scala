package cn.zziv.song.song4

//样例类匹配
case class Person(name:String,age:Int)
object CaseClassMatch {

  def matchDemo(person:Person)={
    person match {
        //apply 构建样例类对象
      case Person("Tom",20) => println("Tom")
      case Person("Kate",19) => println("Kate")
        //unapply  做对象的属性的提取
      case Person(name,age) =>println(name+":"+age)
      case _ => println("match nothing")
    }
  }

  def main(args: Array[String]): Unit = {
    val p1 = Person("Tom",20)
    matchDemo(p1)
    val p2 = Person("jerry",10)
    matchDemo(p2)

  }

}
