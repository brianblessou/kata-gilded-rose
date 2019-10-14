# -*- coding: utf-8 -*-
import unittest

from src.gilded_rose import Item, GildedRose

test_cases_one_day = [
    ("+5 Dexterity Vest", 10, 20, 9, 19),
    ("+5 Dexterity Vest", 10, 0, 9, 0), #quality >= 0
    ("Aged Brie", 2, 0, 1, 1),
    ("Aged Brie", 2, 50, 1, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7, 4, 6),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20, 14, 21),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 9, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 10, 9, 12),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, 4, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 10, 4, 13),
    ("Backstage passes to a TAFKAL80ETC concert", 0, 49, -1, 0),
    ("Conjured Mana Cake", 3, 6, 2, 5),  # <-- :O
]

test_cases_two_day = [
    ("+5 Dexterity Vest", 10, 20, 8, 18),
    ("+5 Dexterity Vest", 10, 0, 8, 0), #quality >= 0
    ("Aged Brie", 2, 0, 0, 2),
    ("Aged Brie", 2, 50, 0, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7, 3, 5),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20,  13, 22),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 8, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 10, 8, 14),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, 3, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 10, 3, 16),
    ("Backstage passes to a TAFKAL80ETC concert", 0, 49, -2, 0),
    ("Conjured Mana Cake", 3, 6,  1, 4),  # <-- :O
]

test_cases_five_day = [
    ("+5 Dexterity Vest", 10, 20, 5, 15),
    ("+5 Dexterity Vest", 10, 0, 5, 0), #quality >= 0
    ("Aged Brie", 2, 0, -3, 8),
    ("Aged Brie", 2, 50, -3, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7,  0, 2),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20,  10, 25),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 5, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 10, 5, 20),

    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, 0, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 10, 0, 25),
    
    ("Conjured Mana Cake", 3, 6,  -2, 0),  # <-- :O
]

test_cases_ten_day = [
    ("+5 Dexterity Vest", 10, 20,  0, 10),
    ("+5 Dexterity Vest", 10, 0, 0, 0), #quality >= 0
    ("Aged Brie", 2, 0, -8, 18),
    ("Aged Brie", 2, 50, -8, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7,  -5, 0),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20,  5, 35),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49,  0, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 10, 0, 35),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, -5, 0),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 10, -5, 0),
    ("Conjured Mana Cake", 3, 6,  -7, 0),  # <-- :O
]

class ItemRose(Item):
    def __eq__(self, obj):
        return isinstance(obj, ItemRose) and obj.sell_in == self.sell_in  and obj.name == self.name  and obj.quality == self.quality

def update_item(test_cases,nb_update):
    items = []
    items_update = []
    for case in test_cases:
        (name, sell_in, quality, sell_in_update, quality_update) = case
        item = ItemRose(name=name, sell_in=sell_in, quality=quality)
        item_update = ItemRose(name=name, sell_in=sell_in_update, quality=quality_update)
        items.append(item)
        items_update.append(item_update)
        
    gilded_rose = GildedRose(items)
    for _ in range(0,nb_update):
        gilded_rose.update_quality()
    return items, items_update
    

class GildedRoseTest(unittest.TestCase):
    def test_update_one_day(self):
        items, items_update = update_item(test_cases_one_day,1)
        for item, item_update in zip(items,items_update):
            self.assertEqual(item, item_update)
            
    def test_update_two_day(self):
        items, items_update = update_item(test_cases_two_day,2)
        for item, item_update in zip(items,items_update):
            self.assertEqual(item, item_update)
            
    def test_update_five_day(self):
        items, items_update = update_item(test_cases_five_day,5)
        for item, item_update in zip(items,items_update):
            self.assertEqual(item, item_update)
            
    def test_update_ten_day(self):
        items, items_update = update_item(test_cases_ten_day,10)
        for item, item_update in zip(items,items_update):
            self.assertEqual(item, item_update)
            
        
        
if __name__ == '__main__':
    unittest.main()
