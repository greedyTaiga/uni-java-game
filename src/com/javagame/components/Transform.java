package com.javagame.components;

import com.javagame.engine.Component;
import com.javagame.engine.GameObject;
import com.javagame.engine.Position;

public class Transform extends Component{
    public Position position;
    public Transform(GameObject owner) {
        super(owner);
        position = new Position(0, 0);
    }
    public Transform(GameObject owner, int x, int y) {
        super(owner);
        position = new Position(x, y);
    }
}
