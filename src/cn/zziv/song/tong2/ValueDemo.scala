package cn.zziv.song.tong2

/**
  * Created by Songts on 2019/5/24 17:43
  **/

object ValueDemo {
    def value(fun:(Int)=>Int,low:Int,high:Int):List[(Int,Int)] ={
var va=List[(Int,Int)]()
      for (i<- low to high){
        va= (i,fun(i))::va
      }
      return va
    }

  def main(args: Array[String]): Unit = {
    println(value(x=>x*x,-5,5))
  }
}
