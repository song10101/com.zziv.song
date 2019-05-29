package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 15:04
  **/
//方法的多态：方法的参数的类型参数化
object MultiMethodDemo {
  //构建一个列表，列表的元素类型是多样化
def listDup[A](x:A,len:Int):List[A]={
    if (len<1)
      Nil
      else
      x::listDup(x,len-1)
    }

  def main(args: Array[String]): Unit = {
    println(listDup(2,2))
    println(listDup(5,3))

  }
}
