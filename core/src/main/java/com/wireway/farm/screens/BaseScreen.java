package com.wireway.farm.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wireway.farm.engine.Graphics;

public class BaseScreen implements Screen {
    protected Viewport viewport;
    protected Stage stage;

    @Override
    public void show() {
        initializeScreen();
        initializeScene2D();
    }

    private void initializeScreen() {
        viewport = Graphics.createExtendViewport();
    }

    private void initializeScene2D() {
        stage = new Stage(viewport);
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

    }
}
