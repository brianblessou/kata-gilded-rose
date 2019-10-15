package com.gildedrose

import org.scalatest.FunSuite

class ConjuredTest extends FunSuite {

  test("testUpdate") {
    var item = new Item("Conjured", 10, 10)
    var itemExpected = new Item("Conjured", 5, 0)
    for(i <- 1 to 5){
      Conjured(item).update()
    }
    assert(item === itemExpected)
  }

}
