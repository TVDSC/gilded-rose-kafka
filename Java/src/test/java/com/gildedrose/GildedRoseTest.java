package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void increased() {
        Item[] items = new Item[] {
                new Increase("foo1", 2, 0),
                new Increase("foo2", 8, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateAllItems();

        assertEquals("foo1", app.items[0].name);
        assertEquals(3, app.items[0].quality);

        assertEquals("foo2", app.items[1].name);
        assertEquals(2, app.items[1].quality);
    }

    @Test
    void conjured() {
        Item[] items = new Item[] {
                new Conjured("foo1", 2, 3),
                new Conjured("foo2", 2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateAllItems();

        assertEquals("foo1", app.items[0].name);
        assertEquals(1, app.items[0].quality);

        assertEquals("foo2", app.items[1].name);
        assertEquals(0, app.items[1].quality);
    }

}
