package com.gildedrose.item

import com.gildedrose.{Item, ItemTrait}

case class BrieItem(item: Item) extends ItemTrait {

  /**
   * Update for an item that increases in quality like brie
   */
  override def updateQuality(): Unit = {
    if (item.sellIn <= 0) {
      item.quality = cleanUpdateQuality(item.quality, 2)
    }
    else
      item.quality = cleanUpdateQuality(item.quality, 1)
  }

  /**
   * Update the item's "sell in" field for the next day
   */
  override def updateSellIn(): Unit = {
    item.sellIn = item.sellIn - 1
  }}
