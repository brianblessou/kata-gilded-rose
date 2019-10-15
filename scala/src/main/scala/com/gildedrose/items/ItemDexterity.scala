package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemDexterity(item: Item) extends ItemInterface(item) {


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
    if (item.sellIn < 0) {
      decreaseQuality(2)
    }
    else {
      decreaseQuality(1)
    }
  }

  /**
   *
   */
  override def update(): Unit = {
    super.update()
  }

}
