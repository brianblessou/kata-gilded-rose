package com.gildedrose

import org.junit.Assert.assertEquals
import com.gildedrose
import org.junit.Test

class GildedRoseTest {

  val items = Array[Item](
    new Item("+5 Dexterity Vest", 10, 20),
    new Item("Aged Brie", 2, 0),
    new Item("Elixir of the Mongoose", 5, 7)
  )

  val app = new GildedRose(items)

  @Test
  def testAfterOneDay() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 9, 19),
      new Item("Aged Brie", 1, 1),
      new Item("Elixir of the Mongoose", 4, 6)
    )
    app.updateQuality()
    assertEquals(itemsExpected.toList, app.items.toList)
  }

  @Test
  def testAfterTwoDays() = {
    val itemsExpected = Array[Item](
      new Item("+5 Dexterity Vest", 8, 18),
      new Item("Aged Brie", 0, 2),
      new Item("Elixir of the Mongoose", 3, 5)
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
      new Item("Elixir of the Mongoose", 2, 4)
    )

    for (i <- 1 to 3) {
      app.updateQuality()
    }

    assertEquals(itemsExpected.toList, app.items.toList)
  }


}