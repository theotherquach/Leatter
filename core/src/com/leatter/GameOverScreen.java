package com.leatter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameOverScreen implements Screen
{
	private OrthographicCamera camera;
	private LeatterGame game;

	public GameOverScreen(LeatterGame game)
	{
		this.game = game;
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0.9f,0.9f,0.9f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
			game.font.draw(game.batch, "You got eaten!", 100, 150);
			game.font.draw(game.batch, "Press space to try again!", 100, 100);
			game.batch.end();

		if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
		{
			game.setScreen(new GameScreen(game));
			dispose();
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	// Rest of class still omitted...

}