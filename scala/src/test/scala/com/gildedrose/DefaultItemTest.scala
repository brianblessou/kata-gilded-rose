package com.gildedrose

import org.scalatest.FunSuite

class DefaultItemTest extends FunSuite {

  test("testUpdate") {
    var siwar = new Item("Siwar", 14, 19)
    var siwarExpected = new Item("Siwar", 13, 18)
    DefaultItem(siwar).update()
    assert(siwar === siwarExpected)
  }
  test("testUpdate after 0") {
    var siwar = new Item("Siwar", 0, 10)
    var siwarExpected = new Item("Siwar", -1, 8)
    DefaultItem(siwar).update()
    assert(siwar === siwarExpected)
  }
  test("testUpdate @ 0") {
    var siwar = new Item("Siwar", 1, 10)
    var siwarExpected = new Item("Siwar", 0, 9)
    DefaultItem(siwar).update()
    assert(siwar === siwarExpected)
  }
}
