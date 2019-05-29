package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 15:00
  **/
//student对象的伴生类
class student{
  //类的伴生对象的功能特性并不在类的作用域
  //所以不能直接用newage()调用伴生对象的方法
var agg=student.newage()

}
//叫类student的伴生对象
//定义同一个源文件
//单例对象和类名一致，单例对象成为相应类的伴生对象
object student{
  //var name="张三"
  private var age=20
  //private [this] val gender="女"
  private def newage()={
    age+=1;age
  }
  def main(args: Array[String]): Unit = {
    //相当于Java中的静态方法调用
    println(student.newage())
  }
}
