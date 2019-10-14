class GildedRose(object):

    def __init__(self, items):
        self.items = items

    def quality_add_1(self,item):
        return item.quality +1
    def quality_substract_1(self,item):
        return item.quality -1
    def sell_in_add_1(self,item):
        return item.sell_in +1

    def update_quality(self):
        for item in self.items:
            if item.name != "Aged Brie" and item.name != "Backstage passes to a TAFKAL80ETC concert":
                if item.quality > 0:
                    if item.name != "Sulfuras, Hand of Ragnaros":
                        item.quality = item.quality - 1
            else:
                if item.quality < 50:
                    item.quality = item.quality + 1
                    if item.name == "Backstage passes to a TAFKAL80ETC concert":
                        if item.sell_in < 11:
                            if item.quality < 50:
                                item.quality = item.quality + 1
                        if item.sell_in < 6:
                            if item.quality < 50:
                                item.quality = item.quality + 1
            if item.name != "Sulfuras, Hand of Ragnaros":
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
        #
        # for item in self.items:
        #     if item.name != "Aged Brie" and item.name != "Backstage passes to a TAFKAL80ETC concert":
        #         if item.quality > 0:
        #             if item.name != "Sulfuras, Hand of Ragnaros":
        #                 item.quality = self.quality_substract_1(item)
        #     else:
        #         if item.quality < 50:
        #             item.quality = self.quality_add_1(item)
        #             if item.name == "Backstage passes to a TAFKAL80ETC concert":
        #                 if item.sell_in < 11:
        #                     if item.quality < 50:
        #                         item.quality = self.quality_add_1(item)
        #                 if item.sell_in < 6:
        #                     if item.quality < 50:
        #                         item.quality = self.sell_in_add_1(item)
        #     if item.name != "Sulfuras, Hand of Ragnaros":
        #         item.sell_in = item.sell_in - 1
        #     if item.sell_in < 0:
        #         if item.name != "Aged Brie":
        #             if item.name != "Backstage passes to a TAFKAL80ETC concert":
        #                 if item.quality > 0:
        #                     if item.name != "Sulfuras, Hand of Ragnaros":
        #                         item.quality = item.quality - 1
        #             else:
        #                 item.quality = item.quality - item.quality
        #         else:
        #             if item.quality < 50:
        #                 item.quality = self.quality_add_1(item)
        #
        #
        #
