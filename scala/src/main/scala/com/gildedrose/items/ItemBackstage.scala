package com.gildedrose.items

case class ItemBackstage(var name: String, var quality: Int, var sellIn : Int) extends ItemInterface {


  name = "Backstage passes to a TAFKAL80ETC concert"

  /**
   *
   */
  def update(): Unit = {
    sellIn = decreaseSellIn(sellIn, 1)
    quality = increaseQuality(quality, 1)
    if (sellIn >= 5 && sellIn < 10) {
      quality = increaseQuality(quality, 1)
    }
    else if (sellIn >= 0 && sellIn < 5) {
      quality = increaseQuality(quality, 2)
    }
    else if (sellIn < 0) {
      quality = 0
    }
  }

}
