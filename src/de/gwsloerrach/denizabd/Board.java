package de.gwsloerrach.denizabd;

public final class Board {
    private SlotType[][] board;

    public Board() {
        board = new SlotType[][] {
                { SlotType.DISC, SlotType.RED, SlotType.RED, SlotType.EMPTY },
                { SlotType.EMPTY, SlotType.BLUE, SlotType.RED, SlotType.EMPTY },
                { SlotType.EMPTY, SlotType.BLUE, SlotType.RED, SlotType.EMPTY },
                { SlotType.EMPTY, SlotType.BLUE, SlotType.BLUE, SlotType.DISC }
        };
    }

    public SlotType[][] getBoard() {
        return board;
    }
}
