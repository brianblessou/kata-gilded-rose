package com.gildedrose.Traits

import com.gildedrose.Items.Item

trait UpdateQuality {
  def updateQuality():Unit

  def increaseQuality(item: Item,increaseNumber: Int):Unit = {
    item.quality += increaseNumber
  }

  def decreaseQuality(item: Item,decreaseNumber: Int):Unit = {
    item.quality -= decreaseNumber
  }

  def decreaseSellIn(item: Item): Unit ={
    item.sellIn -= 1
  }
}
