package edu.zziv.song

object ForDemo1 {

  def main(args: Array[String]): Unit = {
    // to和until
    //1 to 10 集合（1,2,3，。。。。10）
    //1 until 10 集合（1,2，。。。9）
//    for(i <- 1 to 10)
//      println(i)
//    for(i <- Array(10,20,30))
//      println(i)
//    for (j <- 10 until 20)
//      println(j)
//    //指定 步长
//    for(j <- 10 until 20 by 2)
//      println(j)
//
    //类似java嵌套for循环
//    for (i <- 1 to 5)
//      for(j <- 1 to 5)
//        println(i*10 +j)

    //scala版本
//    for(i <- 1 to 5;j<- 1 to 5)
//      println(i*10+j)

    //带守卫条件（if语句）的for循环
    for(i <- 1 to 5;j<- 1 to 5;if(i != j))
      println(i*10+j)

    //for推导，通过yield，基于一个旧的集合，去构建一个新的集合

    val res = for(i <- Array(1,2,3,4,5)) yield i*10

    println(res.toBuffer)


  }

}
