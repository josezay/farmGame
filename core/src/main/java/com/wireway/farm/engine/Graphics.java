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

    private static int getMinWorldWidth() {
        return Core.getGlobals().worldWidht;
    }

    private static int getMinWorldHeight() {
        float ratio = getScreenRatio();
        return (int) ratio * Core.getGlobals().worldWidht;
    }

    private static float getScreenRatio() {
        return (float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth();
    }
}
