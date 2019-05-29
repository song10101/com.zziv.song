package com.zziv.song.song1

/**
  * Created by Songts on 2019/5/21 16:28
  **/
object WordCount {
  def main(args: Array[String]): Unit = {
    val lines=List("hello scala","hello spark","hello hadoop")
    //切分=》(hello,scala,hello,apark.....)
    val words:List[String]=lines.flatMap(_.split(" "))
    //分组转换=》（hello,1）
    val tuple:List[(String,Int)]=words.map((_,1))
    //分组
    val grouped:Map[String,List[(String,Int)]]=tuple.groupBy(_._1)
    grouped.foreach(println)
  //  grouped.mapValues((x:List[(String,Int)]))
    val sum=grouped.mapValues(_.size)
    sum.foreach(println)
    //按单词出现的次数排序
    //List((hello,3).....)
    val res=sum.toList.sortWith(_._2 >_._2)
   // res.foreach(println)





    lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.size).toList.sortWith(_._2>_._2).foreach(println)


  }
}
