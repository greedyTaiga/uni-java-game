package com.javagame.engine;

public class Engine {
    
    static final double GAME_FPS = 60.0;
    
    public final GameScreen gameScreen;
    public final Input input;
    
    public Engine(){
        gameScreen = new GameScreen();
        input = new Input(gameScreen);
    }
    
    public void StartGame(Scene scene) {
        runScene(scene);
    }
    
    public void runScene(Scene scene){
        scene.initialize();
        
        var lastTime = System.nanoTime();
        final double frameGapLength = 1000000000.0 / GAME_FPS;
        double delta = 0;
        
        //calculates delta time, if it's greater than supposed gap between 2 frames, scene gets updated
        while (true) {
            var currentTime = System.nanoTime();
            delta += (currentTime - lastTime);
            lastTime = currentTime;
            while (delta >= frameGapLength) {
                delta -= frameGapLength;
                scene.update();
                gameScreen.update();
            }
        }
    } 
    
}
