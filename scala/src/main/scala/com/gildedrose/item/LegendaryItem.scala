package com.gildedrose.item

import com.gildedrose.Item

class SulfurasItem extends ItemTrait {
  override def updateSellIn(item:  Item): Unit = {
    item.sellIn = item.sellIn
  }

  /**
   * Update the item's quality for the next day
   *
   * @param item store item
   */
  override def updateQuality(item: Item): Unit = {
    // no change in quality
  }
}
