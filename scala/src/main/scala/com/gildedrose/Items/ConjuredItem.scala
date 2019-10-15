package com.gildedrose.Items

import com.gildedrose.Traits.UpdateQuality

case class ConjuredItem(item: Item)
  extends UpdateQuality{


  def updateQuality(): Unit ={
    decreaseSellIn(item)
    if (item.quality > 0) {
      decreaseQuality(item, 2)
      if (item.sellIn < 0) {
        decreaseQuality(item, 2)
      }
    }
  }


}
