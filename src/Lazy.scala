object Lazy extends App {
  /* a variable created with lazy will be initialize when the variable is called*/
  lazy val y = x-1
  lazy val x = 50
  println(y)

  //it doesn't charge anything in memory and less is invoke
  val array = LazyList(1,2,3)
}
