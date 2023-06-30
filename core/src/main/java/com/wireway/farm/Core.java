package com.wireway.farm;

import com.badlogic.gdx.Game;
import com.wireway.farm.screens.GameScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Core extends Game {
    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
