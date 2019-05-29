package cn.zziv.song.song5

import cn.zziv.song.tong2.FileDemo1.RichFile

import scala.actors.Actor

/**
  * Created by Songts on 2019/5/25 10:02
  **/
object actor1 extends Actor{
  override def act(): Unit = {
    for(i<- 1 to 10){
      println("actor1:"+i)
      Thread.sleep(1000)
    }
  }
}
object ActorDemo1{

}
