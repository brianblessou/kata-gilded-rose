package com.gildedrose

case class Conjured(item: Item) extends CommonFunction {
  private val QUALITY_DELTA : Int = -2
  def update(){
    if(item.sellIn >= 0) setQualityItem(item, QUALITY_DELTA)
    else setQualityItem(item, QUALITY_DELTA*2)
    setSellIn(item)
  }
}
