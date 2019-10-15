package com.gildedrose

import com.gildedrose.items.{ItemBackstage, ItemBrie, ItemDexterity, ItemElixir, ItemInterface, ItemMana, ItemSulfuras}

object ItemFactory {

  /**
   *
   * @param item
   */
  def itemManager(item: Item): ItemInterface = {

    item.name match {
      case "Sulfuras, Hand of Ragnaros" => ItemSulfuras(item.name, item.quality, item.sellIn)
      //case "+5 Dexterity Vest" => ItemDexterity(item)
      case "Elixir of the Mongoose" => ItemElixir(item.name, item.quality, item.sellIn)
      case "Conjured Mana Cake" => ItemMana(item.name, item.quality, item.sellIn)
      case "Backstage passes to a TAFKAL80ETC concert" => ItemBackstage(item.name, item.quality, item.sellIn)
      case "Aged Brie" => ItemBrie(item.name, item.quality, item.sellIn)
      }
    }

}
