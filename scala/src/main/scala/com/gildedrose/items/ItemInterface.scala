package com.gildedrose.items

import com.gildedrose.Item

abstract class ItemInterface {

  var name: String
  var quality: Int
  var sellIn: Int

  /**
   *
   */
  def update()


  /**
   *
   * @param quality
   * @return
   */
  def increaseQuality(quality: Int, times: Int): Int = {
    if (quality < 50) {
      quality + times
    }
    else quality
  }

  /**
   *
   * @param quality
   * @return
   */
  def decreaseQuality(quality: Int, times: Int): Int = {
    if (quality > 0) {
      quality - times
    }
    else quality
  }


  /**
   *
   * @param sellIn
   * @return
   */
  def increaseSellIn(sellIn: Int, times: Int): Int = {
    sellIn + times
  }

  /**
   *
   * @param sellIn
   * @return
   */
  def decreaseSellIn(sellIn: Int, times: Int): Int = {
    sellIn - times
  }

}
