package com.javagame.engine;

import java.util.ArrayList;

public class Scene {
    final ArrayList<GameObject> gameObjects;
    
    public Scene (ArrayList<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }
    
    public void initialize() {
        for(var gameObject : gameObjects) {
            gameObject.initializeComponents();
        }
    }
    
    public void update() {
        for(var gameObject : gameObjects) {
            gameObject.updateComponents();
        }
    }
    
}
