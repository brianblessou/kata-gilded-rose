# -*- coding: utf-8 -*-

class GildedRose(object):

    def __init__(self, items):
        self.items = items

    def _improve_quality(self, item):
        """
        Effect :Improve item.quality by 1 in default case
                If item.name =  "Backstage passes to a TAFKAL80ETC concert" :
                    If item.sell_in < 11 : item.quality + 2
                    If item.sell_in < 6 : item.quality + 3
        """
        if item.quality < 50:
            item.quality = item.quality + 1
            if item.name == "Backstage passes to a TAFKAL80ETC concert":
                if item.sell_in < 11:
                    if item.quality < 50:
                        item.quality = item.quality + 1
                if item.sell_in < 6:
                    if item.quality < 50:
                        item.quality = item.quality + 1
        
    def update_quality(self):
        for item in self.items:
            if  item.name == "Sulfuras, Hand of Ragnaros":
                continue
            
            if item.name not in ["Aged Brie","Backstage passes to a TAFKAL80ETC concert"]:
                if item.quality > 0 :
                    item.quality = item.quality - 1
            else:
                self._improve_quality(item)
            
            item.sell_in = item.sell_in - 1
            
            if item.sell_in < 0:
                if item.name != "Aged Brie":
                    if item.name != "Backstage passes to a TAFKAL80ETC concert":
                        if item.quality > 0:
                            if item.name != "Sulfuras, Hand of Ragnaros":
                                item.quality = item.quality - 1
                    else:
                        item.quality = item.quality - item.quality
                else:
                    if item.quality < 50:
                        item.quality = item.quality + 1


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)
