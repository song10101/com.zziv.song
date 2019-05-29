package cn.zziv.song.tong1

/**
  * Created by Songts on 2019/5/22 19:56
  **/
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val li1=List(10,20,30)
    li1 match {
      case List(1)=>println("从1开始")
      case List(_,2,_)=>println("三个元素，中间数为2")
      case List(_,3)=>println("两个元素，最后一个数为3")
      case _=>println("其他条件")
    }
  }
}
