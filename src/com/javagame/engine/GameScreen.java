package com.javagame.engine;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameScreen extends JPanel {

    final int UNIT = 16;
    final int UNIT_WIDTH = 32, UNIT_HEIGHT = 18; 

    final int SCALE = 2;
    final int PIXEL_WIDTH = UNIT_WIDTH * UNIT * SCALE, PIXEL_HEIGH = UNIT_HEIGHT * UNIT * SCALE;

    private ArrayList<DrawObject> drawBuffer;

    private class DrawObject{
        public Position pos;
        public Image sprite;
    }


    private final JFrame frame;
    public GameScreen(){
        frame = new JFrame();
        frame.setSize(PIXEL_WIDTH, PIXEL_HEIGH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(this);

        drawBuffer = new ArrayList<>();
    }

    public void draw(){
        repaint();
    }

    @Override
    public void paintComponent(Graphics go) {
        super.paintComponent(go);
        Toolkit.getDefaultToolkit().sync();

        Graphics2D g = (Graphics2D)go;

        g.fillRect(100, 100, UNIT * SCALE, UNIT * SCALE);

    }

}
