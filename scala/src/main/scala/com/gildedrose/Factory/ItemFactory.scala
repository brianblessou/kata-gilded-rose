package com.gildedrose.Factory

import com.gildedrose.Items.{AgedBrie, Backstage, ConjuredItem, Item, LengendaryItem, RegularItem}
import com.gildedrose.Traits.UpdateQuality

case class ItemFactory(item: Item) {

  private final val SULFURA = "Sulfuras, Hand of Ragnaros"
  private final val AGED_BRIE = "Aged Brie"
  private final val BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"
  private final val CONJURED = "Conjured Mana Cake"


  //Factory
  def createItem(): UpdateQuality = {

    item.name match {
      case SULFURA => LengendaryItem(item)
      case AGED_BRIE =>  AgedBrie(item)
      case BACKSTAGE => Backstage(item)
      case CONJURED => ConjuredItem(item)
      case _ => RegularItem(item)
    }

  }

}
