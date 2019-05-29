package cn.zziv.song.tong2

/**
  * Created by Songts on 2019/5/24 19:41
  **/
object CircleDemo {
  def de(x:Int)=(0 to x).reduceLeft((a,b)=>if (a==0)1 else (a*b))

  def main(args: Array[String]): Unit = {
  println(de(4))
  }
}
