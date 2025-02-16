```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => T): T = f(value)
}

object Main extends App {
  val instance = new MyClass(10)
  val result = instance.myMethod(x => x + 1)
  println(result) // Output: 11

  // Solution 1: Using type constraints
  val instance2 = new MyClass("hello")
  val result2: String = instance2.myMethod(x => x + " world") // Explicit type annotation
  println(result2) // Output: hello world

  //Solution 2: Using a more specific type
  val instance3 = new MyClass[String]("hello")
  val result3 = instance3.myMethod(x => x + " world")
  println(result3) //Output: hello world 
}
```