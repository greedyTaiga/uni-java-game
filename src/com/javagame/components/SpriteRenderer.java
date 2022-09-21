package com.javagame.components;

import com.javagame.engine.Component;
import com.javagame.engine.*;
import java.awt.*;

public class SpriteRenderer extends Component {
    
    private Image sprite;

    public SpriteRenderer(GameObject owner, Image sprite) {
        super(owner);
        this.sprite = sprite;
    }

    @Override
    public void update() {
        
    }
    
}
