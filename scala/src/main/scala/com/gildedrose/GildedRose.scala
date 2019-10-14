package com.gildedrose

class GildedRose(val items: Array[Item]) {

  def increaseItemQuality( item: Item, increaseNumber: Int): Unit ={

    //increase the quality item by the given number
    item.quality += increaseNumber
  }


  def decreaseItemQuality( item: Item, decreaseNumber: Int): Unit ={

    //decrease the quality item by the given number
    item.quality -= decreaseNumber
  }

  def isAgedBrie( item: Item): Boolean ={

    item.name == "Aged Brie"

  }

  def isBackstage( item: Item): Boolean ={

    item.name == "Backstage passes to a TAFKAL80ETC concert"
  }

  def isLegendary( item: Item): Boolean ={

    item.name == "Sulfuras, Hand of Ragnaros"
  }

  def checkItemQuality(index: Int, qualityNumber: Int): Unit ={

  }



  def updateQuality() {
    for (i <- 0 until items.length) {

      if (!isAgedBrie(items(i))
              && !isBackstage(items(i))) {
        if (items(i).quality > 0) {
          if (!items(i).name.equals("Sulfuras, Hand of Ragnaros")) {
            items(i).quality = items(i).quality - 1
          }
        }
      } else {
        if (items(i).quality < 50) {
          items(i).quality = items(i).quality + 1

          if (items(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items(i).sellIn < 11) {
              if (items(i).quality < 50) {
                items(i).quality = items(i).quality + 1
              }
            }

            if (items(i).sellIn < 6) {
              if (items(i).quality < 50) {
                items(i).quality = items(i).quality + 1
              }
            }
          }
        }
      }

      if (!items(i).name.equals("Sulfuras, Hand of Ragnaros")) {
        items(i).sellIn = items(i).sellIn - 1
      }

      if (items(i).sellIn < 0) {
        if (!items(i).name.equals("Aged Brie")) {
          if (!items(i).name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items(i).quality > 0) {
              if (!items(i).name.equals("Sulfuras, Hand of Ragnaros")) {
                items(i).quality = items(i).quality - 1
              }
            }
          } else {
            items(i).quality = items(i).quality - items(i).quality
          }
        } else {
          if (items(i).quality < 50) {
            items(i).quality = items(i).quality + 1
          }
        }
      }
    }
  }
}