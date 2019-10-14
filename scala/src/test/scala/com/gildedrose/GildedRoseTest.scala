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
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedBrieAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Aged Brie", 2, 50))
    val expectedImprovedItem = Item("Aged Brie", 2, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPassRegular(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 15, 21)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPassRegularAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 15, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 15, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass6To10DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 9, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 9, 22)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass6To10DaysLeftAlreadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 9, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 9, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass1To5DaysLeft(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 4, 20))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 4, 23)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

  @Test
  def checkImprovedPass1To5DaysLeftAleadyPerfect(): Unit = {
    val items = Array[Item](Item("Backstage passes to a TAFKAL80ETC concert", 4, 50))
    val expectedImprovedItem = Item("Backstage passes to a TAFKAL80ETC concert", 4, 50)
    val app = new GildedRose(items)
    val improvedItem = app.improveBrieOrPass(items(0))
    assertEquals(expectedImprovedItem, improvedItem)
  }

}