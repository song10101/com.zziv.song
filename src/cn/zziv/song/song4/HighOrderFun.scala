package cn.zziv.song.song4

object HighOrderFun {

  //定义方法，返回值是一个函数
  def printFunInfo(name:String,Count:Int): (String,Int)=>Unit ={
    //定义一个匿名函数，实现相应信息的打印
        val name1 = "hh"+name
        val count1 = Count+1
    (name:String,count:Int) => println(s"$name1:$count1$name:$count")
  }

  def main(args: Array[String]): Unit = {
    //传入参数是函数
    val list = List("a","bb","ccc")
    //map List(("",length))
    list.map((x:String)=>(x,x.length))
    list.map(x=>(x,x.length))
    list.foreach(x=>println(x))
    //返回值是函数
    val f1 = printFunInfo("highorder",2)
    println(f1.getClass)
    //返回函数的调用
    f1("highorder",2)

  }

}
