package com.gildedrose

trait UpdateQuality {
  def updateQuality(item: Item):Unit

  def increaseQuality(item: Item,increaseNumber: Int):Unit = {
    item.quality = item.quality + increaseNumber
  }

  def decreaseQuality(item: Item,decreaseNumber: Int):Unit = {
    item.quality = item.quality - decreaseNumber
  }

  def decreaseSellIn(item: Item): Unit ={
    item.sellIn = item.sellIn - 1
  }
}



