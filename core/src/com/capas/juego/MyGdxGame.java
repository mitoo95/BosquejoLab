package com.capas.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Texture img3;
	Texture img4;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("backg.png");
		img2 = new Texture("tiles.png");
		img3 = new Texture("Archer.png");
		img4 = new Texture("sword.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(255, 255, 255, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img,0,0,700,500);
		batch.draw(img2,0,0,700,500);
		batch.draw(img3,100,50,200,160);
		batch.draw(img4,250,55,80,30);
		batch.end();
	}
}
