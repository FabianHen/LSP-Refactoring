package gildedrose;

public abstract class ItemUpdater {

   abstract void update(Item item);

   protected void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality ++;
        }
   }

   protected void decreaseQuality(Item item) {
       if (item.quality > 0) {
           item.quality --;
       }
   }
}
