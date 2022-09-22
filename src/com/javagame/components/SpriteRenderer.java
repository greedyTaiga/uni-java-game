package com.javagame.components;

import com.javagame.engine.Component;
import com.javagame.game.Game;
import com.javagame.engine.*;
import java.awt.*;

public class SpriteRenderer extends Component {
    
    private Sprite sprite;

    public SpriteRenderer(GameObject owner, String path) {
        super(owner);
        this.sprite = new Sprite(path);
    }

    @Override
    public void update() {
        
        Game.engine.gameScreen.draw(owner.transform.position, sprite);
    }
    
}
