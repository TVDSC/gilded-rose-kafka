package com.gildedrose;

public class Special extends Item implements ActionableItem {

    public Special(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        System.out.println("Legendary items never decrease in quality.");
    }

    @Override
    public void updateSellIn() {
        System.out.println("Legendary items never has to be sold.");
    }
}
