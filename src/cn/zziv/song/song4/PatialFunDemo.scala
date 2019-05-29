package cn.zziv.song.song4

object PatialFunDemo {
  //参数的数据类型，返回值的数据类型
  //偏函数只有一个参数
  val fun1:PartialFunction[String,String] ={
    case "spark" => "scala"
    case "hadoop" =>"java"
  }

  val fun2:PartialFunction[String,String] ={
    case "kafka" =>"java"
    case "scala" =>"success"
  }

  def main(args: Array[String]): Unit = {

  println(fun1("spark"))
    println(fun1.apply("hadoop"))
    //判断当前的对象在偏函数实现中是否有相应的处理逻辑
    println(fun1.isDefinedAt("spark"))
    println(fun1.isDefinedAt("flink"))
//orElse,把多个偏函数串联，形成一个新的偏函数 ,偏函数的参数类型和返回值类型是一致的
   val  funres = fun1 orElse fun2
//    val funres:PartialFunction[String,String] ={
//      case "spark" => "scala"
//      case "hadoop" =>"java"
//      case "kafka" =>"java"
//    }

    println(funres("spark"))
    println(funres("kafka"))
    println(funres.getClass)
//把多个偏函数连接起来，相当于多个偏函数进行连缀操作
    val funres2 = fun1 andThen fun2
    println(funres2.getClass)
    println(funres2("spark"))


  }

}
