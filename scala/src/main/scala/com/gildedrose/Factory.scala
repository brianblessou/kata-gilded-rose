package com.gildedrose

trait Factory {
  private val MAX_QUALITY = 50
  private val MIN_QUALITY = 0

  def update()
  /**
   * Function that allows you to "add" the given value to the quality value of the item
   * @param item The item from which we need to modify the quality value.
   * @param valueToAdd The value that we have to add (or remove if is (-)) to quality
   */
  def setQualityItem(item : Item, valueToAdd : Int) {
    val tmpQualityValue : Int = item.quality + valueToAdd
    if( MIN_QUALITY <= tmpQualityValue && tmpQualityValue <= MAX_QUALITY) {
      item.quality += valueToAdd
    }
  }
  /**
   * Set the sell in value of the item
   * @param item The item to which we have to set the value
   */
  def setSellIn(item : Item){
    item.sellIn -= 1
  }




}
