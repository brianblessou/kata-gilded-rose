# -*- coding: utf-8 -*-

class GildedRose(object):

    def __init__(self, items):
        self.items = items
    @staticmethod
    def _decrease_quality(item):
        """
        Helper function to increase the quality.
        :param item: item which we want tod descrease
        :return: integer, containing the quality minus one
        """
        if item.quality > 0:
            return item.quality - 1
        else:
            return item.quality
    @staticmethod
    def _increase_quality(item):
        """
        Helper function to increase the quality.
        :param item: item which we want to increase
        :return: integer, containing the quality plus one
        """
        if item.quality < 50:
            return item.quality + 1
        else:
            return item.quality
    def update_quality(self):
        for item in self.items:
            if item.name == "Sulfuras, Hand of Ragnaros":
                pass
            else:

                if item.name != "Aged Brie" and item.name != "Backstage passes to a TAFKAL80ETC concert":
                            item.quality = self._decrease_quality(item)
                else:
                        item.quality = self._increase_quality(item)
                        if item.name == "Backstage passes to a TAFKAL80ETC concert":
                            if item.sell_in < 11:
                                    item.quality = self._increase_quality(item)
                            if item.sell_in < 6:
                                    item.quality = self._increase_quality(item)
                item.sell_in = item.sell_in - 1
                if item.sell_in < 0:
                    if item.name != "Aged Brie":
                        if item.name != "Backstage passes to a TAFKAL80ETC concert":
                                    item.quality = self._decrease_quality(item)
                        elif item.name == "Backstage passes to a TAFKAL80ETC concert":
                            item.quality = item.quality - item.quality
                    else:
                            item.quality = self._increase_quality(item)

