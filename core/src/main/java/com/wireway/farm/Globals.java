package com.wireway.farm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Globals {
    public final int worldWidht = 300; // The world height changes accordingly to the device screen ratio on the extend viewport.
    public float elapsedAppTime;
    public Game game;
    public AssetManager assetManager;

    public Globals(Game game) {
        this.game = game;
        loadAssets();
    }

    private void loadAssets() {
        assetManager = new AssetManager();
        assetManager.load("atlas.atlas", TextureAtlas.class);
    }

    public void update() {
        elapsedAppTime += Gdx.graphics.getDeltaTime();
    }

    public void dispose() {
        assetManager.dispose();
    }
}
