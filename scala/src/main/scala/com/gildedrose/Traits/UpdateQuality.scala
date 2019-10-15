package com.gildedrose.Traits

import com.gildedrose.Items.Item

trait UpdateQuality {
  //Méthode à redéfinir dans les classes implémentants le trait
  def updateQuality():Unit
  //Méthode qui augmente la qualité d'un item
  def increaseQuality(item: Item,increaseNumber: Int):Unit = {
    item.quality += increaseNumber
  }
  //Methode qui diminue la qualité d'un item
  def decreaseQuality(item: Item,decreaseNumber: Int):Unit = {
    item.quality -= decreaseNumber
  }
  //Méthode qui diminue le sellIn d'un item
  def decreaseSellIn(item: Item): Unit ={
    item.sellIn -= 1
  }
}
