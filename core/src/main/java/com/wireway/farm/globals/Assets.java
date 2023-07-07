package com.wireway.farm.globals;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable {
    public AssetManager assetManager;

    public Assets() {
        loadAssets();
    }

    private void loadAssets() {
        assetManager = new AssetManager();
        assetManager.load("atlas.atlas", TextureAtlas.class);
    }

    public Animation<TextureRegion> getAnimation(String name, float frameDuration, int tileWidth, int tileHeight, boolean flipX, boolean flipY){
        TextureRegion textureRegion = getTextureRegion(name);
        textureRegion.flip(flipX, flipY);
        return new Animation<>(frameDuration, textureRegion.split(tileWidth, tileHeight)[0]);
    }

    public Animation<TextureRegion> getAnimation(String name, float frameDuration, int tileWidth, int tileHeight){
        return getAnimation(name, frameDuration, tileWidth, tileHeight, false, false);
    }

    public Animation<TextureRegion> getAnimation(String name, float frameDuration){
        return getAnimation(name, frameDuration, 16, 16);
    }

    public Animation<TextureRegion> getAnimation(String name){
        return getAnimation(name, 0.1f);
    }

    public TextureRegion getTextureRegion(String name) {
        return getTextureAtlas().findRegion(name);
    }

    public TextureAtlas getTextureAtlas() {
        return assetManager.get("atlas.atlas", TextureAtlas.class);
    }

    @Override
    public void dispose() {
        assetManager.dispose();
    }
}
