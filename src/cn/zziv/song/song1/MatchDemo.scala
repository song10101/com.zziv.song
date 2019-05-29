package cn.zziv.song.song1

import scala.util.Random

/**
  * Created by Songts on 2019/5/22 16:12
  **/
object MatchDemo {
  //常量模式匹配


  def main(args: Array[String]): Unit = {
    //常量匹配
//    val x="scala"
//    x match {
//      case "spark"=>println("spark")
//      case "scala"=>println("匹配成功啦")
//      case "10" =>println("number")
//      case _=>println("match nothing")
//    }
    //匹配不同类型
    val list=List("scala",'c',100,true)
    var res=list(Random.nextInt(4))
//    res match {
//      case "scala"=>println("string")
//      case 100=>println("number")
//      case true=>println("boolean")
//      case _=>println("nothing")
//    }

    //变量匹配
  //  怎么确定你定义的是不是变量:当定义的变量字母是小写就是变量，当字母是大写的就不是变量
    val A=10
    res match {
      case "xixi"=>println("string")
      case A=>println(A)
      case _=>println("nothing")
    }


    val a=10
    res match {
      case "xixi"=>println("string")
      case a=>println(a)
      case _=>println("nothing")
    }

    var tuple=(10,"ss",true)
    tuple match {
      //匹配三个元素
      //case (a,b,c)=>println("three elems")
        //匹配第一个是10的元组
//      case (10,a,b)=>println("head 10")
      //case (10,_,_)=>println("head 10 2")
      case List(10,_*)=>println("found it")

      case _=>println("match nothing")
    }

    //列表的匹配
    val list2=List(10,20,30)
    list2 match {
      case 10::Nil=>List(10)
      case x::y::z::Nil=>List(10,2,3)
        //匹配至少含有一个元素的列表 head+tail
      case x::tail=>List(10,2)
    }

    //数组的匹配
    val arr=Array("aa","bb")
    arr match {
      case Array(x)=>"one elem"
      case Array("aa")=>"aa"
        //匹配多个数组
      case Array("aa",_*)=>"multi elem"
    }
    //类型匹配
    val list1=List("String",true,100,'f')
    val obj=list1(Random.nextInt(4))
    obj match {
      case x:Int=>println("Int")
      case y:String=>println("String")
      case z:Boolean=>println("boolean")
      case _=>println("match nothing")
    }

  }
}
