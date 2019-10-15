package com.gildedrose.items

case class ItemSulfuras (var name: String, var quality: Int, var sellIn : Int) extends ItemInterface {


  name = "Sulfuras, Hand of Ragnaros"

  /**
   *
   */
  def update(): Unit = {}
}
