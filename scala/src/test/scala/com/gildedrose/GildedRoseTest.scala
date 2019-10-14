package com.gildedrose

import org.junit.Assert._
import org.junit.Test

//Unit Tests
class GildedRoseTest {

  @Test
  def checkImprovedBrieRegular(): Unit = {
    val items = Array[Item](Item("Aged Brie", 2, 0))
    val expectedImprovedItem = Item("Aged Brie", 2, 1)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedBrieAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Aged Brie", 2, 50))
    val expectedImprovedItem = Item("Aged Brie", 2, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPassRegular(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 15, 21)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPassRegularAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 15, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 15, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass6To10DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 9, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 9, 22)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass6To10DaysLeftAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 9, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 9, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass1To5DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 4, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 4, 23)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass1To5DaysLeftAleadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 4, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 4, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedRegular(): Unit = {
    val items = Array[Item](Item("Aged Brie", 2, 0))
    val expectedImprovedItem = Item("Aged Brie", 2, 1)
    val app = new GildedRose(items)
    val improvedItem = app.improveRegular(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedRegularAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Aged Brie", 2, 50))
    val expectedImprovedItem = Item("Aged Brie", 2, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveRegular(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkDecreaseQualityNonSulfuras(): Unit = {
    val items = Array[Item](Item("+5 Dexterity Vest", 10, 20))
    val expectedImprovedItem = Item("+5 Dexterity Vest", 10, 19)
    val app = new GildedRose(items)
    val improvedItem = app.decreaseQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkDecreaseQualitySulfuras(): Unit = {
    val items = Array[Item](Item("Sulfuras, Hand of Ragnaros", 0, 80))
    val expectedImprovedItem = Item("Sulfuras, Hand of Ragnaros", 0, 80)
    val app = new GildedRose(items)
    val improvedItem = app.decreaseQuality(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedBoostedPassRegular(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 15, 34))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 15, 34)
    val app = new GildedRose(items)
    val improvedItem = app.improveBoostedPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedBoostedPass6To10DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 6, 34))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 6, 35)
    val app = new GildedRose(items)
    val improvedItem = app.improveBoostedPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedBoostedPass1To5DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 3, 34))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 3, 36)
    val app = new GildedRose(items)
    val improvedItem = app.improveBoostedPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

}