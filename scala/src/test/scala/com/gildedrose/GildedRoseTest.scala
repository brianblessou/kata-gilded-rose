package com.gildedrose

import org.junit.Assert.assertEquals
import com.gildedrose
import com.gildedrose.items.Item
import org.junit.Test

class GildedRoseTest {

  val items = Array[Item](
    new Item("+5 Dexterity Vest", 10, 20),
    new Item("Aged Brie", 2, 0),
    new Item("Elixir of the Mongoose", 5, 7),
    new Item("Sulfuras, Hand of Ragnaros", 0, 80),
    new Item("Sulfuras, Hand of Ragnaros", -1, 80),
    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
    // this conjured item does not work properly yet
    new Item("Conjured Mana Cake", 3, 6)
  )

  val app = new GildedRose(items)

  @Test
  def testAfterOneDay() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 9, 19),
      new Item("Aged Brie", 1, 1),
      new Item("Elixir of the Mongoose", 4, 6),
      new Item("Sulfuras, Hand of Ragnaros",0,80),
      new Item("Sulfuras, Hand of Ragnaros",-1,80),
      new Item("Backstage passes to a TAFKAL80ETC concert",14,21),
      new Item("Backstage passes to a TAFKAL80ETC concert",9,50),
      new Item("Backstage passes to a TAFKAL80ETC concert",4,50),
      new Item("Conjured Mana Cake",2,5)
    )
    app.updateQuality()
    assertEquals(itemsExpected.toList, app.items.toList)
  }

  @Test
  def testAfterTwoDays() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 8, 18),
      new Item("Aged Brie", 0, 2),
      new Item("Elixir of the Mongoose", 3, 5),
      new Item("Sulfuras, Hand of Ragnaros",0,80),
      new Item("Sulfuras, Hand of Ragnaros",-1,80),
      new Item("Backstage passes to a TAFKAL80ETC concert",13,22),
      new Item("Backstage passes to a TAFKAL80ETC concert",8,50),
      new Item("Backstage passes to a TAFKAL80ETC concert",3,50),
      new Item("Conjured Mana Cake",1,4)
    )
    for (i <- 1 to 2) {
      app.updateQuality()
    }
    assertEquals(itemsExpected.toList, app.items.toList)
  }

  @Test
  def testAfterThreeDays() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 7, 17),
      new Item("Aged Brie", -1, 4),
      new Item("Elixir of the Mongoose", 2, 4),
      new Item("Sulfuras, Hand of Ragnaros",0,80),
      new Item("Sulfuras, Hand of Ragnaros",-1,80),
      new Item("Backstage passes to a TAFKAL80ETC concert",12,23),
      new Item("Backstage passes to a TAFKAL80ETC concert",7,50),
      new Item("Backstage passes to a TAFKAL80ETC concert",2,50),
      new Item("Conjured Mana Cake",0,3)
    )
    for (i <- 1 to 3) {
      app.updateQuality()
    }
    assertEquals(itemsExpected.toList, app.items.toList)
  }

  @Test
  def testAfterElevenDays() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", -1, 8),
      new Item("Aged Brie", -9, 20),
      new Item("Elixir of the Mongoose", -6, 0),
      new Item("Sulfuras, Hand of Ragnaros",0,80),
      new Item("Sulfuras, Hand of Ragnaros",-1,80),
      new Item("Backstage passes to a TAFKAL80ETC concert",4,38),
      new Item("Backstage passes to a TAFKAL80ETC concert",-1,0),
      new Item("Backstage passes to a TAFKAL80ETC concert",-6,0),
      new Item("Conjured Mana Cake",-8,0)
    )
    for (i <- 1 to 11) {
      app.updateQuality()
    }
    assertEquals(itemsExpected.toList, app.items.toList)
  }

}