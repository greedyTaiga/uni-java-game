package com.javagame.engine;

public abstract class Component {
    
    private final GameObject owner;
    public Component(GameObject owner) {
        this.owner = owner;
    }
    public void initialize() {
    
    }
    
    public void priorityUpdate(){
    
    }
    public void update(){
    
    }
}
