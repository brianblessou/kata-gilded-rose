package com.gildedrose

class GildedRose(val items: Array[Item]) {
  val MAX_QUALITY = 50
  val MIN_QUALITY = 0

  /**
   * Function that allows you to "add" the given value to the quality value of the item
   * @param item The item from which we need to modify the quality value.
   * @param nb The value that we have to add (or remove if is (-)) to quality
   */
  def setQualityItem(item : Item, nb : Int) {
    if( item.quality + nb <= MAX_QUALITY && item.quality + nb >= MIN_QUALITY ) {
      item.quality += nb
    }
  }

  /**
   * Function that contains the business logic. It set the quality of the given Item depending of the name
   * @param item The item from which we have to set the quality
   */
  def setQuality(item : Item){
    item.name match {
      case "Aged Brie" => setQualityItem(item, 1)
      case "Sulfuras, Hand of Ragnaros" => setQualityItem(item, 0)
      case "Backstage passes to a TAFKAL80ETC concert" => (
        if(item.sellIn > 10) setQualityItem(item, 1)
        else if (item.sellIn > 5) setQualityItem(item, 2)
        else if (item.sellIn > 0) setQualityItem(item, 3)
        else if (item.sellIn <= 0) item.quality = 0
      )
      case _ => (
        if(item.sellIn >= 0) setQualityItem(item, -1)
        else setQualityItem(item, -2)
        )
    }
  }


  /**
   *
   * @param item
   */
  def setSellInItem(item : Item){
    item.sellIn -= 1
  }

  /**
   *
   * @param item
   */
  def setSellIn(item : Item){
    val name : String = item.name
    name match{
      case "Sulfuras, Hand of Ragnaros" => ()
      case _ => setSellInItem(item)
    }
  }

  /**
   * Function that will update the quality of all the items.
   */
  def updateQuality(){
    for(item <- items){
      setQuality(item)
      setSellIn(item)
    }
  }
  /*def updateQuality() {
    for (item <- items) {
      if (!item.name.equals("Aged Brie")
        && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        if (item.quality > 0) {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1
          }
        }
      } else {
        if (item.quality < 50) {
          item.quality = item.quality + 1

          if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.sellIn < 11) {
              if (item.quality < 50) {
                item.quality = item.quality + 1
              }
            }

            if (item.sellIn < 6) {
              if (item.quality < 50) {
                item.quality = item.quality + 1
              }
            }
          }
        }
      }

      if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
        item.sellIn = item.sellIn - 1
      }

      if (item.sellIn < 0) {
        if (!item.name.equals("Aged Brie")) {
          if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
              if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1
              }
            }
          } else {
            item.quality = item.quality - item.quality
          }
        } else {
          if (item.quality < 50) {
            item.quality = item.quality + 1
          }
        }
      }
    }
  }*/
}