package cn.zziv.song.song2

/**
  * Created by Songts on 2019/5/21 19:32
  **/
object JobDemo {
  def main(args: Array[String]): Unit = {
    var list1=List[Int]()
    //list1.foreach(println)

     for (i<- 0 to 4)
    list1=i::list1
    list1.foreach(print)
    println()
    //list1.map((x:Int)=>x*2)
    var list2=list1.map(_*2)
    list2.foreach(print)
    println()
    var list3=list1.filter(_%2==0)
    list3.foreach(print)
    println()
    //正序排序
   // var list4=list1.sorted
    var list4=list1.sortWith(_<_)
    list4.foreach(print)
    println()
    var list5=list1.reverse
    list5.foreach(print)
    println()
//    list1=list1.reverse
//    list1.foreach(print)
    var list6=list1.grouped(5).toList
    list6.foreach(print)
    println()
//    val list7=List("Java int","Scala Int","Hadoop HA","Spark SS","Python def")
//    var list8=list7.flatten
//    list8.foreach(print)
//    println()
    //将多个list压扁成一个list
    val list7=List(List("aa bb","cc dd"),List("ee ff","gg hh"))
    val list8=list7.flatten
    //先按空格切分，再压平
    val list9=list8.flatMap((x:String)=>x.split(" "))
//    val list10=list9.flatten
//    list10.foreach(print)
    list9.foreach(print)
    println()
    //求最大值
    val max=list1.max
    val max1=list1.foldLeft(list1(0))((x:Int,y:Int)=>if (x>y) x else y)

//    val list11=list7.reduceLeft(_+_)
//    list11.foreach(print)
//    println()
//
//    val list12=list7.reduce(_+_)
//    list12.foreach(print)
//    println()
//
//    val list13=list7.par.reduce(_+_)
//    list13.foreach(print)
//    println()
    //单线程聚合
    val agrr=list1.aggregate(0)((y:Int,z:Int)=>z+y,(w:Int,v:Int)=>w+v)
    val arr=Array(1,2,3,4,5,6,7,8,9)
    val res = arr.aggregate((0, 0))(
      (acc, num) => (acc._1 + num, acc._2 + 1),
      (par1, par2) => (par1._1 + par2._1, par1._2 + par2._2)
    )
    val li1=List(1,2,3,4,5,6,7,8)
    val li2=List(4,5,6,7,8,9,10,11)
    val res1=li1 union li2
       res1.foreach(print)
    println()

    val res2=li1 intersect li2
    res2.foreach(print)
    println()

    val  res3=li1 diff li2
    res3.foreach(print)
    println()








  }
}
