def reverse(xs: Seq[Int]): Seq[Int] = {
  xs match {
    case Nil => Nil
    case head :: Nil => xs
    case head :: tail => reverse(tail) :+ head
  }
}

reverse(List(1, 2, 3, 4))
