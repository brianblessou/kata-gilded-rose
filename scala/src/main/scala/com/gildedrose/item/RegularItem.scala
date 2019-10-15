package com.gildedrose.item

import com.gildedrose.{Item, ItemTrait}


case class RegularItem(item: Item) extends ItemTrait {

  /**
   * Update the item's quality for the next day
   */
  override def updateQuality() {
    if (item.sellIn <= 0)
      item.quality = cleanUpdateQuality(item.quality, -2)
    else
      item.quality = cleanUpdateQuality(item.quality, -1)
  }

  /**
   * Update the item's "sell in" field for the next day
   */
  override def updateSellIn(): Unit = {
    item.sellIn = item.sellIn - 1
  }}
