package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/20 20:51
  **/
object SwitchDemo {
  def reverse(x:Array[Int]): Unit ={
    for (i<-0 until(x.length-1,2)){
      val t=x(i)
      x(i)=x(i+1)
      x(i+1)=t
    }

  }
  def main(args: Array[String]): Unit = {
    var arr=Array(1,2,3,4,5,6,7,8,9)
    reverse(arr)
    arr.foreach(print)

  }
}
