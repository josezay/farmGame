package com.wireway.farm.actors;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.wireway.farm.Core;

public class Duck extends Actor {
    private final Animation<TextureRegion> idleLeft;

    public Duck() {
        idleLeft = Core.getGlobals().assets.getAnimation("duck_idle");
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(getTextureRegion(), getX(), getY());
    }

    private TextureRegion getTextureRegion () {
        return idleLeft.getKeyFrame(Core.getGlobals().elapsedAppTime, true);
    }
}
