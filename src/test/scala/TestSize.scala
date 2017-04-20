package edu.luc.cs.laufer.cs372.shapes

import org.scalatest.FunSuite

import TestFixtures._

class TestSize extends FunSuite {

  def testSize(description: String, s: Shape, numb: Int) = {
    test(description) {
      val Number = size(s)
      assert(Number === numb)
    }
  }

  testSize("simple ellipse", simpleEllipse, 1)
  testSize("simple rectangle", simpleRectangle, 1)
  testSize("simple location", simpleLocation, 1)
  testSize("basic group", basicGroup, 2)
  testSize("simple group", simpleGroup, 2)
  testSize("complex group", complexGroup, 5)
}

class TestHeight extends FunSuite {

  def testHeight(description: String, s: Shape, numb: Int) = {
    test(description) {
      val Number = height(s)
      assert(Number === numb)
    }
  }

//  testHeight("simple ellipse", simpleEllipse, 1)
//  testHeight("simple rectangle", simpleRectangle, 1)
//  testHeight("simple location", simpleLocation, 2)
//  testHeight("basic group", basicGroup, 2)
//  testHeight("simple group", simpleGroup, 3)
//  testHeight("complex group", complexGroup, 7)
}

class TestScale extends FunSuite {
  def testScale(description: String, s: Shape, factor: Int, ss: Shape) = {
    test(description) {
      val shape = scale(s, factor)
      assert(shape === ss)
    }
  }
  testScale("simple rectangle", simpleRectangle, 2, simpleRectangleScaled)
  testScale("simple ellipse", simpleEllipse, 5, simpleEllipseScaled)
  testScale("simple location", simpleLocation, 3, simpleLocationScaled)
  testScale("basic group", basicGroup, 3, basicGroupScaled)
  testScale("simple group", simpleGroup, 2, simpleGroupScaled)
  testScale("complex group", complexGroup, 2, complexGroupScaled)
}
