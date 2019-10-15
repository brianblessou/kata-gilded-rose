package com.gildedrose.items

case class ItemMana(var name: String, var quality: Int, var sellIn : Int) extends ItemInterface {


  name = "Conjured Mana Cake"

  /**
   *
   */
  def update(): Unit = {
    sellIn = decreaseSellIn(sellIn, 1)
    if (sellIn < 0) {
      quality = decreaseQuality(quality, 3)
    }
    else {
      quality = decreaseQuality(quality, 1)
    }
  }

}
