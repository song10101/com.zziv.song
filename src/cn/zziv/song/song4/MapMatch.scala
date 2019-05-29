package cn.zziv.song.song4

object MapMatch {
//类型擦除,Array除外
  def mapMatch(x:Any)=x match {
    case m1:Map[Int,Int] => println("matched")
    // case m1:Map[String,Int] => println("matched")
    case _ => println("not matched")
  }

  def main(args: Array[String]): Unit = {


//    val map1 = Map("scala"->1,"Java"->2)
//    map1 match {
//      case m1:Map[Int,Int] => println("matched")
//     // case m1:Map[String,Int] => println("matched")
//      case _ => println("not matched")
//    }
    val map2 = Map(1->1)
    mapMatch(map2)
    val map3 = Map("scala"->"spark")
    mapMatch(map3)
    val map4 = Map("scala"->true)
    mapMatch(map4)
  }

}
