package cn.zziv.song.song4

object GuardMatch {
//带守卫的模式匹配

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5,6)
    for(elem <- arr)
      elem match {
        case _ if(elem%2 ==0)=>println(elem +"is even")
        case _ => println(elem + "is odd")
      }

  }

}
