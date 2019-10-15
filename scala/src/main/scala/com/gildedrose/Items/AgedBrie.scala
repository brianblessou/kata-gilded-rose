package com.gildedrose.Items

import com.gildedrose.Traits.UpdateQuality

case class AgedBrie(item: Item)
extends AbstractItem(item) with UpdateQuality{


  def updateQuality(): Unit ={

    decreaseSellIn(item)
    if (item.quality < 50) {
      increaseQuality(item, 1)
      if (item.sellIn < 0) {
        increaseQuality(item, 1)
      }
    }
  }


}
