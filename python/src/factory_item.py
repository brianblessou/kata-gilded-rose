AGED_BRIE = "Aged Brie"
BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"
SULFURAS = "Sulfuras, Hand of Ragnaros"

from src.item import ItemAgedBrie, ItemBackstage, ItemSulfuras, ItemDefault

class FactoryItem:
    def product_list(self, items):
        listItem = []
        for item in items:
            (name, sell_in, quality) = item
            listItem.append(self.product(name, sell_in, quality))
            
        return listItem
    
    def product(self, name, sell_in, quality):
        if (name == AGED_BRIE):
            return ItemAgedBrie(name, sell_in, quality)
            
        elif(name == BACKSTAGE):
            return ItemBackstage(name, sell_in, quality)
            
        elif(name == SULFURAS):
            return ItemSulfuras(name, sell_in, quality)
            
        else :
            return ItemDefault(name, sell_in, quality)
            