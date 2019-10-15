package com.gildedrose

class GildedRose(val items: Array[Item]) {

  def increaseItemQuality(item: Item, increaseNumber: Int): Unit = {

    //increase the quality item by the given number
    item.quality = item.quality + increaseNumber

  }


  def decreaseItemQuality(item: Item, decreaseNumber: Int): Unit = {

    //decrease the quality item by the given number
    item.quality = item.quality - decreaseNumber

  }

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

  def updateBrieQuality(item: Item): Unit ={

    item.sellIn = item.sellIn - 1
    if (item.quality < 50) {
      increaseItemQuality(item, 1)
      if (item.sellIn < 0) {
        increaseItemQuality(item, 1)
      }
    }
  }

  def updateBackstageQuality(item: Item): Unit ={

    item.sellIn = item.sellIn - 1
    if (item.quality < 50) {
      increaseItemQuality(item, 1)
      if (item.quality < 50) {
        if (item.sellIn < 10) {
          increaseItemQuality(item, 1)
        }
        if (item.sellIn < 5) {
          increaseItemQuality(item, 2)
        }
      }
    }
    if (item.sellIn < 0) {
      item.quality = item.quality - item.quality
    }
  }
  def updateRegularObjectQuality(item: Item): Unit ={
    item.sellIn = item.sellIn - 1
    if (item.quality > 0) {
      decreaseItemQuality(item, 1)
      if (item.sellIn < 0) {
        decreaseItemQuality(item, 1)
      }
    }
  }

  def updateConjuredObjectQuality(item: Item): Unit ={
    item.sellIn = item.sellIn - 1
    if (item.quality > 0) {
      decreaseItemQuality(item, 2)
      if (item.sellIn < 0) {
        decreaseItemQuality(item, 2)
      }
    }
  }

  def updateQuality() {
    items.foreach { item =>
      if (isLegendary(item)) {
        print(" ")
      }
      else {
        if (isBackstage(item)) {
          updateBackstageQuality(item)
        }
        else if (isAgedBrie(item)) {
          updateBrieQuality(item)
        }
          else if (isConjured(item)){
          updateConjuredObjectQuality(item)
        }
          else {
          updateRegularObjectQuality(item)
        }
      }
    }
  }
}