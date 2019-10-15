package com.gildedrose.items

case class ItemElixir(var name: String, var quality: Int, var sellIn : Int) extends ItemInterface  {


  name = "Elixir of the Mongoose"

  /**
   *
   */
  def update(): Unit = {
    sellIn = decreaseSellIn(sellIn, 1)
    if (sellIn < 0) {
      quality = decreaseQuality(quality, 2)
    }
    else {
      quality = decreaseQuality(quality, 1)
    }
  }
}
