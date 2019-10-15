package com.gildedrose

import com.gildedrose.Items.{AgedBrie, Backstage, ConjuredItem, Item, RegularItem}

class GildedRose(val items: Array[Item]) {

  def isAgedBrie(item: Item): Boolean = {

    item.name == "Aged Brie"

  }

  def isBackstage(item: Item): Boolean = {

    item.name == "Backstage passes to a TAFKAL80ETC concert"
  }

  def isLegendary(item: Item): Boolean = {

    item.name == "Sulfuras, Hand of Ragnaros"
  }

  def isConjured (item: Item): Boolean = {

    item.name == "Conjured Mana Cake"
  }



  def updateQuality() {
    items.foreach { item =>
      if (isLegendary(item)) {
        print(" ")
      }
      else {
        if (isBackstage(item)) {
          Backstage(item).updateQuality()
        }
        else if (isAgedBrie(item)) {
          AgedBrie(item).updateQuality()
        }
          else if (isConjured(item)){
          ConjuredItem(item).updateQuality()
        }
          else {
          RegularItem(item).updateQuality()
        }
      }
    }
  }
}