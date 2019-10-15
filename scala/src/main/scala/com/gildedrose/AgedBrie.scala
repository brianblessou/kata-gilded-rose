package com.gildedrose


case class AgedBrie(item: Item) extends CommonFunction {
    def update(){
      if(item.sellIn > 0){
        setQualityItem(item, 1)
      } else {
        setQualityItem(item, 2)
      }
      setSellIn(item)
    }
}
