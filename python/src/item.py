class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)

    def __eq__(self, obj):
        return isinstance(obj, Item) and obj.sell_in == self.sell_in  and obj.name == self.name  and obj.quality == self.quality

class ItemB