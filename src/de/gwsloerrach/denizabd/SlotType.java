package de.gwsloerrach.denizabd;

import java.awt.*;

/**
 * Ein enum besitzt n instanzen von sich selbst
 *
 * http://tutorials.jenkov.com/java/enums.html
 */
public enum SlotType {
    EMPTY(Color.WHITE),
    DISC(Color.BLACK),
    BLUE(Color.BLUE),
    RED(Color.RED);

    private Color color;

    SlotType(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
