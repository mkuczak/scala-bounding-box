package edu.luc.cs.laufer.cs372.shapes

object size {

  def apply(s: Shape): Int = s match {
    case Rectangle(w, h) => 1
    case Ellipse(r1, r2) => 1
    case Location(x, y, shape) => size(shape)
    case Group(shapes @ _*) => shapes.foldLeft {
      0
    } { case (sum, next) => (sum + size(next))
    }
  }
}

object height {
  def apply(s: Shape): Int = s match {
    case Rectangle(w, h) => 1
    case Ellipse(r1, r2) => 1
    case Location(x, y, shape) => height(shape) + 1
    case Group(shapes @ _*) => shapes.map {
      shape => height(shape)
    }.max
  }
}

object scale {
  def apply(shape: Shape, factor: Int): Shape = shape match {
    case Rectangle(w, h) => Rectangle(factor*w, factor*h)
    case Ellipse(r1, r2) => Ellipse(factor*r1, factor*r2)
    case Location(x, y, s) => Location(factor*x, factor*y, apply(s, factor))
    case Group(shapes @ _*) => Group(shapes.map(s => apply(s, factor)): _*)
  }
}

