package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemBrie(item: Item) extends ItemInterface(item)  {

  /**
   *
   */
  def updateSellIn() : Unit = {
    decreaseSellIn(1)
  }

  /**
   *
   */
  def updateQuality(): Unit = {
    increaseQuality(1)
    if (item.sellIn < 0) {
      increaseQuality(1)
    }
  }

  /**
   *
   */
  override def update(): Unit = {
    super.update()
  }

}
