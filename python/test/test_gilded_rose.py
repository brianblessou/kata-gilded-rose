# -*- coding: utf-8 -*-
import unittest

from src.gilded_rose import  GildedRose, AGED_BRIE, BACKSTAGE, SULFURAS
from src.item import Item

test_cases_one_day = [
    ("+5 Dexterity Vest", 10, 20, 9, 19),
    ("+5 Dexterity Vest", 10, 0, 9, 0), #quality >= 0
    (AGED_BRIE, 2, 0, 1, 1),
    (AGED_BRIE, 2, 50, 1, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7, 4, 6),
    (SULFURAS, 0, 80, 0, 80),
    (SULFURAS, -1, 80, -1, 80),
    (BACKSTAGE, 15, 20, 14, 21),
    (BACKSTAGE, 10, 49, 9, 50),
    (BACKSTAGE, 10, 10, 9, 12),
    (BACKSTAGE, 5, 49, 4, 50),
    (BACKSTAGE, 5, 10, 4, 13),
    (BACKSTAGE, 0, 49, -1, 0),
    ("Conjured Mana Cake", 3, 6, 2, 5),  # <-- :O
]

test_cases_two_day = [
    ("+5 Dexterity Vest", 10, 20, 8, 18),
    ("+5 Dexterity Vest", 10, 0, 8, 0), #quality >= 0
    (AGED_BRIE, 2, 0, 0, 2),
    (AGED_BRIE, 2, 50, 0, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7, 3, 5),
    (SULFURAS, 0, 80, 0, 80),
    (SULFURAS, -1, 80, -1, 80),
    (BACKSTAGE, 15, 20,  13, 22),
    (BACKSTAGE, 10, 49, 8, 50),
    (BACKSTAGE, 10, 10, 8, 14),
    (BACKSTAGE, 5, 49, 3, 50),
    (BACKSTAGE, 5, 10, 3, 16),
    (BACKSTAGE, 0, 49, -2, 0),
    ("Conjured Mana Cake", 3, 6,  1, 4),  # <-- :O
]

test_cases_five_day = [
    ("+5 Dexterity Vest", 10, 20, 5, 15),
    ("+5 Dexterity Vest", 10, 0, 5, 0), #quality >= 0
    (AGED_BRIE, 2, 0, -3, 8),
    (AGED_BRIE, 2, 50, -3, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7,  0, 2),
    (SULFURAS, 0, 80, 0, 80),
    (SULFURAS, -1, 80, -1, 80),
    (BACKSTAGE, 15, 20,  10, 25),
    (BACKSTAGE, 10, 49, 5, 50),
    (BACKSTAGE, 10, 10, 5, 20),
    (BACKSTAGE, 5, 49, 0, 50),
    (BACKSTAGE, 5, 10, 0, 25),
    
    ("Conjured Mana Cake", 3, 6,  -2, 0),  # <-- :O
]

test_cases_ten_day = [
    ("+5 Dexterity Vest", 10, 20,  0, 10),
    ("+5 Dexterity Vest", 10, 0, 0, 0), #quality >= 0
    (AGED_BRIE, 2, 0, -8, 18),
    (AGED_BRIE, 2, 50, -8, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 7,  -5, 0),
    (SULFURAS, 0, 80, 0, 80),
    (SULFURAS, -1, 80, -1, 80),
    (BACKSTAGE, 15, 20,  5, 35),
    (BACKSTAGE, 10, 49,  0, 50),
    (BACKSTAGE, 10, 10, 0, 35),
    (BACKSTAGE, 5, 49, -5, 0),
    (BACKSTAGE, 5, 10, -5, 0),
    ("Conjured Mana Cake", 3, 6,  -7, 0),  # <-- :O
]

test_cases_clean_quality=[
    ("+5 Dexterity Vest", 10, 600,  0, 50),
    ("+5 Dexterity Vest", 10, 0, 0, 0), #quality >= 0
    (AGED_BRIE, 2, -5, -8, 0),
    (AGED_BRIE, 2, 50, -8, 50),#quality <= 50
    ("Elixir of the Mongoose", 5, 49,  -5, 49),
]


def update_item(test_cases,nb_update):
    items = []
    items_update = []
    for case in test_cases:
        (name, sell_in, quality, sell_in_update, quality_update) = case
        item = Item(name=name, sell_in=sell_in, quality=quality)
        item_update = Item(name=name, sell_in=sell_in_update, quality=quality_update)
        items.append(item)
        items_update.append(item_update)
        
    gilded_rose = GildedRose(items)
    print("be:",items)
    for _ in range(0,nb_update):
        gilded_rose.update_quality()
    print("af:",items)
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
