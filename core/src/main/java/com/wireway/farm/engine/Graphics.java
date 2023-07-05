package com.wireway.farm.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wireway.farm.Core;

public class Graphics {
    public static Viewport createExtendViewport() {
        Viewport viewport = new ExtendViewport(getMinWorldWidth(), getMinWorldHeight());
        viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        viewport.apply(true);
        return viewport;
    }

    public static int getMinWorldWidth() {
        return Core.getGlobals().worldWidht;
    }

    public static int getMinWorldHeight() {
        float ratio = getScreenRatio();
        return (int) ratio * Core.getGlobals().worldWidht;
    }

    public static float getScreenRatio() {
        return (float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth();
    }
}
