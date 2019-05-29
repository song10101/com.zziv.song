package com.zziv.song.song1
import scala.collection.immutable._
/**
  * Created by Songts on 2019/5/21 11:31
  **/
object ListDemo1 {
  def main(args: Array[String]): Unit = {
    //列表的构建
    val list1=List("a","b","c","d")
    //空列表
    val empty=Nil
    val list2=List()
    println(list2.getClass)
    val list3="a"::"b"::"c"::Nil
    val list4=("a"::("b"::("c"::Nil)))
    val list5:List[Any]=List("a","b","c",100)
    println(list5.getClass())
    println("+++++++++++++++++++++++++++++++++++++")
    //访问列表
    println(list5(0))
    println("---------------------------------------")
    //遍历
    for (elem<- list5)
      println(elem)
    println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_")
    list5.foreach(println)
    list5.iterator.foreach(println)
    println("=================")
    val res=list5.map((x:Any)=>println)
    res.foreach(println)
    //元素添加
  val list6=List(1,2,3)
    val list7=0::list6
    val list8=list7.::(0)
    val list9=0+:list7
    val list10=list7.+:(0)
    val list11=list7:+3
    val list0=List(4,5,6)
    val list12=list7++list0
    val list13=list7.:::(list0)
    println(list13)
    println("____________________________")


    //列表的拆分和合并
    val List(a,b,c)=List("aa","bb","cc")
    println(a)
    println("+++++++++++++++++++++++++++")
    val res1=list5.splitAt(2)
    //println(res1._1.foreach(println))
    res1._1.foreach(println)



   // list5 take 2
   // list5 take(2)  //取前两个
   // list5.drop(2)
   //list5.dropWhile(_.startsWith("a"))


    var li6=List(10,20,30,40,4,2,4,5,6)
    li6=li6.map((x:Int)=>x+10)

    li6.fold(0)(_+_)
    val li7=List(1,2,3,4,5,6,7,8)
    val res2=li7.fold(10)((x:Int,y:Int)=>x+y)
    val res3=li7.reduce((x:Int,y:Int)=>x+y)
  //  val res4=li7.foldRight(10)(())
    println(res2)
    println(res3)
    var li8=List("abc","cde")

   // val res5:List[Int]=l
println("================")

    var li11=List(1,2,3,4)
    li11.flatMap((x:Int)=>List(x))
    li11.find(_%2==0)
    li11=li11.takeWhile(_%2==0)
    li11.foreach(println)
    println("-----------------")
    //判断集合中所有的元素是否满足某个条件
    val flag=li11.forall(_>10)
    println(flag)


















  }
}
