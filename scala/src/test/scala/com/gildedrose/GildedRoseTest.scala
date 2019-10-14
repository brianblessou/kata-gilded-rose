package com.gildedrose

import com.sun.tools.javac.jvm.Items
import org.junit.Assert._

import org.junit.Test


class GildedRoseTest  {


    /*it should "foo" in {
        var items = Array[Item](new Item("foo", 0, 0))
        val app = new GildedRose(items)
        app.updateQuality()
        //(app.items(0).name) should equal ("fixme")
        assertTrue(app.items(0).name == "foo")
      }*/

  var items = Array[Item](
    new Item("+5 Dexterity Vest", 10, 20),
    new Item("Aged Brie", 2, 0),
    new Item("Elixir of the Mongoose", 5, 7),
    new Item("Sulfuras, Hand of Ragnaros", 0, 80),
    new Item("Sulfuras, Hand of Ragnaros", -1, 80),
    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)
    // this conjured item does not work properly yet
    //new Item("Conjured Mana Cake", 3, 6)

  )
  val app = new GildedRose(items)
  //qualityTest()
  @Test
  def testAfterOneDay(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 9, 19),
      new Item("Aged Brie", 1, 1),
      new Item("Elixir of the Mongoose", 4, 6),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50)
      // this conjured item does not work properly yet
     // new Item("Conjured Mana Cake", 2, 5)

    )
    app.updateQuality()

    assertEquals(expectedItems.toList, app.items.toList)




  }

  @Test
  def testAfterTwoDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 8, 18),
      new Item("Aged Brie", 0, 2),
      new Item("Elixir of the Mongoose", 3, 5),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
      new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )
    for (i <- 0 until 2)
    {
      app.updateQuality()
    }
    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterThreeDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 7, 17),
      new Item("Aged Brie", -1, 4),
      new Item("Elixir of the Mongoose", 2, 4),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 12, 23),
      new Item("Backstage passes to a TAFKAL80ETC concert", 7, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 2, 50)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 3)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterFourDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 6, 16),
      new Item("Aged Brie", -2, 6),
      new Item("Elixir of the Mongoose", 1, 3),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 11, 24),
      new Item("Backstage passes to a TAFKAL80ETC concert", 6, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 4)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterFiveDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 5, 15),
      new Item("Aged Brie", -3, 8),
      new Item("Elixir of the Mongoose", 0, 2),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 25),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 5)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterSixDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 4, 14),
      new Item("Aged Brie", -4, 10),
      new Item("Elixir of the Mongoose", -1, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 9, 27),
      new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 6)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterSevenDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 3, 13),
      new Item("Aged Brie", -5, 12),
      new Item("Elixir of the Mongoose", -2, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 8, 29),
      new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -2, 0)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 7)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterEightDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 2, 12),
      new Item("Aged Brie", -6, 14),
      new Item("Elixir of the Mongoose", -3, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 7, 31),
      new Item("Backstage passes to a TAFKAL80ETC concert", 2, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -3, 0)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 8)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterNineDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 1, 11),
      new Item("Aged Brie", -7, 16),
      new Item("Elixir of the Mongoose", -4, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 6, 33),
      new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -4, 0)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 9)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }

  @Test
  def testAfterTenDays(): Unit ={


    var expectedItems = Array[Item](
      new Item("+5 Dexterity Vest", 0, 10),
      new Item("Aged Brie", -8, 18),
      new Item("Elixir of the Mongoose", -5, 0),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 35),
      new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
      new Item("Backstage passes to a TAFKAL80ETC concert", -5, 0)
      // this conjured item does not work properly yet
      // new Item("Conjured Mana Cake", 2, 5)

    )

    for (i <- 0 until 10)
    {
      app.updateQuality()

    }

    assertEquals(expectedItems.toList, app.items.toList)

  }
  @Test
  def testIsAgedBrie(): Unit ={

    assertTrue(app.isAgedBrie(items(1)))
  }

  @Test
  def testIsLegendary(): Unit ={

    assertTrue(app.isLegendary(items(3)))
    assertTrue(app.isLegendary(items(4)))
  }

  @Test
  def testIsBackstage(): Unit ={

    assertTrue(app.isBackstage(items(5)))
    assertTrue(app.isBackstage(items(6)))
    assertTrue(app.isBackstage(items(7)))

  }

  @Test
  def testIncreaseQuality(): Unit ={

    println(items(0).quality)

    app.increaseItemQuality(items(0),2)

    assertTrue(items(0).quality  == 22)

    println(items(0).quality)
  }

  @Test
  def testDecreaseQuality(): Unit ={

    println(items(0).quality)

    app.decreaseItemQuality(items(0),2)

    assertTrue(items(0).quality  == 18)

    println(items(0).quality)
  }








}