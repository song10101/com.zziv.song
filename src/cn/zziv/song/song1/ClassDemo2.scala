package cn.zziv.song.song1

/**
  * Created by Songts on 2019/5/22 11:05
  **/
//有一个默认的无参构造方法
//自定义构造方法：主构造方法和辅助构造方法
//类名之后定义的构造方法是主构造方法，只能有一个
//类名之后定义的构造方法是辅助构造方法
//主构造方法执行的时候，类中的语句会被执行
//主构造方法里的参数会成为类的属性
//主构造方法可以变成私有的 加private
//辅助构造方法，this
//辅助构造方法里的第一条语句一定要引用主构造方法或者其他辅助构造方法
class Person1 (var name:String,var age:Int){
//  var name=""
//  var age=0
  var sex=0
  var height=0
println("person1")
  //定义辅助构造方法
  def this(sex:Int){
    this("Tom",17)
    this.sex=sex
  }
  def this(name:String,age:Int,height:Int){
    this(name,age)
    this.height=178

  }

}
object ClassDemo2 {
  def main(args: Array[String]): Unit = {
    val person=new Person1("jiajia",18)
    println(person.age)
//    person.age=17
//    person.name="song"
    println(person.name)
    val obj=new Person1("11",22,188)


  }
}
