package com.gildedrose.factories

import com.gildedrose.interfaces.ItemInterface
import com.gildedrose.items._

object ItemFactory {

  /**
   *
   * @param item
   * @return
   */
  def itemManager(item: Item): ItemInterface = {

    item.name match {
      case "Sulfuras, Hand of Ragnaros" => ItemSulfuras(item)
      case "Elixir of the Mongoose" | "+5 Dexterity Vest" => ItemDefault(item)
      case "Conjured Mana Cake" => ItemMana(item)
      case "Backstage passes to a TAFKAL80ETC concert" => ItemBackstage(item)
      case "Aged Brie" => ItemBrie(item)
      case "Desert Eagle" => ItemDesertEagle(item)
    }
  }

}
