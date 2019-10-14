# -*- coding: utf-8 -*-
import unittest

from gilded_rose import Item, GildedRose

test_cases_one_day = [
    ("+5 Dexterity Vest", 10, 20, 9, 19),
    ("Aged Brie", 2, 0, 1, 1),
    ("Elixir of the Mongoose", 5, 7, 4, 6),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20, 14, 21),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 9, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, 4, 50),
    ("Conjured Mana Cake", 3, 6, 2, 5),  # <-- :O
]

test_cases_five_days = [
    ("+5 Dexterity Vest", 10, 20, 5, 15),
    ("Aged Brie", 2, 0, -3, 8),
    ("Elixir of the Mongoose", 5, 7, 0, 2),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20, 10, 25),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 5, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, 0, 50),
    ("Conjured Mana Cake", 3, 6, -2, 0),  # <-- :O
]

test_cases_ten_days = [
    ("+5 Dexterity Vest", 10, 20, 0, 10),
    ("Aged Brie", 2, 0, -8, 18),
    ("Elixir of the Mongoose", 5, 7, -5, 0),
    ("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
    ("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
    ("Backstage passes to a TAFKAL80ETC concert", 15, 20, 5, 35),
    ("Backstage passes to a TAFKAL80ETC concert", 10, 49, 0, 50),
    ("Backstage passes to a TAFKAL80ETC concert", 5, 49, -5, 0),
    ("Conjured Mana Cake", 3, 6, -7, 0),  # <-- :O
]

class GildedRoseTest(unittest.TestCase):

    def test_one_day_update(self):
        "Test if the names are alright after one day"
        items = list()
        for test in test_cases_one_day:
            name, sellIn1, quality1, sellIn2, quality2 = test
            items.append(Item(name=name, sell_in=sellIn1, quality=quality1))

        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        for index in range(len(test_cases_one_day)):
            name, sellIn1, quality1, sellIn2, quality2 = test_cases_one_day[index]
            self.assertEqual(name, items[index].name)
            self.assertEqual(sellIn2, items[index].sell_in)
            self.assertEqual(quality2, items[index].quality)


    def test_five_days_update(self):
        "Test if the names are alright after five days"
        items = list()
        for test in test_cases_five_days:
            name, sellIn1, quality1, sellIn2, quality2 = test
            items.append(Item(name=name, sell_in=sellIn1, quality=quality1))

        #items = test_cases_one_day
        gilded_rose = GildedRose(items)
        for i in range(5):
            gilded_rose.update_quality()
        for index in range(len(test_cases_five_days)):
            name, sellIn1, quality1, sellIn2, quality2 = test_cases_five_days[index]
            self.assertEqual(name, items[index].name)
            self.assertEqual(sellIn2, items[index].sell_in)
            self.assertEqual(quality2, items[index].quality)

    def test_ten_days_update(self):
        "Test if the names are alright after one day"
        items = list()
        for test in test_cases_ten_days:
            name, sellIn1, quality1, sellIn2, quality2 = test
            items.append(Item(name=name, sell_in=sellIn1, quality=quality1))

        #items = test_cases_one_day
        gilded_rose = GildedRose(items)
        for i in range(10):
            gilded_rose.update_quality()
        for index in range(len(test_cases_ten_days)):
            name, sellIn1, quality1, sellIn2, quality2 = test_cases_ten_days[index]
            self.assertEqual(name, items[index].name)
            self.assertEqual(sellIn2, items[index].sell_in)
            self.assertEqual(quality2, items[index].quality)
            
if __name__ == '__main__':
    unittest.main()
