package com.gildedrose;

public class Conjured extends Item implements ActionableItem {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 1) {
            this.quality = this.quality - 2;
        } else {
            this.quality = 0;
        }
    }

    @Override
    public void updateSellIn() {
        this.sellIn--;
    }
}
