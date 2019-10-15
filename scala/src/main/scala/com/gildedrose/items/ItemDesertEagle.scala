package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemDesertEagle(item: Item) extends ItemInterface(item)  {

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
    decreaseQuality(2)
  }

  /**
   *
   */
  override def update(): Unit = {
    super.update()
  }

}
