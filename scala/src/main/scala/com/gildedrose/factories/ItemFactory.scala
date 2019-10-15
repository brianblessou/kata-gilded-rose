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
        case "+5 Dexterity Vest" => ItemDexterity(item)
        case "Elixir of the Mongoose" => ItemElixir(item)
        case "Conjured Mana Cake" => ItemMana(item)
        case "Backstage passes to a TAFKAL80ETC concert" => ItemBackstage(item)
        case "Aged Brie" => ItemBrie(item)
    }
  }

}
