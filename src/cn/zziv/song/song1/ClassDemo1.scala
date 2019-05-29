package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 10:09
  **/

//有一个默认的无参构造方法
//自定义构造方法：主构造方法和辅助构造方法
//类名之后定义的构造方法是辅助构造方法
class Person{
  //定义类的属性
  //var 修饰的属性是私有的但是提供了public的get和set方法
  //var修饰的属性可以使用占位符_初始化，但是要指定数据类型
  var name="张三"
  var name1:String=_

  //val 修饰的属性是私有的，但是提供了public修饰的get方法
  //val修饰的属性不可以使用占位符_初始化，
  val age=20
  private var high=180
  private val weight=70
  //对象私有属性 只有在本类中使用 其他类不能使用
  private [this] var hobby="playing"
  private [this] val hobby1="playing"
  def compara(p:Person): Unit ={
    this.age>p.age
    this.high>p.high
    //this.hobby>p.hobby1
  }
  private var _age1=20
  //get
  def age1={
    _age1
  }
  //set
  def age1_(age:Int)={
    if (age>0&&age<120)
      _age1=age
  }
}
object ClassDemo {
  def main(args: Array[String]): Unit = {
    val p1=new Person
    println(p1.name)
    p1.name="李四"
    println(p1.age)
    println(p1.name)

  }
}
