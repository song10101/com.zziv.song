package edu.zziv.song

import util.control.Breaks._
object BreakContinueDemo {

  def main(args: Array[String]): Unit = {
    //条件语句和布尔变量实现continue，break功能
    //仅仅打印奇数
    //遇到数字5，终止循环（break）
//    var flag = false
//    for(i <- 1 to 10 if(i%2!=0 && !flag)){
//      println(i)
//      if(i ==5 )
//        flag = true
//    }

    //breakable分别实现continue 和break功能
    //实现break功能
//    breakable {
//      for (i <- 1 to 10) {
//        println(i)
//        if (i == 5)
//          break
//      }
//    }

//实现的java的continue功能
      for (i <- 1 to 10)
        breakable{
        if (i == 5){
          break
        }
          println(i)
      }


  }

}
