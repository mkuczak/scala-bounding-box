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
//  testHeight("simple location", simpleLocation, 1)
//  testHeight("basic group", basicGroup, 2)
//  testHeight("simple group", simpleGroup, 3)
//  testHeight("complex group", complexGroup, 7)
}
