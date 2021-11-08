package com.gildedrose;

public class Decrease extends Item implements ActionableItem{

    public Decrease(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) {
            if (this.sellIn < 0) {
                this.quality = this.quality - 2;
            } else {
                this.quality--;
            }
        }
    }

    @Override
    public void updateSellIn() {
        this.sellIn--;
    }
}
