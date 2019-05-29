package cn.zziv.song.song3

/**
  * Created by Songts on 2019/5/24 14:32
  **/
object HighOrderFun {
  def printFunInfo(name:String,Count:Int):(String,Int)=> Unit ={
    val name1="hh"+name
    val count1=Count+1
    (name:String,count:Int)=>println(s"$name1:$count1$name:$count")
  }


  def main(args: Array[String]): Unit = {
    //传入参数是函数
    val list=List("a","bb","ccc")
    //map List(("",length))
    list.map((x:String)=>(x,x.length))

    list.map(x=>(x,x.length))
    list.foreach(x=>println(x))
    //返回值是函数
    val f1=printFunInfo("highorder",2)
    println(f1.getClass)
    f1("highorder",2)

  }
}
