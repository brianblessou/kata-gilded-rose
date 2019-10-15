package com.gildedrose.items

import com.gildedrose.Item

case class ItemDexterity(item: Item) extends ItemInterface(item) {


  /**
   *
   */
  def update(): Unit = {
    decreaseSellIn(1)
    if (item.sellIn < 0) {
      decreaseQuality(2)
    }
    else {
      decreaseQuality(1)
    }
  }

}
