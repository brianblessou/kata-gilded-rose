package com.gildedrose

import com.gildedrose.items.ItemDexterity

class GildedRose(val items: Array[Item]) {

  /**
   *
   */
  def updateQuality() {

    for (item <- items) {

      ItemFactory.itemManager(item).update()

    }
  }
}