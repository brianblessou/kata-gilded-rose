package com.gildedrose

trait ItemTrait {

  def update(): Unit ={
    this.updateQuality()
    this.updateSellIn()
  }

  /**
   * Update the item's quality for the next day
   */
  def updateQuality()

  /**
   * Update the item's "sell in" field for the next day
   */
  def updateSellIn()

  /**
   * Updates the quality of the item while keeping it between 0 and 50
   * @param quality item's current quality
   * @param change the change in quality level
   * @return new quality value
   */
  def cleanUpdateQuality(quality: Int, change: Int): Int ={
    Math.min(50, Math.max(0, quality + change)) // 0 <= new quality <= 50
  }
}
