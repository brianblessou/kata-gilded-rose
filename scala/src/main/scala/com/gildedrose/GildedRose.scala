package com.gildedrose

import com.gildedrose.Factory.ItemFactory
import com.gildedrose.Items.{AgedBrie, Backstage, ConjuredItem, Item, RegularItem}

class GildedRose(val items: Array[Item]) {

  def updateQuality() {
    items.foreach { item =>
     ItemFactory(item).createItem().updateQuality()

    }
  }
}