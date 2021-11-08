package com.gildedrose;

public class Increase extends Item implements ActionableItem {

    public Increase(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    /*
    I could create 2 more subclasses of Increase: AgedBrie and BackstagePasses.
     */
    @Override
    public void updateQuality() {
        if (this.quality < 50) {
            if ("Aged Brie".equals(this.name)) {
                if (this.sellIn < 50) {
                    this.quality++;
                }
            } else {
                if (this.sellIn <= 0) {
                    this.quality = 0;
                } else if (this.sellIn < 6) {
                    validateQuality(3);
                } else if (this.sellIn < 11) {
                    validateQuality(2);
                } else {
                    this.quality++;
                }
            }
        }
    }

    private void validateQuality(int increase) {
        if (increase + this.quality <= 50) {
            this.quality += increase;
        } else {
            this.quality = 50;
        }
    }

    @Override
    public void updateSellIn() {
        this.sellIn--;
    }
}
