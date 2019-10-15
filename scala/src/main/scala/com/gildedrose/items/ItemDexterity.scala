package com.gildedrose.items

import com.gildedrose.Item

case class ItemDexterity(item: Item) {

  /**
   *
   * @param quality
   * @return
   */
  def decreaseQuality(times: Int): Unit = {
    if (item.quality > 0) {
      item.quality -=  times
    }
  }

  /**
   *
   * @param sellIn
   * @return
   */
  def decreaseSellIn(times: Int): Unit = {
    item.sellIn -= times
  }

  /**
   *
   */
  def update(): Unit = {
    decreaseSellIn(1)
    if (item.sellIn < 0) {
      decreaseQuality(2)
    }
    else {
      decreaseQuality(1)
    }
  }

}
