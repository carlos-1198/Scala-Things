object ObjectsAndTuples extends App {
  //create tuples
  val tuple1 = (1, "Messi", "PSG", 30, false)
  println(tuple1)
  //create Objects
  case class Player (id:Int, name: String, team: String,
                     number: Int, isTitular: Boolean)

  val player1 = Player(1, "Ronaldo", "Juventus", 7, true)
  println(player1)

  //getting the data in an specific position
  println(tuple1._2)
  println(player1.name)

  //transform class into tuple and vice versa
  println(Player.tupled(tuple1))
  println(Player.unapply(player1))
}
