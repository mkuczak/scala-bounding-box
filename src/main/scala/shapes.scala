package edu.luc.cs.laufer.cs372.shapes

/**
 * data Shape = Rectangle(w, h) | Location(x, y, Shape)
 */
sealed trait Shape

case class Rectangle(width: Int, height: Int) extends Shape {
  require(width > 0 && height > 0, "Invalid parameters for Rectangle")
}

case class Location(x: Int, y: Int, shape: Shape) extends Shape {
  require(shape != null, "Null shape in Location")
}

case class Group(shapes: Shape*) extends Shape {
  require(shapes != null, "No shapes in Group")
}

case class Ellipse(r1: Int, r2: Int) extends Shape {
  require(r1 > 0 && r2 > 0, "Invalid parameters for Ellipse")
}