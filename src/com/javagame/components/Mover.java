package com.javagame.components;

import com.javagame.engine.Component;
import com.javagame.engine.GameObject;
import com.javagame.game.*;

public class Mover extends Component {

    public Mover(GameObject owner){
        super(owner);
    }

    @Override
    public void update(){
        
        int x = 0, y = 0;
        if(Game.engine.input.GetKey("W")) y --;
        if(Game.engine.input.GetKey("S")) y ++;
        if(Game.engine.input.GetKey("D")) x ++;
        if(Game.engine.input.GetKey("A")) x --;

        owner.transform.position.x += x;
        owner.transform.position.y += y;
        
        
    }
    
}
