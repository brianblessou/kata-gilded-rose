package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    for (i <- 0 until items.length) {
      if (!items(i).name.equals("Aged Brie")
        && !items(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (items(i).quality > 0) {
          if (!items(i).name.equals("Sulfuras, Hand of Ragnaros")) {
            items(i).quality -= 1
          }
        }
      } else {
        improveBrieOrPass(items(i))
      }

      if (!items(i).name.equals("Sulfuras, Hand of Ragnaros")) {
        items(i).sellIn -= 1
      }

      if (items(i).sellIn < 0) {
        postRedemptionDate(items(i))
      }
    }
  }

  def postRedemptionDate(item: Item) : Item = {
    if (!item.name.equals("Aged Brie")) {
      if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.quality > 0) {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality -= 1
          }
        }
      } else {
        item.quality = item.quality - item.quality
      }
    } else {
      if (item.quality < 50) {
        item.quality += 1
      }
    }
    item
  }

  def improveBrieOrPass(item: Item): Item = {
    if (item.quality < 50) {
      item.quality += 1

      if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.sellIn < 11) {
          if (item.quality < 50) {
            item.quality += 1
          }
        }

        if (item.sellIn < 6) {
          if (item.quality < 50) {
            item.quality += 1
          }
        }
      }
    }
    item
  }
}