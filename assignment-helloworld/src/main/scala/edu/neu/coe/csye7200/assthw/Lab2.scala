object Lab2  extends  App {
//
//  val xs = LazyList from 1 map (x => 1.0/x/x)
//
//  val ys:LazyList[Double] = xs.takeWhile(_ > 1E-6)
//
//  println(ys.size)
//
//  val q = ys.sum
//
//  val pi = math.sqrt(6 * q)
//
//  println(s"pi = $pi")

  case class Cicada(next:Int, period:Int) extends (Int => Boolean){

    override def apply(x:Int): Boolean = ((x - next) % period == 0)
  }

  val xix = Cicada(2024, 13)
  val xiv = Cicada(2025, 17)
  val n = 15

  def coemergence(x: Int): Boolean = xix(x) && xiv(x)

  val emergences:List[Int] = LazyList.from(2021).filter(coemergence).take(n).toList

    println(emergences.mkString(","))
}
