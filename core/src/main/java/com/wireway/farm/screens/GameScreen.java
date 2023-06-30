package com.wireway.farm.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wireway.farm.Core;

public class GameScreen implements Screen {
    OrthographicCamera camera;
    Viewport viewport;
    float ratio;

    @Override
    public void show() {
        camera = new OrthographicCamera();
        ratio = (float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth();
        viewport = new ExtendViewport(Core.getGlobals().worldWidht, ratio * Core.getGlobals().worldWidht, camera);
        viewport.update(Gdx.app.getGraphics().getWidth(), Gdx.app.getGraphics().getHeight());
        viewport.apply(true);
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}
