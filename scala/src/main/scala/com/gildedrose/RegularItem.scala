package com.gildedrose

case class RegularItem(item: Item)
  extends Item(item.name,item.sellIn,item.quality) with UpdateQuality{


  def updateQuality(item: Item): Unit ={
    decreaseSellIn(item)
    if (item.quality > 0) {
      decreaseQuality(item, 1)
      if (item.sellIn < 0) {
        decreaseQuality(item, 1)
      }
    }
  }


}
