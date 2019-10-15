package com.gildedrose.items

import com.gildedrose.Item

abstract class ItemInterface(item: Item) {

  /**
   *
   */
  def update()

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
   * @param quality
   * @return
   */
  def increaseQuality(times: Int): Unit = {
    if (item.quality < 50) {
      item.quality += times
    }
  }

  /**
   *
   * @param sellIn
   * @return
   */
  def increaseSellIn(times: Int): Unit = {
    item.sellIn += times
  }

}
