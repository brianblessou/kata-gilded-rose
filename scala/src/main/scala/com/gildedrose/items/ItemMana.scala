package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemMana(item: Item) extends ItemInterface(item) {

  /**
   *
   */
  def update(): Unit = {
    decreaseSellIn(1)
    if (item.sellIn < 0) {
      decreaseQuality(3)
    }
    else {
      decreaseQuality(1)
    }
  }

}
