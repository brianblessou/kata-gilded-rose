package com.gildedrose.items

import com.gildedrose.Item

case class ItemBackstage(item: Item) extends ItemInterface(item) {


  /**
   *
   */
  def update(): Unit = {
    decreaseSellIn(1)
    increaseQuality(1)
    if (item.sellIn >= 5 && item.sellIn < 10) {
      increaseQuality(1)
    }
    else if (item.sellIn >= 0 && item.sellIn < 5) {
      increaseQuality(2)
    }
    else if (item.sellIn < 0) {
      item.quality = 0
    }
  }

}
