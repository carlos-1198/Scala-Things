object testScalaVariable extends App {
  //var is for mutable variables
  //val is for immutable variables
  //functions aren't mutable.
  //functions in scala (def) return the last line of code
  //parenthesis in def are for just one expression
  //keys {} in def are for multiple expressions
  //object.apply() execute the function that the object contains
  def square(x: Int) = x * x
  val double = (x: Int) => x * x //double is an object

  def addingFour(anotherFunction: Int => Int) = anotherFunction(4)

  def squareWithMultipleParameters(function: Int => Int)(x: Int) = function(x)
  println(square(2))
  println(double(2))
  println(addingFour(double))
  println(squareWithMultipleParameters(square)(5)) //curring, chain parameters
}
