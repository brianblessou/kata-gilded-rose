package com.gildedrose

protected class GildedRose(val items:Array[Item], val itemTraits: Array[ItemTrait]) {
  def updateQuality() {
    itemTraits.foreach(item => item.update())
  }
}

object GildedRose {
  def apply(items: Array[Item]): GildedRose = {
    new GildedRose(items, items.map(x => ItemFactory.create(x)))
}}
