package com.gildedrose

import org.scalatest.{FlatSpec, Matchers}

class GildedRoseIntegrationTest  extends FlatSpec with Matchers {
  val items = Array[Item](
    new Item("+5 Dexterity Vest", 15, 20),
    new Item("Aged Brie", 15, 20),
    new Item("Sulfuras, Hand of Ragnaros", 15, 20),
    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
  )


  it should "day1" in {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 14, 19),
      new Item("Aged Brie", 14, 21),
      new Item("Sulfuras, Hand of Ragnaros", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 14 , 21)
    )
    val app = new GildedRose(items)
    app.updateQuality()

    app.items.toSeq should equal(itemsExpected.toSeq)
  }
  it should "day5" in {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 10, 15),
      new Item("Aged Brie", 10, 25),
      new Item("Sulfuras, Hand of Ragnaros", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10 , 25)
    )
    val app = new GildedRose(items)
    for(i <- 2 to 5){
      app.updateQuality()
    }

    app.items.toSeq should equal(itemsExpected.toSeq)
  }
  it should "day10" in {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 5, 10),
      new Item("Aged Brie", 5, 30),
      new Item("Sulfuras, Hand of Ragnaros", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5 , 35)
    )
    val app = new GildedRose(items)
    for(i <- 6 to 10){
      app.updateQuality()
    }
    app.items.toSeq should equal(itemsExpected.toSeq)
  }
  it should "day15" in {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 0, 5),
      new Item("Aged Brie", 0, 35),
      new Item("Sulfuras, Hand of Ragnaros", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0 , 50)
    )
    val app = new GildedRose(items)
    for(i <- 11 to 15){
      app.updateQuality()
    }
    app.items.toSeq should equal(itemsExpected.toSeq)
  }
  it should "day20" in {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", -5, 0),
      new Item("Aged Brie", -5, 40),
      new Item("Sulfuras, Hand of Ragnaros", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", -5 , 0)
    )
    val app = new GildedRose(items)
    for(i <- 16 to 20){
      app.updateQuality()
    }
    app.items.toSeq should equal(itemsExpected.toSeq)
  }
}
