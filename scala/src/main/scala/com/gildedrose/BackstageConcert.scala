package com.gildedrose

case class BackstageConcert(item: Item) extends CommonFunction {
  /**
   * Set the quality value for the Concert type of items
   */
  def update(){
    if(item.sellIn > 10) setQualityItem(item, 1)
    else if (item.sellIn > 5) setQualityItem(item, 2)
    else if (item.sellIn > 0) setQualityItem(item, 3)
    else if (item.sellIn <= 0) item.quality = 0
    setSellIn(item)
  }
}
