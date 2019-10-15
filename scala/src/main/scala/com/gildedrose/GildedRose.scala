package com.gildedrose

import com.gildedrose.items.ItemDexterity

import util.control.Breaks._

class GildedRose(val items: Array[Item]) {

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

  /**
   *
   * @param item
   */
  def updateDexterity(item: Item): Unit = {
    item.sellIn = decreaseSellIn(item.sellIn, 1)
    if (item.sellIn < 0) {
      item.quality = decreaseQuality(item.quality, 2)
    }
    else {
      item.quality = decreaseQuality(item.quality, 1)
    }
  }

  /**
   *
   * @param item
   */
  def updateElixir(item: Item): Unit = {
    item.sellIn = decreaseSellIn(item.sellIn, 1)
    if (item.sellIn < 0) {
      item.quality = decreaseQuality(item.quality, 2)
    }
    else {
      item.quality = decreaseQuality(item.quality, 1)
    }
  }

  /**
   *
   * @param item
   */
  def updateMana(item: Item): Unit = {
    item.sellIn = decreaseSellIn(item.sellIn, 1)
    if (item.sellIn < 0) {
      item.quality = decreaseQuality(item.quality, 3)
    }
    else {
      item.quality = decreaseQuality(item.quality, 1)
    }
  }

  /**
   *
   * @param item
   */
  def updateBrie(item: Item): Unit = {
    item.sellIn = decreaseSellIn(item.sellIn, 1)
    item.quality = increaseQuality(item.quality, 1)
    if (item.sellIn < 0) {
      item.quality = increaseQuality(item.quality, 1)
    }
  }

  /**
   *
   * @param item
   */
  def updateBackstage(item: Item): Unit = {
    item.sellIn = decreaseSellIn(item.sellIn, 1)
    item.quality = increaseQuality(item.quality, 1)
    if (item.sellIn >= 5 && item.sellIn < 10) {
      item.quality = increaseQuality(item.quality, 1)
    }
    else if (item.sellIn >= 0 && item.sellIn < 5) {
      item.quality = increaseQuality(item.quality, 2)
    }
    else if (item.sellIn < 0) {
      item.quality = 0
    }
  }

  /**
   *
   */
  def updateQuality() {

    for (item <- items) {

      // DO NOTHING
      if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
        print("Sulfuras, Hand of Ragnaros has no action")
      }

      else if (item.name.equals("+5 Dexterity Vest")) {
        ItemDexterity(item).update()
      }

      else if (item.name.equals("Elixir of the Mongoose")) {
        updateElixir(item)
      }

      else if (item.name.equals("Conjured Mana Cake")) {
        updateMana(item)
      }

      else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        updateBackstage(item)
      }

      else if (item.name.equals("Aged Brie")) {
        updateBrie(item)
      }

    }
  }
}