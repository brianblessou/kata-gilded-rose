package com.gildedrose.items

import com.gildedrose.Item

case class ItemBrie(item: Item) extends ItemInterface(item)  {


  /**
   *
   */
  def update(): Unit = {
    decreaseSellIn(1)
    increaseQuality(1)
    if (item.sellIn < 0) {
      increaseQuality(1)
    }
  }

}
