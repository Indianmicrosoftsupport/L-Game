package de.gwsloerrach.denizabd;

public class Board {
    private Slot[][] board;

    public Board() {
        board = new Slot[][] {
                { Slot.DISC, Slot.RED, Slot.RED, Slot.EMPTY },
                { Slot.EMPTY, Slot.BLUE, Slot.RED, Slot.EMPTY },
                { Slot.EMPTY, Slot.BLUE, Slot.RED, Slot.EMPTY },
                { Slot.EMPTY, Slot.BLUE, Slot.BLUE, Slot.DISC }
        };
    }

    public Slot[][] getBoard() {
        return board;
    }
}
