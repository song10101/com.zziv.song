package com.zziv.song.song1

/**
  * Created by Songts on 2019/5/21 11:08
  **/
object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    //构建元组
    val t1=("java","scala",10)
    val t2=new Tuple4("scala",1,2,3)

    //访问
    println(t1._3)
    println(t2._1)


    //通过下表访问
    println(t1.productElement(0))
    //遍历
    for (elem<-t1.productIterator)
      println(elem)
    t1.productIterator.foreach(println)
    //拉链，对集合进行拉链操作，结果元素都是一个元组
    //Zip
    val arr1=Array("java","scala","c++")
    val arr2=Array(1,2,3)
    val res=arr1.zip(arr2).zip(arr2)
    val res1=arr1.zip(arr2)
    res1.foreach(println)
    println("============================")
    val res2=res1.map((x:(String,Int))=>(x._1+"m",x._2))
    res2.foreach(println)





  }
}
