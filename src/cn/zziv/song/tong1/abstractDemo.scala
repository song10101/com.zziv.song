package cn.zziv.song.tong1

/**
  * Created by Songts on 2019/5/22 19:34
  **/
abstract class Shape{
  //抽象方法
  def centerPoint()
}
class Rectangle(x:Int,y:Int,z:Int)extends Shape{
  override def centerPoint(): Unit ={
    println(x+y+z)
  }
}
class Circle(x:Int,y:Int) extends Shape{
  override def centerPoint(): Unit ={
    println(x+y)
  }
}
object abstractDemo {
  def main(args: Array[String]): Unit = {
    val re=new Rectangle(1,2,3)
    re.centerPoint()
    //println(re)
    //println(re.centerPoint())
    val ci=new Circle(1,2)
   // println(ci)
    //println(ci.centerPoint())
    ci.centerPoint()
  }
}
