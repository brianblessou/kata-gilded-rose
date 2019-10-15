package com.gildedrose.items

import com.gildedrose.{CommonFunction, Item}

case class DefaultItem(item: Item) extends CommonFunction {
  /**
   * Set the quality value for the default type of items
   */
  def update(){
    if(item.sellIn > 0) setQualityItem(item, -1)
    else setQualityItem(item, -2)
    setSellIn(item)
  }
}
