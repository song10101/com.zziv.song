package cn.zziv.song.song4

object OptionDemo {

  def main(args: Array[String]): Unit = {
    val map1 = Map("scala"->"spark","java"->"hadoop")
    map1.get("scala") match {
      case Some(v) => println(v)
      case None => println("no result")
    }

  }

}
