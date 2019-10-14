package com.gildedrose

import org.scalatest._

class GildedRoseTest  extends FlatSpec with Matchers {
      it should "foo" in {
        val items = Array[Item](
          new Item("+5 Dexterity Vest", 15, 20),
          new Item("Aged Brie", 15, 20),
          new Item("Sulfuras, Hand of Ragnaros", 15, 20),
          new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
        )

        val app = new GildedRose(items)
        //DAY 1
        val day1Item1 = new Item("+5 Dexterity Vest", 14, 19)
        val day1Item2 = new Item("Aged Brie", 14, 21)
        val day1Item3 = new Item("Sulfuras, Hand of Ragnaros", 15, 20)
        val day1Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", 14 , 21)

        //DAY 5
        val day5Item1 = new Item("+5 Dexterity Vest", 10, 15)
        val day5Item2 = new Item("Aged Brie", 10, 25)
        val day5Item3 = new Item("Sulfuras, Hand of Ragnaros", 15, 20)
        val day5Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", 10 , 25)
        //day 10
        val day10Item1 = new Item("+5 Dexterity Vest", 5, 10)
        val day10Item2 = new Item("Aged Brie", 5, 30)
        val day10Item3 = new Item("Sulfuras, Hand of Ragnaros", 15, 20)
        val day10Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", 5 , 35)
        //day 15
        val day15Item1 = new Item("+5 Dexterity Vest", 0, 5)
        val day15Item2 = new Item("Aged Brie", 0, 35)
        val day15Item3 = new Item("Sulfuras, Hand of Ragnaros", 15, 20)
        val day15Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", 0 , 50)
        //day 20
        val day20Item1 = new Item("+5 Dexterity Vest", -5, 0)
        val day20Item2 = new Item("Aged Brie", -5, 45)
        val day20Item3 = new Item("Sulfuras, Hand of Ragnaros", 15, 20)
        val day20Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", -5 , 0)


        for(i <- 1 to 20){
          app.updateQuality()
          if(i == 1){
            app.items(0) should equal (day1Item1)
            app.items(1) should equal (day1Item2)
            app.items(2) should equal (day1Item3)
            app.items(3) should equal (day1Item4)
          }
          if(i == 5){
            app.items(0) should equal (day5Item1)
            app.items(1) should equal (day5Item2)
            app.items(2) should equal (day5Item3)
            app.items(3) should equal (day5Item4)
          }
          if(i == 10){
            app.items(0) should equal (day10Item1)
            app.items(1) should equal (day10Item2)
            app.items(2) should equal (day10Item3)
            app.items(3) should equal (day10Item4)
          }
          if(i == 15){
            app.items(0) should equal (day15Item1)
            app.items(1) should equal (day15Item2)
            app.items(2) should equal (day15Item3)
            app.items(3) should equal (day15Item4)
          }
          if(i == 20){
            app.items(0) should equal (day20Item1)
            app.items(1) should equal (day20Item2)
            app.items(2) should equal (day20Item3)
            app.items(3) should equal (day20Item4)
          }
        }
      }
}