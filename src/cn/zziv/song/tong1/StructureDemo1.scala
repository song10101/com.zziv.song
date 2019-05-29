package cn.zziv.song.tong1

/**
  * Created by Songts on 2019/5/22 19:12
  **/
class Point(x:Int,y:Int){
  override def toString:String="x="+x+"y="+y
}
object Point extends App {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
object StructureDemo1 {
  def main(args: Array[String]): Unit = {
    val p=Point(3,4)
    println(p)
  }
}
