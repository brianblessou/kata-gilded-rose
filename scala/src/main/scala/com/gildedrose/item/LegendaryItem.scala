package com.gildedrose.item

import com.gildedrose.{Item, ItemTrait}

case class LegendaryItem(item: Item) extends ItemTrait() {
  override def updateSellIn(): Unit = {
    // no change in sell in
  }

  /**
   * Update the item's quality for the next day
   */
  override def updateQuality(): Unit = {
    // no change in quality
  }
}
