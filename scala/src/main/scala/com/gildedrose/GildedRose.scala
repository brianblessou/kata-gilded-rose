package com.gildedrose

import com.gildedrose.items.{AgedBrie, BackstageConcert, Conjured, DefaultItem}

class GildedRose(val items: Array[Item]) {


  /**
   * Function that will update the quality of all the items.
   */
  def updateQuality() {
    items.foreach(item => CreateItem().updateItem(item))
  }
}