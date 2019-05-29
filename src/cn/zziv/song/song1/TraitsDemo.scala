package cn.zziv.song.song1

import javax.jws.soap.SOAPBinding.Style

/**
  * Created by Songts on 2019/5/22 11:41
  **/
trait work{
  var hour:Double
  val space="Out"
  def workStyle(style: String):String
  //带有实现的方法
  def workContent={
    println("process data")
  }
  class programmer extends work{
    override def workStyle(style: String): String ="message"
    var hour=8.0
    override def workContent: Unit = println("child implement message")
  }

//  def main(args: Array[String]): Unit = {
//    v
//    println("+++++++++++")
//
//  }
//  class test extends work{
//  var hour=3
//}
}
object TraitsDemo {
  def main(args: Array[String]): Unit = {

  }
}
