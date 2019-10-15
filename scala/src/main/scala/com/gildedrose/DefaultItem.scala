package com.gildedrose

case class DefaultItem(item: Item) extends Factory {
  /**
   * Set the quality value for the default type of items
   */
  def update(){
    if(item.sellIn >= 0) setQualityItem(item, -1)
    else setQualityItem(item, -2)
    setSellIn(item)
  }
}