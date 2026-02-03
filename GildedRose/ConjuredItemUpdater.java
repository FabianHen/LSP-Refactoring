package gildedrose;

public class ConjuredItemUpdater extends ItemUpdater {
    @Override
    void update(Item item) {

        decreaseQuality(item);
        decreaseQuality(item);

        item.sellIn--;

        if (item.sellIn < 0) {
            decreaseQuality(item);
            decreaseQuality(item);
        }
    }
}

