package com.wireway.farm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.wireway.farm.screens.SplashScreen;

public class Core extends Game {
    Globals globals;
    @Override
    public void create() {
        globals = new Globals(this);
        setScreen(new SplashScreen());
    }

    public static Globals getGlobals() {
        return((Core) Gdx.app.getApplicationListener()).globals; // turn around to not use static objects on Android, neither to pass this around the entire game.
    }

    @Override
    public void render() {
        super.render();
        globals.update();
    }

    @Override
    public void dispose() {
        super.dispose();
        globals.dispose();
    }
}
