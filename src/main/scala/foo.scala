object foo extends App {
  private def f(a: Int, b: Int): Int = a // b should be detected as unused
  private def unused: Int = 1
  private def g(a: Int, b:Int)  ={ 
    if(b > 4) (2,a) else (2,a) // This is copied from the example of Identical branches
  }
  println(s"${f(1,2)}")
}
