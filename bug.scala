```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => T): T = f(value)
}

object Main extends App {
  val instance = new MyClass(10)
  val result = instance.myMethod(x => x + 1)
  println(result) // Output: 11

  val instance2 = new MyClass("hello")
  val result2 = instance2.myMethod(x => x + " world")
  println(result2) // Compile Error!
}
```