package cn.zziv.song.tong2

import java.io.File
import scala.io.Source

/**
  * Created by Songts on 2019/5/24 21:14
  **/
//隐式的增强File类的方法
//class RichFile(val from:File){
//  def read=Source.fromFile(from.getPath).mkString
//}
//object RichFile{
//
//  implicit def file2RichFile(from:File)=new RichFile(from)
//}
//object FileDemo {
//  def main(args: Array[String]): Unit = {
//    //导入隐式转换
//    import RichFile._
//    import RichFile.file2RichFile
//    println(new File("C://Users//songts//Desktop//songts.txt").read)
//  }
//}

