package cn.zziv.song.song4

//方法的嵌套：方法里定义了一个新的方法，然后调用

object MethodInDemo {
//求数学中的阶乘
  def factor(x:Int):Int = {
    //递归返回值类型不能推断
    def fact(x:Int,res:Int):Int={
      if(x <=1 ) res
      else fact(x-1,res*x)
    }
    fact(x,1)
  }

  def main(args: Array[String]): Unit = {
   println( factor(10))
  }

}
