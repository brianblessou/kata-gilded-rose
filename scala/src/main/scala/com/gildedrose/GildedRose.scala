package com.gildedrose

import util.control.Breaks._

class GildedRose(val items: Array[Item]) {

  def updateQuality() {

    for (item <- items) {

      // DO NOTHING
      if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
        print("Sulfuras, Hand of Ragnaros has no action")
      }
      else {

        item.sellIn -= 1

        // ITEM QUALITY MANAGEMENT
        if (item.name.equals("+5 Dexterity Vest")) {
          if (item.quality > 0) {
            item.quality -= 1
          }
        }
        if (item.name.equals("Elixir of the Mongoose")) {
          if (item.quality > 0) {
            item.quality -= 1
          }
        }
        if (item.name.equals("Conjured Mana Cake")) {
          if (item.quality > 0) {
            item.quality -= 1
          }
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
          if (item.quality < 50) {
            item.quality += 1
            if (item.quality < 50) {
              if (item.sellIn < 10){
                item.quality += 1
              }
              if (item.sellIn < 5) {
                item.quality += 1
              }
            }
          }
        }
        if (item.name.equals("Aged Brie")) {
          if (item.quality < 50) {
            item.quality += 1
          }
          if (item.sellIn < 0) {
            if (item.name.equals("Aged Brie")) {
              if (item.quality < 50) {
                item.quality += 1
              }
            }
          }
        }

        if (item.sellIn < 0) {
          if (item.name.equals("+5 Dexterity Vest") || item.name.equals("Elixir of the Mongoose") || item.name.equals("Conjured Mana Cake") || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.name.equals("+5 Dexterity Vest") || item.name.equals("Elixir of the Mongoose") || item.name.equals("Conjured Mana Cake")) {
              if (item.quality > 0) {
                  item.quality -= 1
              }
            }
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
              item.quality = 0
            }
          }
        }
      }
    }
  }
}