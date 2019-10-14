package com.gildedrose

class GildedRose(val items: Array[Item]) {

  def updateQuality() {
    for (item <- items) {
      if (item.name.equals("Sulfuras, Hand of Ragnaros")  || item.name.equals("+5 Dexterity Vest") || item.name.equals("Elixir of the Mongoose") || item.name.equals("Conjured Mana Cake")) {
        if (item.quality > 0) {
          if (item.name.equals("+5 Dexterity Vest") || item.name.equals("Elixir of the Mongoose") || item.name.equals("Conjured Mana Cake")) {
            item.quality-= 1
          }
        }
      } else {
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
      }

      if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
        item.sellIn = item.sellIn - 1
      }

      if (item.sellIn < 0) {
        if (!item.name.equals("Aged Brie")) {
          if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
              if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality-= 1
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
      }
    }
  }
}