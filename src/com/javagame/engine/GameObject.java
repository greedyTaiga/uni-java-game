package com.javagame.engine;

import java.util.ArrayList;

public abstract class GameObject {
    public final ArrayList<Component> components;
    public GameObject(ArrayList<Component> components) {
        this.components = components;
    }
    
    public void addComponent(Component component) {
        components.add(component);
    }
    
    public void initializeComponents(){
        for(var component : components) {
            component.initialize();
        }
    }
    
    public void priorityUpdateComponents(){
        for(var component : components) {
            component.priorityUpdate();
        }
    }
    public void updateComponents(){
        for(var component : components) {
            component.update();
        }
    }
    
}
