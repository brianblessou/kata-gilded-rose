package com.gildedrose

import com.gildedrose.items.{AgedBrie, BackstageConcert, Conjured, DefaultItem}

case class CreateItem() {
  /**
   * Function that contains the business logic. It set the quality of the given Item depending of the name
   *
   * @param item The item from which we have to set the quality
   */
  def updateItem(item: Item) {
    item.name match {
      case "Aged Brie" => AgedBrie(item).update()
      case "Sulfuras, Hand of Ragnaros" => () //Do nothing
      case "Backstage passes to a TAFKAL80ETC concert" => BackstageConcert(item).update()
      case "Conjured" => Conjured(item).update()
      case _ => DefaultItem(item).update()
    }
  }
}
