package com.gildedrose.item

import com.gildedrose.{Item, ItemTrait}

case class ConcertItem(item: Item) extends ItemTrait{
  /**
   * Update the item's quality for the next day
   */
  override def updateQuality(): Unit = {
    item.quality = item.sellIn match {
      case sellIn if (sellIn < 0) =>  0
      case sellIn if (sellIn < 6) => cleanUpdateQuality(item.quality, 3)
      case sellIn if (sellIn < 11) => cleanUpdateQuality(item.quality, 2)
      case _ => cleanUpdateQuality(item.quality, 1)
    }
  }

  /**
   * Update the item's "sell in" field for the next day
   */
  override def updateSellIn(): Unit = {
    item.sellIn = item.sellIn - 1
  }
}
