package com.gildedrose.items

import com.gildedrose.interfaces.ItemInterface

case class ItemSulfuras(item: Item) extends ItemInterface(item) {

  /**
   *
   */
  def updateSellIn(): Unit= {}

  /**
   *
   */
  def updateQuality(): Unit= {}

  /**
   *
   */
  override def update(): Unit = {
    super.update()
  }
  
}
