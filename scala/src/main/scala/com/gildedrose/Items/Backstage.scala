package com.gildedrose.Items

import com.gildedrose.Traits.UpdateQuality

case class Backstage(item: Item)
  extends AbstractItem(item) with UpdateQuality{


  def updateQuality(): Unit ={

    decreaseSellIn(item)
    if (item.quality < 50) {
      increaseQuality(item, 1)
      if (item.quality < 50) {
        if (item.sellIn < 10) {
          increaseQuality(item, 1)
        }
        if (item.sellIn < 5) {
          increaseQuality(item, 2)
        }
      }
    }
    if (item.sellIn < 0) {
      item.quality = 0
    }
  }


}
