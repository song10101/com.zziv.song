package com.zziv.song.song

import scala.util.control.Breaks.{break, breakable}

/**
  * Created by Songts on 2019/5/20
  **/
object BreakCoutinueDemo {
  def main(args: Array[String]): Unit = {
    //条件语句和布尔变量实现countinue，break功能
    for(i <-1 to 10){
      print(i)
    }
    //仅仅打印奇数
    for(i <-1 to 10 if (i%2!=0)){
      print(i)
    }

    //遇到数字5，禁止循环
    var flag=false
    for(i <-1 to 10 if (i%2!=0 && !flag)){
      print(i)
      if (i==5)
        flag=true
    }
    println()
    //breakable分别实现countinue和break功能
    //到5停止  实现Java语法中的break的功能
    breakable {
    for(i<-1 to 10){
      print(i)
      if (i==5)
        break
      }}

    println()
    //遇到5 不打印5  接着打印 实现Java的coun的功能
    for (i<-1 to 10)
      breakable{
        if (i==5){
        break
        }
        print(i)
      }
    println()

    }
}
