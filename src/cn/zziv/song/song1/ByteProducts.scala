package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/20
  **/
object ByteProducts {
  def main(args: Array[String]): Unit = {
    var s:Long=1
    val arr:String="Hello"
    for(i<- 0 until arr.length){
 // println(Integer.valueOf(arr(i)))
s=s*Integer.valueOf(arr(i))
    }
    println(arr.length)
    println(s)
  }
}
