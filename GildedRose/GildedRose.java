package gildedrose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public static Item[] items;

    public static void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = switch (item.name) {
                case AGED_BRIE -> new AgedBrieUpdater();
                case BACKSTAGE -> new BackstagePassUpdater();
                case SULFURAS -> new SulfurasUpdater();
                default -> new NormalItemUpdater();
            };
            updater.update(item);
        }
    }
}
