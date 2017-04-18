package edu.luc.cs.laufer.cs372.shapes

// TODO: implement this behavior

object boundingBox {
  def apply(s: Shape): Location = s match {
    case Rectangle(w, h) => Location(0, 0, Rectangle(w, h))
    case Ellipse(r1, r2) => Location(-r1, -r2, Rectangle(2 * r1, 2 * r2))
    case Location(x, y, shape) => {
      val Location(u, v, rect) = apply(shape)
      Location(x + u, y + v, rect)
    }
    case Group(shapes@_*) => {
      val boundingBoxes = shapes.map(shape => apply(shape))
      val xMin = boundingBoxes.map(bBox => bBox.x).min
      val yMin = boundingBoxes.map(bBox => bBox.y).min
      val xMax = boundingBoxes.map {
        case Location(x, y, Rectangle(w, h)) => x + w
        //case Group(shapes) => call itself?
        //I don't know how to do that because I can't do apply Group because this group doesn't have a name
      }.max
      val yMax = boundingBoxes.map {
        case Location(x, y, Rectangle(w, h)) => y + h
      }.max
      val groupWidth = xMax - xMin
      val groupHeight = yMax - yMin
      Location(xMin, yMin, Rectangle(groupWidth, groupHeight))
    }
  }
}