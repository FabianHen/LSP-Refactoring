package gildedrose;

class GildedRose {

    public static Item[] items;

    public static void updateQuality() {
        for (Item item : items) {
            ItemUpdaterFactory.forItem(item).update(item);
        }
    }
}
