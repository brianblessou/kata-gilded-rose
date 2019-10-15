package com.gildedrose.Items

import com.gildedrose.Traits.UpdateQuality

case class RegularItem(item: Item)
  extends UpdateQuality{


  def updateQuality(): Unit ={
    decreaseSellIn(item)
    if (item.quality > 0) {
      decreaseQuality(item, 1)
      if (item.sellIn < 0) {
        decreaseQuality(item, 1)
      }
    }
  }


}
