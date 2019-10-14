package com.gildedrose

class GildedRose(val items: Array[Item]) {

  def updateQuality() {
    for (obj <- items) {
      if (!obj.name.equals("Aged Brie")  && !obj.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (obj.quality > 0) {
          if (!obj.name.equals("Sulfuras, Hand of Ragnaros")) {
            obj.quality = obj.quality - 1
          }
        }
      } else {
        if (obj.quality < 50) {
          obj.quality = obj.quality + 1

          if (obj.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (obj.sellIn < 11) {
              if (obj.quality < 50) {
                obj.quality = obj.quality + 1
              }
            }

            if (obj.sellIn < 6) {
              if (obj.quality < 50) {
                obj.quality = obj.quality + 1
              }
            }
          }
        }
      }

      if (!obj.name.equals("Sulfuras, Hand of Ragnaros")) {
        obj.sellIn = obj.sellIn - 1
      }

      if (obj.sellIn < 0) {
        if (!obj.name.equals("Aged Brie")) {
          if (!obj.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (obj.quality > 0) {
              if (!obj.name.equals("Sulfuras, Hand of Ragnaros")) {
                obj.quality = obj.quality - 1
              }
            }
          } else {
            obj.quality = obj.quality - obj.quality
          }
        } else {
          if (obj.quality < 50) {
            obj.quality = obj.quality + 1
          }
        }
      }
    }
  }
}