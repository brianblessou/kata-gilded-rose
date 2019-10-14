package com.gildedrose

class GildedRose(val items: Array[Item]) {


  def updateQuality() {
    for (item <-  items) {
      if (item.name.equals("Aged Brie")
        || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        improveQuality(item)
      } else {
        decreaseQuality(item)
      }

      sellInClosingIn(item)

      if (item.sellIn < 0) {
        postRedemptionDate(item)
      }
    }
  }

  def postRedemptionDate(item: Item) : Item = {
    if (item.name.equals("Aged Brie")) {
      improveRegular(item)
    } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
      item.quality = 0
    } else {
      decreaseQuality(item)
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

  def improveQuality(item: Item): Item = {
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

