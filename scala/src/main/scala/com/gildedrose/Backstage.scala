package com.gildedrose

case class Backstage(item: Item)
  extends Item(item.name,item.sellIn,item.quality) with UpdateQuality{


  def updateQuality(item: Item): Unit ={

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
      item.quality = item.quality - item.quality
    }
  }


}
