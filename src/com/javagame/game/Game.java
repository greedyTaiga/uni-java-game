package com.javagame.game;

import com.javagame.components.Mover;
import com.javagame.components.SpriteRenderer;
import com.javagame.engine.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    public static Engine engine = new Engine();
    public static void main(String[] args){
        LoadLevel();
    }

    private static void LoadLevel(){
        var gameObjects = new ArrayList<GameObject>();
        var go = new GameObject();
        
        go.transform.position = new Position(100, 100);
        go.addComponent(new SpriteRenderer(go, "resources/square.png"));
        go.addComponent(new Mover(go));

        gameObjects.add(go);

        var scene = new Scene(gameObjects);

        engine.runScene(scene);

    }
}
