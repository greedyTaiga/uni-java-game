package com.javagame.engine;

import java.util.ArrayList;
import com.javagame.components.Transform;

public class GameObject {
    public final ArrayList<Component> components;
    public final Transform transform;

    public GameObject() {
        transform = new Transform(this);

        this.components = new ArrayList<>();
        components.add(transform);
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
