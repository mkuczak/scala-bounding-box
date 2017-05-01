package edu.luc.cs.laufer.cs372.shapes

object TestFixtures {

  // TODO comment these fixtures back in after adding the required case classes

  val simpleEllipse = Ellipse(50, 30)
  val simpleEllipseScaled = Ellipse(250, 150)

  val simpleRectangle = Rectangle(80, 120)
  val simpleRectangleScaled = Rectangle(160, 240)

  val simpleLocation = Location(70, 30, Rectangle(80, 120))
  val simpleLocationScaled = Location(210, 90, Rectangle(240, 360))

  val basicGroup = Group(Ellipse(50, 30), Rectangle(20, 40))
  val basicGroupScaled = Group(Ellipse(150, 90), Rectangle(60, 120))

  val simpleGroup =
    Group(
      Location(200, 100,
        Ellipse(50, 30)
      ),
      Location(400, 300,
        Rectangle(100, 50)
      )
    )
  val simpleGroupScaled = Group(
    Location(400, 200, Ellipse(100, 60)),
    Location(800, 600, Rectangle(200, 100))
  )

  val complexGroup =
    Location(50, 100,
      Group(
        Ellipse(20, 40),
        Location(150, 50,
          Group(
            Rectangle(50, 30),
            Rectangle(300, 60),
            Location(100, 200,
              Ellipse(50, 30)
            )
        )),
        Rectangle(100, 200)
    ))
  val complexGroupScaled =
    Location(100, 200,
      Group(
        Ellipse(40, 80),
        Location(300, 100,
          Group(
            Rectangle(100, 60),
            Rectangle(600, 120),
            Location(200, 400,
              Ellipse(100, 60)
            )
          )),
        Rectangle(200, 400)
      ))
}
