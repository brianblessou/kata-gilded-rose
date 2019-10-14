package com.gildedrose

class GildedRose(val items: Array[Item]) {
  /**
   * Function that contains the business logic. It set the quality of the given Item depending of the name
   * @param item The item from which we have to set the quality
   */
  def update(item : Item){
    item.name match {
      case "Aged Brie" => AgedBrie(item).update()
      case "Sulfuras, Hand of Ragnaros" => () //Do nothing
      case "Backstage passes to a TAFKAL80ETC concert" => BackstageConcert(item).update()
      case "Conjured" => Conjured(item).update()
      case _ => Entity(item).update()
    }
  }
  /**
   * Function that will update the quality of all the items.
   */
  def updateQuality(){
    items.foreach(item => update(item))
  }
  /*def updateQuality() {
    for (item <- items) {
      if (!item.name.equals("Aged Brie")
        && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.quality > 0) {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1
          }
        }
      } else {
        if (item.quality < 50) {
          item.quality = item.quality + 1

          if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.sellIn < 11) {
              if (item.quality < 50) {
                item.quality = item.quality + 1
              }
            }

            if (item.sellIn < 6) {
              if (item.quality < 50) {
                item.quality = item.quality + 1
              }
            }
          }
        }
      }

      if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
        item.sellIn = item.sellIn - 1
      }

      if (item.sellIn < 0) {
        if (!item.name.equals("Aged Brie")) {
          if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
              if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1
              }
            }
          } else {
            item.quality = item.quality - item.quality
          }
        } else {
          if (item.quality < 50) {
            item.quality = item.quality + 1
          }
        }
      }
    }
  }*/
}