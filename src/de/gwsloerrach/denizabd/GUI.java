package de.gwsloerrach.denizabd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class GUI extends JFrame {
    private final Board board;

    public GUI(Board board) {
        this.board = board;

        this.setTitle("L-Game");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // center window on screen
        this.setUndecorated(true); // TODO remove this to show the frame around the window

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final int row = e.getY() / (GUI.this.getHeight() / 4);
                final int col = e.getX() / (GUI.this.getHeight() / 4);

                System.out.printf("Pressed on [%d|%d] => [%d][%d]%n", e.getX(), e.getY(), col, row);
            }
        });

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        final Graphics2D g2d = (Graphics2D) g;

        super.paint(g2d);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                paintSlot(j, i, g2d);
        }
    }

    private void paintSlot(int col, int row, Graphics2D graphics2D) {
        final int thickness = 10;
        final int size = getHeight() / 4 - (thickness / 4);

        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(row * size, col * size, size, size);

        graphics2D.setStroke(new BasicStroke(thickness));
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawRect(row * size + (thickness / 2), col * size + (thickness / 2), size, size);

        graphics2D.setColor(board.getBoard()[col][row].getColor());
        switch (board.getBoard()[col][row]) {
            case BLUE:
            case RED:
                graphics2D.fillRect(row * size + thickness, col * size + thickness, size - thickness, size - thickness);
            case DISC:
                graphics2D.fillOval(row * size + thickness, col * size + thickness, size - thickness, size - thickness);
        }
    }
}
