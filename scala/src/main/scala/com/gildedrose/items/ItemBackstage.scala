package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemBackstage(item: Item) extends ItemInterface(item) {

  /**
   *
   */
  def updateSellIn(): Unit = {
    decreaseSellIn(1)
  }

  /**
   *
   */
  def updateQuality(): Unit = {
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

  /**
   *
   */
  override def update(): Unit = {
    super.update()
  }


}
