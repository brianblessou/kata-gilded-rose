# -*- coding: utf-8 -*-
AGED_BRIE = "Aged Brie"
BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"
SULFURAS = "Sulfuras, Hand of Ragnaros"
class GildedRose(object):

    def __init__(self, items):
        self.items = items

    def _improve_quality(self, item):
        """
        Effect: Improve item.quality by 1 in default case
                If item.name =  "Backstage passes to a TAFKAL80ETC concert" :
                    If item.sell_in < 11 : item.quality + 2
                    If item.sell_in < 6 : item.quality + 3
        """
        
        item.quality = item.quality + 1
        if item.name == "Backstage passes to a TAFKAL80ETC concert":
            if item.sell_in < 11:
                item.quality = item.quality + 1
            if item.sell_in < 6:
                item.quality = item.quality + 1
                        
    def _clean_quality(self,item):
        """
        Check if item.quality is between 0 and 50 
       
        if item.quality < 0 : item.quality = 0
        if item.quality > 50 : item.quality = 50
        """
        if item.quality < 0 :
            item.quality = 0
        elif item.quality > 50 :
            item.quality = 50
        
    def update_quality(self):
        for item in self.items:
            if  item.name == SULFURAS:
                continue
            
            if item.name not in [AGED_BRIE,BACKSTAGE]:
                item.quality = item.quality - 1
            else:
                self._improve_quality(item)
            
            item.sell_in = item.sell_in - 1
            
            if item.sell_in < 0:
                if item.name == AGED_BRIE:
                    item.quality = item.quality + 1
                elif item.name == BACKSTAGE:
                        item.quality = item.quality - item.quality
                else:
                    item.quality = item.quality - 1
                        
            self._clean_quality(item)
                
                    


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)
