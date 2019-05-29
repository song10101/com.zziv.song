package com.zziv.song.song1

/**
  * Created by Songts on 2019/5/21 16:23
  **/
object ThreadDemo {
  def main(args: Array[String]): Unit = {
    val arr=1 to 5000
    arr.foreach(println)
    arr.par.foreach(println)
  }
}
