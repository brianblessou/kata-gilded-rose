package com.gildedrose

import com.gildedrose.factories.ItemFactory
import com.gildedrose.items.Item

class GildedRose(val items: Array[Item]) {

  /**
   *
   */
  def updateQuality() {
    for (item <- items) {
      ItemFactory.itemManager(item).update()
    }

    //items.foreach(item => ItemFactory.itemManager(item).update())
  }

}