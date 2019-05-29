package cn.zziv.song.song4

object StringInterDemo {

  def main(args: Array[String]): Unit = {
    //s ,字符串里可以引用变量
    val str ="scala"
    println(s"$str is so easy")
    //f,类似于c printf,格式化规则完全一样
    val d = 3.1415926
    println(f"result is $d%3.2f")
    //raw ，对字符串内容不做任何的处理，保持原样输出
    println("scala \"spark\"")
   // println(raw"scala \"")
    println(raw"scala \'spark\'")

    //三引号
    println("""scala "spark" """)
    println(
      """scala
        |is a
        |language
      """.stripMargin)

  }

}
