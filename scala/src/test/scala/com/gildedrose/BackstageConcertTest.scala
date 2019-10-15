package com.gildedrose

import org.scalatest.FunSuite

class BackstageConcertTest extends FunSuite {
  var concert = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 25)
  var concertExpected1 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 26)
  var concertExpected2 = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 28)
  var concertExpected10 = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 48)
  var concertExpected0 = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0)
  test("BasicUpdate") {
    BackstageConcert(concert).update()
    assert(concert === concertExpected1)
  }
  test("Update=10"){
    BackstageConcert(concert).update()
    assert(concert === concertExpected2)
  }
  test("Update = 5"){
    for(i <- 1 to 8){
      BackstageConcert(concert).update()
    }
    assert(concert === concertExpected10)
  }
  test("Update = < 0"){
    BackstageConcert(concert).update()
    BackstageConcert(concert).update()
    assert(concert === concertExpected0)
  }

}
