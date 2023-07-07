package com.wireway.farm.globals;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Disposable;

public class Globals implements Disposable {
    public final int worldWidht = 190; // The world height changes accordingly to the device screen ratio on the extend viewport.
    public float elapsedAppTime;
    public Game game;
    public Assets assets;

    public Globals(Game game) {
        this.game = game;
        assets = new Assets();
    }

    public void update() {
        elapsedAppTime += Gdx.graphics.getDeltaTime();
    }

    public void dispose() {
        assets.dispose();
    }
}
