package cn.zziv.song.song4

sealed trait Animal
case class Cat(name:String,age:Int) extends Animal
case class Dog(name:String,age:Int) extends Animal


object SealedClassDemo {
//如果没有列举所有的类型，编译的时候会报一个匹配不完整的信息
  def sealedClassMatch(animal:Animal)= animal match{
    case Cat("xiaohua",2)=>println("cat")
   // case Dog("dahuang",3)=>println("dog")
   // case _ => println("nothing")
  }

  def main(args: Array[String]): Unit = {
    sealedClassMatch(Cat("xiaohua",2))
  }
}
