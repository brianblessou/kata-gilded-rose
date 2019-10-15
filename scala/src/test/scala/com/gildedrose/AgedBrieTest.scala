package com.gildedrose

import org.scalatest.FunSuite

class AgedBrieTest extends FunSuite {

  var agedBrie = new Item("Aged Brie", 2, 0)
  var agedBrieExpected1 = new Item("Aged Brie", 1, 1)
  var agedBrieExpected2 = new Item("Aged Brie", -2, 6)
  test("testUpdate") {
    AgedBrie(agedBrie).update()
    assert(agedBrie === agedBrieExpected1)
  }
  test("testUpdate after 0"){
    for(i <- 1 to 3){
      AgedBrie(agedBrie).update()
    }
    assert(agedBrie === agedBrieExpected2)
  }

}
