package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemMana(item: Item) extends ItemInterface(item) {

  /**
   *
   */
  def updateQuality(): Unit = {
    if (item.sellIn < 0) {
      decreaseQuality(3)
    }
    else {
      decreaseQuality(1)
    }
  }

  /**
   *
   */
  def updateSellIn(): Unit = {
    decreaseSellIn(1)
  }

}
