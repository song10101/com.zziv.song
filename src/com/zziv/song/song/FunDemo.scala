package com.zziv.song.song

/**
  * Created by Songts on 2019/5/20 20:19
  **/
object FunDemo {
  def product(y: String) = {
    var s = 1
    for (i <- 0 until y.length) {
      s = s * Integer.valueOf(y(i))
    }
    println(s)
  }
    def main(args: Array[String]): Unit = {
      val str = ""
      product(str)
    }
  }
