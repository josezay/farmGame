package com.wireway.farm.screens;

import com.wireway.farm.actors.Duck;

public class GameScreen extends BaseScreen {

    @Override
    public void show() {
        super.show();
        Duck duck = new Duck();
        stage.addActor(duck);
        viewport.getCamera().position.set(duck.getX() + 60, duck.getY() + 50, 0);
        viewport.getCamera().update();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.draw();
    }
}
