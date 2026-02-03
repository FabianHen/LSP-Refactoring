package gildedrose;

public class NormalItemUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        decreaseQuality(item);

        item.sellIn--;

        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }
}
