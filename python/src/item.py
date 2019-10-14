from abc import ABC, abstractmethod


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)

    def __eq__(self, obj):
        return isinstance(obj, Item) and obj.sell_in == self.sell_in  and obj.name == self.name  and obj.quality == self.quality
    
    def _clean_quality(self):
        """
        Check if item.quality is between 0 and 50 
       
        if item.quality < 0 : item.quality = 0
        if item.quality > 50 : item.quality = 50
        """
        if self.quality < 0 :
            self.quality = 0
        elif self.quality > 50 :
            self.quality = 50
    
    @abstractmethod
    def update(self):
        pass

class ItemAgedBrie (Item):
    def update(self):
        self.sell_in = self.sell_in - 1
        self.quality = self.quality + 1
        if self.sell_in < 0:
            self.quality = self.quality + 1
        self._clean_quality()
            
            
    
class ItemBackstage (Item):
    def update(self):
        self.sell_in = self.sell_in - 1
        self.quality = self.quality + 1
        if self.sell_in  < 10:
            self.quality = self.quality + 1
        if self.sell_in  < 5:
            self.quality = self.quality + 1
            
        if self.sell_in < 0:
            self.quality = 0
            
        self._clean_quality()
        
    
class ItemSulfuras (Item):
    def update(self):
        pass
    
class ItemDefault (Item):
    def update(self):
        print("ItemDefault")
        self.sell_in = self.sell_in - 1
        self.quality = self.quality - 1
        if self.sell_in < 0:
            self.quality = self.quality - 1
            
        self._clean_quality()
    