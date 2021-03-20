//def third(xs: Seq[Int]): Seq[Int] = xs match {
//  case Nil => Nil
//  case _ :: _ :: tail => tail
//}
//
//
//def drop(xs: Seq[Int])(n: Int): Seq[Int] = xs -> n match {
//  case (Nil, _) => Nil
//  case (ys, 0) => ys
//  case (_ :: tail,m) if m > 0 => drop(tail)(m-1)
//  case _ => throw new RuntimeException("logic error!")
//}
//
//  drop(List(1,2,3,4))(2)
//drop(List(1,2,3,4))(0)
//
//def log[X](x:X)(messageFunction: X => String): X
//
//def xToString[Any](x :Any): String = s"result: $x"
//val x = log(Math.PI*Math.PI)(xToString _)
//
//val logSimple: (Double => Double) = log(_)(xToString)
//val y = logSimple(Math.PI*Math.PI)

//def f(x: Int) = x * x
//f(9)
//def f(x: Int) = {println(x); x*x}
//f(9)
//val y = f(9)
//lazy val z = f(9)
//z + 19
//f{println("hello");9}
//def f(x: => Int) = x * x * x
//f{println("hello");9}
//def f(x:() => Int) = x() * x()
//f{()=>println("hello");9}
//val g = {println(9); 9*9}

//case class Complex(real: Double, imag: Double)
//val z = Complex(1.0,-1.0)
//z match {
//  case Complex(r,i) => println(s"$r+i$i")
//}
//def show(l: List[Int]): String =
//  l match {
//    case Nil => ""
//    case h::t => s"$h,"+show(t)
//}
//
//show(List(1,2,3))

val directory = Map("Alice" -> 3, "Bob" -> 1, "Carol" -> 2)
val names = List("Alice", "Bob", "Carol")
val phones = List(1, 2, 3)

def matchUp(name: String, phone: Int): Option[(String, Int)] = {
  directory.find(_ =="Alice" -> phone)

}

matchUp("Alice", 3)
matchUp("Robin", 2)
matchUp("Alice", 0)
matchUp("", 0)