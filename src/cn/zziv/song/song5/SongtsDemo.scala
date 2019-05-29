package cn.zziv.song.song5
import java.io.File

import scala.actors.{Actor, Future}
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
/**
  * Created by Songts on 2019/5/26 18:22
  **/
object SongtsDemo {
  implicit class RichFile1(file:File){
    def read = Source.fromFile(file).mkString
  }

  object WordCount{
    val wordCount = (from : String) =>{
      val lines:String = new File(from).read
      val words:List[String] = lines.split(" ").toList
      val groups:Map[String,List[String]] = words.groupBy((x:String)=>x)
      val sum:Map[String,Int] = groups.mapValues(_.size)
      sum
    }
  }

  case class InputFile(file:String)

  class MyActor extends Actor{
    override def act(): Unit = {
      loop{
        react{
          case InputFile(file) =>{
            val res:Map[String,Int] = WordCount.wordCount(file)

            sender ! res
          }
        }

      }
    }
  }


  def main(args: Array[String]): Unit = {
    //    定义一个list，里面存三个地址
    val list = List("C:\\Users\\songts\\Desktop\\songts1.txt",
      "C:\\Users\\songts\\Desktop\\songts2.txt",
      "C:\\Users\\songts\\Desktop\\songts3.txt"
    )
    var results = ArrayBuffer[Future[Any]]()
    for (str <- list){
      val actor = new MyActor
      actor.start()
      val result:Future[Any] = actor !! InputFile(str)
      results += result

    }

    val futureToRes = new ArrayBuffer[Map[String, Int]]()

    var bl = true

    while (bl){
      if(results.size == list.size){
        for(res <- results){
          val mapped = res.apply().asInstanceOf[Map[String, Int]]
          futureToRes += mapped
        }
        bl = false
      }
    }
    val ress = futureToRes.flatten.groupBy(_._1).mapValues(_.foldLeft(0)((x,y) => x + y._2))
    println(ress)

  }
}
