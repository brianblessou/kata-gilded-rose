package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    for (i <- 0 until items.length) {
      if (!items(i).name.equals("Aged Brie")
        && !items(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          decreaseQuality(items(i))
      } else {
        improveBrieOrPass(items(i))
      }

      sellInClosingIn(items(i))

      if (items(i).sellIn < 0) {
        postRedemptionDate(items(i))
      }
    }
  }

  def postRedemptionDate(item: Item) : Item = {
    if (!item.name.equals("Aged Brie")) {
      if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          decreaseQuality(item)
      } else {
        item.quality = 0
      }
    } else {
      improveRegular(item)
    }
    item
  }

  def improveRegular(item : Item): Item = {
    if (item.quality < 50) {
      item.quality += 1
    }
    item
  }

  def decreaseQuality(item : Item) : Item = {
    if (item.quality > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.quality -= 1
    }
    item
  }
  def sellInClosingIn(item : Item) : Item = {
    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
      item.sellIn -= 1
    }
    item
  }

  def improveBrieOrPass(item: Item): Item = {
    if (item.quality < 50) {
      item.quality += 1
      improveBoostedPass(item)
    }
    item
  }

  def improveBoostedPass(item : Item): Item = {
    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
      if (item.sellIn < 11) {
        improveRegular(item)
      }

      if (item.sellIn < 6) {
        improveRegular(item)
      }
    }
    item
  }
}

