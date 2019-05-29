package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 20:41
  **/
object LargerDemo {
def largest(fun:(Int)=>Int,inputs:Seq[Int])=inputs.map(fun(_)).max

  def main(args: Array[String]): Unit = {
    var lar=largest(x=>10*x-x*x,1 to 10)
    println(lar)
  }
}
