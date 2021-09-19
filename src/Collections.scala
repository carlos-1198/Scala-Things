object Collections extends App{

  //Seq -> sequences
  val firstArray = Seq(1,2,3)
  firstArray.appended(4) // this don't do anything cause is immutable
  println(firstArray)
  // you can assign an adding to an array to another array
  val secondArray = firstArray.appended(4)
  println(secondArray)

  // :+ with a white space before and after can replace .appended
  println(firstArray :+ 4)
  // this do exactly the same as the last line, but is more common
  println(firstArray.:+(4))
  // another way to add to an array
  println(firstArray appended 4)
  // show the data store in the specific position of the array
  println(secondArray(3))

  // Set -> conjunto
  val set1 = Set(1,2,3)
  println(set1)

  //adding to a set
  println(set1.incl(4))
  val set2 = set1.incl(5)
  // another syntax to add
  println(set1 + 5)

  //you can't se the values in the set, just know if an element exist or not in the array
  println(set2(5))

  // to create maps is necessary to introduce an element that contains a couple of elements
  val map1 = Map((1,"barcelona"))
  println(map1)
  //another way to create maps
  val map2 = Map(1 -> "Madrid")
  println(map2)

  // adding a map to another map with more data
  val map3 = map1 + ((2,"Valencia"))
  println(map3)
  //another way to add a map to another map with more data
  val map4 = map1 + (3 -> "PSG")
  println(map4)
  //do operations over the seq or set with map
  println(firstArray.map(parameter => parameter+1))
  println(set2.map(parameter => parameter+1))

  //do operations over the values of the map
  println(map4.view.mapValues(parameter => parameter + "!"))



}
