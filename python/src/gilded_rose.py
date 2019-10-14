# -*- coding: utf-8 -*-
from src.item import Item

from src.factory_item import FactoryItem

AGED_BRIE = "Aged Brie"
BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"
SULFURAS = "Sulfuras, Hand of Ragnaros"

class GildedRose(object):

    def __init__(self, items):
        self.items = items
        self.factory_item = FactoryItem()
                                
    def update_quality(self):
        for item in self.items:
            itemObj = self.factory_item.product(item.name, item.sell_in, item.quality)
            
            itemObj.update()
            item.name = itemObj.name
            item.sell_in = itemObj.sell_in
            item.quality = itemObj.quality
                   
            
                
                    


