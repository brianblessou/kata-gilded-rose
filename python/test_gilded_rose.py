# -*- coding: utf-8 -*-
import unittest

from gilded_rose import GildedRose
from item import Item

class GildedRoseTest(unittest.TestCase):

    items = [
        Item(name="+5 Dexterity Vest", sell_in=10, quality=20),
        Item(name="Aged Brie", sell_in=2, quality=0),
        Item(name="Elixir of the Mongoose", sell_in=5, quality=7),
        Item(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
        Item(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
        Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=15, quality=20),
        Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=10, quality=49),
        Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=5, quality=49),
        Item(name="Conjured Mana Cake", sell_in=3, quality=6),
    ]





    def qualityLoop(self,gilded_rose,days):
        for i in range(0,days):
            gilded_rose.update_quality()
        return gilded_rose


    def test_after_1_day(self):
        items_expected = [
            Item(name="+5 Dexterity Vest", sell_in=9, quality=19),
            Item(name="Aged Brie", sell_in=1, quality=1),
            Item(name="Elixir of the Mongoose", sell_in=4, quality=6),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=14, quality=21),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=9, quality=50),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=4, quality=50),
            Item(name="Conjured Mana Cake", sell_in=2, quality=5),
        ]
        gilded_rose = GildedRose(self.items)
        gilded_rose = self.qualityLoop(gilded_rose,1)
        print("expected vs self day 1")
        print(items_expected)
        print(gilded_rose.items)
        assert (items_expected == gilded_rose.items)

    def test_after_2_day(self):
        items_expected = [
            Item(name="+5 Dexterity Vest", sell_in=8, quality=18),
            Item(name="Aged Brie", sell_in=0, quality=2),
            Item(name="Elixir of the Mongoose", sell_in=3, quality=5),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=13, quality=22),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=8, quality=50),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=3, quality=50),
            Item(name="Conjured Mana Cake", sell_in=1, quality=4),
        ]

        gilded_rose = GildedRose(self.items)
        gilded_rose = self.qualityLoop(gilded_rose,2)
        print("expected vs self day 2")
        print(items_expected)
        print(gilded_rose.items)
        self.assertCountEqual (items_expected,gilded_rose.items)

    def test_after_10_day(self):
        items_expected = [
            Item(name="+5 Dexterity Vest", sell_in=0, quality=10),
            Item(name="Aged Brie", sell_in= -8, quality=18),
            Item(name="Elixir of the Mongoose", sell_in= -5, quality= -0),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=5, quality=35),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=0, quality=50),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=-5, quality=0),
            Item(name="Conjured Mana Cake", sell_in=-7, quality=0),
        ]


        gilded_rose = GildedRose(self.items)
        gilded_rose = self.qualityLoop(gilded_rose,10)
        print(items_expected)
        print(gilded_rose.items)
        self.assertCountEqual (items_expected,gilded_rose.items)

    def test_after_20_day(self):
        items_expected = [
            Item(name="+5 Dexterity Vest", sell_in=-10, quality=0),
            Item(name="Aged Brie", sell_in= -18, quality=38),
            Item(name="Elixir of the Mongoose", sell_in= -15, quality=0),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=0, quality=80),
            Item(name="Sulfuras, Hand of Ragnaros", sell_in=-1, quality=80),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=-5, quality=0),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in= -10, quality=0),
            Item(name="Backstage passes to a TAFKAL80ETC concert", sell_in=-15, quality=0),
            Item(name="Conjured Mana Cake", sell_in=-17, quality=0),
        ]

        gild_rose = GildedRose(self.items)
        gild_rose = self.qualityLoop(gild_rose, 20)
        print("expected vs self day 20")
        print(items_expected)
        print(gild_rose.items)
        self.assertCountEqual (items_expected,gild_rose.items)




if __name__ == '__main__':
    unittest.main()
