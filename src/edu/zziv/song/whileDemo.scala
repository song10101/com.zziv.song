package edu.zziv.song

object whileDemo {

    def main(args: Array[String]): Unit = {
      //实现的集合内容相加
      val arr = Array(10,20,304,40)
      var i = 0
      var sum = 0
//      while (i<arr.length) {
//        sum += arr(i)
//        i += 1
//      }
      //do while
      do {
        sum += arr(i)
        i +=1
      }while(i<arr.length)

      println("sum: "+ sum)
    }

}
