package cn.zziv.song.song1

import scala.util.control.Breaks.{break, breakable}

/**
  * Created by Songts on 2019/5/20
  **/
object BreakCoutinueDemo1 {
  def main(args: Array[String]): Unit = {
    //控制变量到5结束，退出
    breakable{
      for (i<- 1 to 10){
           print(i)
        if (i==5){
          break()
        }
      }
    }
    println()
    println("--------------------------")
    println("--------------------------")
      for (i<- 1 to 10)
        breakable {
          if (i == 5)
            break()
          print(i)
        }
  }
}
