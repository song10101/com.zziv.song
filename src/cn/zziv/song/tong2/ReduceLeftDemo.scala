package cn.zziv.song.tong2

/**
  * Created by Songts on 2019/5/24 19:25
  **/
object ReduceLeftDemo {
  def main(args: Array[String]): Unit = {
val a=Array(12,6,15,1,2,20,4,0,9,17)
    var b=a.reduceLeft((x,y)=>if (x>y)x else y)
    println(b)
  }
}
