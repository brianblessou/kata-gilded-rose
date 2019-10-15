package com.gildedrose

import com.gildedrose.item._

object ItemFactory {
  private final val SULFURAS = "Sulfuras, Hand of Ragnaros"
  private final val BRIE = "Aged Brie"
  private final val CONCERT = "Backstage passes to a TAFKAL80ETC concert"

  def create(item: Item): ItemTrait ={
    item.name match {
      case CONCERT => ConcertItem(item)
      case BRIE => BrieItem(item)
      case SULFURAS => LegendaryItem(item)
      case _ => RegularItem(item)
    }
  }

}
