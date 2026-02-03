package gildedrose;

public class BackstagePassUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {

        increaseQuality(item);

        if (item.sellIn < 11) {
            increaseQuality(item);
        }

        if (item.sellIn < 6 ) {
            increaseQuality(item);
        }

        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
