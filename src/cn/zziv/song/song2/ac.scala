package cn.zziv.song.song2

/**
  * Created by Songts on 2019/5/21 19:52
  **/
object ac {
  def main(args: Array[String]): Unit = {
    val lst = List(1,2,3,4,5);
    print("foreach遍历：")
    lst.foreach { x => print(x+",")}  //foreach遍历,这个是传统遍历，新手不熟无奈之下可以用它
    println("")
  }
}
