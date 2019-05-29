package cn.zziv.song.song2

/**
  * Created by Songts on 2019/5/21 17:10
  **/
object WordCount1 {
  def main(args: Array[String]): Unit = {
    val str=List("你 好","世 界","你 好","生 活")
//    val sttr:List[String]=str.flatMap(_.split(" "))
//    //分组转换
//    val tuple:List[(String,Int)]=sttr.map((_,1))
//   // tuple.foreach(println)
//    val group:Map[String,List[(String,Int)]]=tuple.groupBy(_._1)
//   // group.foreach(println)
//    val sum=group.mapValues(_.size)
//   // sum.foreach(println)
//    val summing=sum.toList.sortWith(_._2>_._2)
//    summing.foreach(println)
    str.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).mapValues(_.size).toList.sortWith(_._2>_._2).foreach(println)



  }
}
