object Main {
  def add(a:Int,b:Int): Unit = {
    val c=a+b
    println("addition result is " +c)
  }
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    add(10,20)
  }
}