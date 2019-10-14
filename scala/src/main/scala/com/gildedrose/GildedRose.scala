package com.gildedrose

import util.control.Breaks._

class GildedRose(val items: Array[Item]) {

  /**
   *
   * @param quality
   * @return
   */
  def increaseQuality(quality: Int): Int = {
    if (quality < 50) {
      quality + 1
    }
    else quality
  }

  /**
   *
   * @param quality
   * @return
   */
  def decreaseQuality(quality: Int): Int = {
    quality - 1
  }

  /**
   *
   * @param sellIn
   * @return
   */
  def increaseSellIn(sellIn: Int): Int = {
    sellIn + 1
  }

  /**
   *
   * @param sellIn
   * @return
   */
  def decreaseSellIn(sellIn: Int): Int = {
    sellIn - 1
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
      else {

        item.sellIn = decreaseSellIn(item.sellIn)


        // ITEM QUALITY MANAGEMENT
        if (item.name.equals("+5 Dexterity Vest")) {

          if (item.quality > 0) {
            item.quality = decreaseQuality(item.quality)
          }
          
          if (item.quality > 0 && item.sellIn < 0) {
            item.quality = decreaseQuality(item.quality)
          }

        }


        if (item.name.equals("Elixir of the Mongoose")) {

          if (item.quality > 0) {
            item.quality = decreaseQuality(item.quality)
          }

          if (item.quality > 0 && item.sellIn < 0) {
            item.quality = decreaseQuality(item.quality)
          }

        }


        if (item.name.equals("Conjured Mana Cake")) {

          if (item.quality > 0) {
            item.quality = decreaseQuality(item.quality)
          }

          if (item.quality > 0 && item.sellIn < 0) {
              item.quality = decreaseQuality(item.quality)
          }

        }


        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          item.quality = increaseQuality(item.quality)

          if (item.sellIn < 10) {
            item.quality = increaseQuality(item.quality)
          }
          if (item.sellIn < 5) {
            item.quality = increaseQuality(item.quality)
          }
          if (item.sellIn < 0) {
            item.quality = 0
          }

        }


        if (item.name.equals("Aged Brie")) {

          item.quality = increaseQuality(item.quality)

          if (item.sellIn < 0) {
            item.quality = increaseQuality(item.quality)
          }

        }


      }
    }
  }
}