package com.gildedrose.items

case class ItemBrie(var name: String, var quality: Int, var sellIn : Int) extends ItemInterface  {


  name = "Aged Brie"

  /**
   *
   */
  def update(): Unit = {
    sellIn = decreaseSellIn(sellIn, 1)
    quality = increaseQuality(quality, 1)
    if (sellIn < 0) {
      quality = increaseQuality(quality, 1)
    }
  }

}
