package com.gildedrose.interfaces

import com.gildedrose.items.Item

abstract class ItemInterface(item: Item) {


  /**
   *
   */
  def update()


  /**
   *
   * @param times
   */
  def decreaseQuality(times: Int): Unit = {
    if (item.quality > 0) {
      item.quality -=  times
    }
  }


  /**
   *
   * @param times
   */
  def decreaseSellIn(times: Int): Unit = {
    item.sellIn -= times
  }


  /**
   *
   * @param times
   */
  def increaseQuality(times: Int): Unit = {
    if (item.quality < 50) {
      item.quality += times
    }
  }


  /**
   *
   * @param times
   */
  def increaseSellIn(times: Int): Unit = {
    item.sellIn += times
  }


}
