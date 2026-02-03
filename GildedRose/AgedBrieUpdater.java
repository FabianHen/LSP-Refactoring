package gildedrose;

public class AgedBrieUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        increaseQuality(item);

        item.sellIn--;

        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}
