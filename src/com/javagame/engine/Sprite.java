package com.javagame.engine;

import javax.swing.ImageIcon;
import java.awt.*;

public class Sprite {
    private Image image;
    public Sprite(String path) {
        this.image = new ImageIcon(path).getImage();
    }
    public Image getImage() {
        return image;
    }
}
