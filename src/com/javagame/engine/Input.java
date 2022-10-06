package com.javagame.engine;

import java.awt.event.*;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.javagame.game.*;

public class Input {


    public final HashMap<String, Boolean> keyPressed;
    final JPanel panel;
    
    public Input(JPanel panel){
        this.panel = panel;
        keyPressed = new HashMap<>();
        Setup();
    }

    private void Setup(){
        var inputMap = panel.getInputMap();
        var actionMap = panel.getActionMap();

        //up
        inputMap.put(KeyStroke.getKeyStroke("W"), "W");
        inputMap.put(KeyStroke.getKeyStroke("released W"), "R_W");

        actionMap.put("W", new InputAction("W"));
        actionMap.put("R_W", new InputAction("R_W"));

        //down
        inputMap.put(KeyStroke.getKeyStroke("S"), "S");
        inputMap.put(KeyStroke.getKeyStroke("released S"), "R_S");

        actionMap.put("S", new InputAction("S"));
        actionMap.put("R_S", new InputAction("R_S"));

        //left
        inputMap.put(KeyStroke.getKeyStroke("A"), "A");
        inputMap.put(KeyStroke.getKeyStroke("released A"), "R_A");

        actionMap.put("A", new InputAction("A"));
        actionMap.put("R_A", new InputAction("R_A"));

        //right
        inputMap.put(KeyStroke.getKeyStroke("A"), "A");
        inputMap.put(KeyStroke.getKeyStroke("released A"), "R_A");

        actionMap.put("A", new InputAction("A"));
        actionMap.put("R_A", new InputAction("R_A"));

    }

    private class InputAction extends AbstractAction{
        
        final String action;
        public InputAction(String action) {
            this.action = action;
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println(action + " happened");
        }
    }




}
