object Option extends App {
  val variableOne = Some(5)
  val variableTwo = None

  println(variableOne.value)
  println(variableTwo)

  val list = List(1,2,3,4,5)
  println(list.find(x => x == 3))
  println(list.find(x => x == 58))

  // "_" is the same than writing x => x
  println(list.find(x => x == 4).map(_+2))
  println(list.find(x => x == 48).map(_+2))

  /*headOption returns an Option with the first element of the array inside
  * flatmap help us to have just one option, in this case, the function to execute
  * after finding the element is return in an option, so we would have an option
  * inside another option(with map), but with flatmap we would have only one option
  * with the final response inside */
  val result = list.find(x => x == 2).flatMap(y => list.headOption.map(x => x+y))
  /*getOrElse is used to obtain the value of the option without getting and error
  * in case the value of the option is none, if the option has a none inside then it
  * should return the value you put in the method*/
  println(result.getOrElse(0))
}
