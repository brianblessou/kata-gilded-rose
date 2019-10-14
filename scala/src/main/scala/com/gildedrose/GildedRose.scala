package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    for (i <- 0 until items.length) {
      if (!items(i).name.equals("Aged Brie")
        && !items(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (items(i).quality > 0) {
          decreaseSellIn(items(i))
        }
      } else {
        improveBrieOrPass(items(i))
      }

      decreaseSellIn(items(i))

      if (items(i).sellIn < 0) {
        postRedemptionDate(items(i))
      }
    }
  }

  def decreaseSellIn(item: Item) : Item = {
    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.sellIn -= 1
    }
    item
  }

  def improveRegular(item : Item) : Item = {
    if (item.quality < 50) {
      item.quality += 1
    }
    item
  }

  def postRedemptionDate(item : Item) : Item = {
    if (!item.name.equals("Aged Brie")) {
      if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.quality > 0) {
          decreaseSellIn(item)
        }
      } else {
        item.quality = item.quality - item.quality
      }
    } else {
      improveRegular(item)
    }
    item
  }

  def improveBrieOrPass(item: Item): Item = {
    if (item.quality < 50) {
      item.quality += 1

      if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.sellIn < 11) {
          improveRegular(item)
        }

        if (item.sellIn < 6) {
          improveRegular(item)
        }
      }
    }
    item
  }
}