object Functions extends App {
  val array = List(1,2,3,4,5)

  //Declaration of an empty array
  val b = Nil

  //PARTIAL FUNCTIONS
  /*Partial functions will fail in some cases, if you
  * try to use this methods in an empty array for example,
  * the program will break*/
  println(array.head)
  println(array.tail)
  //TOTAL FUNCTIONS
  /*this functions won't break no mather what, if you use it
  in an empty array, they would say the array is empty and the
  program will continue
  * */
  println(array.take(1))
  println(array.drop(1))


  //GENERIC FUNCTIONS
  /*For convention, generic types are declare with an only letter in
  uppercase, between [] and before the parameters of the function
  the s is for concat to an string
  * */
  def genericFunction[A](x:A): String = s"$x"
  println(genericFunction(3600))
  println(genericFunction(true))
  println(genericFunction("hello"))

}
