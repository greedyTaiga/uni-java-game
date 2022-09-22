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
        public Sprite sprite;
        public DrawObject(Position pos, Sprite sprite) {
            this.pos = pos;
            this.sprite = sprite;
        }
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

    public void update(){
        repaint();
    }

    public void draw(Position pos, Sprite sprite) {
        drawBuffer.add(new DrawObject(pos, sprite));
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Toolkit.getDefaultToolkit().sync();

        drawBuffer((Graphics2D)g);

    }

    private void drawBuffer(Graphics2D g){
        for (var drawObject : drawBuffer) {
            g.drawImage(drawObject.sprite.getImage(), drawObject.pos.x, drawObject.pos.y, this); 
            
        }
        drawBuffer.clear();
    }

}
