package com.javagame.components;

import com.javagame.engine.Component;
import com.javagame.engine.GameObject;

public class Mover extends Component {

    public Mover(GameObject owner){
        super(owner);
    }

    @Override
    public void update(){
        owner.transform.position.x += 1;
    }
    
}
