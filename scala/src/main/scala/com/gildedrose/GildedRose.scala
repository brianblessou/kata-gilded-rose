package com.gildedrose

class GildedRose(val items: Array[Item]) {

  def increaseItemQuality( item: Item, increaseNumber: Int): Unit ={

    //increase the quality item by the given number
    item.quality = item.quality + increaseNumber

  }


  def decreaseItemQuality( item: Item, decreaseNumber: Int): Unit ={

    //decrease the quality item by the given number
    item.quality = item.quality - decreaseNumber

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
    items.foreach { item =>


      if (isLegendary(item)) {
        print(" ")
      }
      else {
        if (isAgedBrie(item)
          || isBackstage(item)) {
          if (item.quality < 50) {
            increaseItemQuality(item, 1)

            if (isBackstage(item)) {
              if (item.quality < 50) {
                if (item.sellIn < 11) {
                  increaseItemQuality(item, 1)
                }

                if (item.sellIn < 6) {
                  increaseItemQuality(item, 2)
                }
                if (item.sellIn < 0) {
                  item.quality = item.quality - item.quality
                }

              }
            }
          }

        }

        else {


          if (item.quality > 0) {
            decreaseItemQuality(item, 1)
          }

        }
          item.sellIn = item.sellIn - 1
        if (item.sellIn < 0) {

          if (!isAgedBrie(item)) {
            if (!isBackstage(item)) {
              if (item.quality > 0) {

                  decreaseItemQuality(item, 1)

              }
            }

            else {
              item.quality = item.quality - item.quality
            }
          }

          else {
            if (item.quality < 50) {
              increaseItemQuality(item, 1)
            }
          }
        }
      }
    }
  }
}