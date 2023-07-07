package com.wireway.farm.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wireway.farm.Core;

public class SplashScreen extends BaseScreen {
    Texture logo;
    SpriteBatch batch;
    Music startSound;

    @Override
    public void show() {
        super.show();
        logo = new Texture("logo.png");
        batch = new SpriteBatch();

        startSound = Gdx.audio.newMusic((Gdx.files.internal("sound/logo.mp3")));
        startSound.play();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (!Core.getGlobals().assetManager.update() || Core.getGlobals().elapsedAppTime < 2) {
            batch.setProjectionMatrix(viewport.getCamera().combined);
            batch.begin();
                batch.draw(logo, viewport.getWorldWidth() / 2 - (float) logo.getWidth() / 2, viewport.getWorldHeight() / 2 - (float) logo.getHeight() / 2);
            batch.end();
        } else {
            Core.getGlobals().game.setScreen(new GameScreen());
        }
    }

    @Override
    public void dispose() {
        logo.dispose();
        batch.dispose();
        startSound.dispose();
    }
}
