package cn.zziv.song.tong2

import java.io.File

import scala.io.Source

/**
  * Created by Songts on 2019/5/24 22:02
  **/
object FileDemo1 {

  implicit  class RichFile(from:File){
    def read = Source.fromFile(from.getPath).mkString
  }
  def main(args: Array[String]): Unit = {
    val richFile = new RichFile(new File("D://user.txt"))
    println(richFile.read)
  }
}
