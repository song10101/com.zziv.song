package cn.zziv.song.song4

object PartialAppFunDemo {

  def printMsg(name:String,gender:Int) ={
    println(name+":"+gender)
  }

  def main(args: Array[String]): Unit = {
    val res = printMsg(_:String,1)
    println(res.getClass)
    res("tom")
    res("jerry")

  }

}
