package com.gildedrose

import org.junit.Assert._
import org.junit.Test

class GildedRoseIT {

  val items: Array[Item] = Array[Item](
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

  val app = GildedRose(items)
  def updateNDays(days : Int) {
    for( n <- 0 until days) app.updateQuality()
  }

  @Test
  def validateDay1() {
    val expected_items = Array[Item](
      new Item("+5 Dexterity Vest", 9, 19),
      new Item("Aged Brie", 1, 1),
      new Item("Elixir of the Mongoose", 4, 6),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
      new Item("Conjured Mana Cake", 2, 5)
    )
    // run the program
    updateNDays(1)
    // validate same item list
    assertEquals(expected_items.toList, app.items.toList)
  }

  @Test
  def validateDay2() {
    val expected_items = Array[Item](
      new Item("+5 Dexterity Vest", 8, 18),
      new Item("Aged Brie", 0, 2),
      new Item("Elixir of the Mongoose", 3, 5),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
      new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
      new Item("Conjured Mana Cake", 1, 4)
    )
    updateNDays(2)
    assertEquals(expected_items.toList, app.items.toList)
  }

  @Test
  def validateDay5() {
    val expected_items = Array[Item](
      new Item("+5 Dexterity Vest", 5, 15),
      new Item("Aged Brie", -3, 8),
      new Item("Elixir of the Mongoose", 0, 2),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 25),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
      new Item("Conjured Mana Cake", -2, 0)
    )
    updateNDays(5)
  assertEquals(expected_items.toList, app.items.toList)
  }

  @Test
  def validateDay10() {
    val expected_items = Array[Item](
      new Item("+5 Dexterity Vest", 0, 10),
      new Item("Aged Brie", -8, 18),
      new Item("Elixir of the Mongoose", -5, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 35),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -5, 0),
      new Item("Conjured Mana Cake", -7, 0)
    )
    updateNDays(10)
    assertEquals(expected_items.toList, app.items.toList)
  }

  @Test
  def validateDay20() {
    val expected_items = Array[Item](
      new Item("+5 Dexterity Vest", -10, 0),
      new Item("Aged Brie", -18, 38),
      new Item("Elixir of the Mongoose", -15, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", -5, 0),
      new Item("Backstage passes to a TAFKAL80ETC concert", -10, 0),
      new Item("Backstage passes to a TAFKAL80ETC concert", -15, 0),
      new Item("Conjured Mana Cake", -17, 0)
    )
    updateNDays(20)
    assertEquals(expected_items.toList, app.items.toList)
  }

}