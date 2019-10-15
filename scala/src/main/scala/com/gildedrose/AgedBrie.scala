package com.gildedrose

case class AgedBrie(item: Item)
extends Item(item.name,item.sellIn,item.quality) with UpdateQuality{


  def updateQuality(item: Item): Unit ={

    decreaseSellIn(item)
    if (item.quality < 50) {
      increaseQuality(item, 1)
      if (item.sellIn < 0) {
        increaseQuality(item, 1)
      }
    }
  }


}
