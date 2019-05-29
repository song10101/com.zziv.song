package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 15:19
  **/


class student2{
  var id=0
  private val name="于老板"
  private [this] var age=18
  def getage=age
  def getDe=student2.de
  def getAdress=student2.adress
  def getLive=student2.live
}
object student2{
  private val de="岁的"
  private val adress="中南海"
  private val live="住在"
  def main(args: Array[String]): Unit = {
    val stu=new student2
    stu.id=17
    //println(stu.id)
    print(stu.getage)
    print(stu.getDe)
    print(stu.name)
    print(stu.getLive)
    print(stu.getAdress)
  }

}

object CompanionObjectDemo1 {

}
