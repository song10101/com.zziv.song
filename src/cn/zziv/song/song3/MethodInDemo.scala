package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 14:57
  **/
//方法的嵌套：方法里定义了一个新的方法

object MethodInDemo {
  //数学中的递归
def factor(x:Int):Int={
  //递归返回值类型不能推断
  def fact(x:Int,res:Int):Int={
    if(x<=1) res
    else fact(x-1,res*x)
  }
  fact(x,1)
}

  def main(args: Array[String]): Unit = {

  }
}
