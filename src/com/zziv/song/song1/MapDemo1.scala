package com.zziv.song.song1
import scala.collection.immutable.TreeMap
import scala.collection.mutable._
/**
  * Created by Songts on 2019/5/21 09:50
  **/
object MapDemo1 {
  def main(args: Array[String]): Unit = {
    //map映射
    //scala的键值对
    val map1=Map("xixi"->20,"haha"->21,"yaya"->18,"lala"->19)
    //通过元组形式
    val map2=Map(("xixi"->20),("haha"->21),("yaya"->18),("lala"->19))
    //构建可变map
    val map3=scala.collection.mutable.Map(("xixi"->20),("haha"->21),("yaya"->18),("lala"->19))



    //1、map访问
//    println(map2("xixi"))
//    println(map2("luelue"))
    //2、先判断键是否存在
//    if (map2.contains("xixi1"))
//      println(map2("xixi1"))
    //3、getOrElse主要使用的方法
    println(map2.getOrElse("xixi",0))
    //4、如果存在，返回some，如果不存在返回None
    val res=map2.get("xixi").get
    println(res)
    map3("xixi")=19
    map3("lala")=22
    map3.update("kate",18)
    map3.update("yaya",16)
    map3+=("haha"->22)
    map3++=map2
    map3-=("lala")
    map3--=Array("xixi","yaya")
    for (elem<- map3)
      println(elem)
    for ((k,v)<- map3)
      println(k+":"+v)
    for (k<-map3.keySet)
      println(k+"="+map3(k))

    //hashMap
    val hashMap=HashMap("xixi"->21,"lala"->23)
    println(hashMap.getClass)
    println(hashMap.getOrElse("xixi",0))
    hashMap.put("jia",19)
    hashMap+=(("haha",23))
    println(hashMap)
    hashMap.remove("jia")
    println(hashMap)
    hashMap-="lala"
    println(hashMap)
    hashMap.foreach(println)
    println("-------------------")
    hashMap.foreach((x:(String,Int))=>println(x))
    println("--------------------")
    //treeMap
    val treeMap=TreeMap(2->"JAVA",5->"Hadoop",3->"Scala",1->"Python")
    treeMap.foreach(println)




  }
}
