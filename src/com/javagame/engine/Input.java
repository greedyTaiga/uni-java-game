package com.javagame.engine;

import java.awt.event.*;
import javax.swing.Action;
import com.javagame.game.*;

public class Input implements ActionListener {


    public Input(){
        Game.engine.gameScreen.addKeyListener(new Adapter());
    }

    public void actionPerformed(ActionEvent event){
        
    }

    private class Adapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }

    }

}
