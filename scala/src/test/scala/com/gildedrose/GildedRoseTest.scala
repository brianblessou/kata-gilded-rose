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
    //assertEquals(true , true)
    //assertTrue(app.items(0).name == "+5 Dexterity Vest")
    println(app.items(0).quality)
   // assertTrue(app.items(0).quality == 20)
    app.updateQuality()

    assertEquals(expectedItems.toList, app.items.toList)




  }




}