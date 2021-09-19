object PatterMatching extends App {
  def firstPattern(x: Seq[Int]) = x match {
    case List(a, b, c) => a + b + c
    case List(a, b, c, d) => a + b - c + d
    case _ => 0 //_ is default
  }

  println(firstPattern(Seq(1,2,3)))
  println(firstPattern(Seq(1,2,3,4)))

  case class Player (id:Int, name: String, team: String,
                     number: Int, isTitular: Boolean)

  val player1 = Player(1, "Messi", "psg", 30, true)
  val player2 = Player(2, "Ronaldo", "Juventus", 7, true)
  val player3 = Player(3, "Neymar", "Barcelona", 10, true)
  def secondPattern(x: Player) = x match {
    case y if y.isTitular && y.number == 30 &&
      y.team.equalsIgnoreCase("psg")=> "is Titular an is Messi"
    case x if x.isTitular && x.number == 7 &&
      x.team.equalsIgnoreCase("juventus") => "is Titular and is Cristiano"
    case _ => "is not Ronaldo or Messi"
  }
  println(secondPattern(player1))
  println(secondPattern(player2))
  println(secondPattern(player3))

}
