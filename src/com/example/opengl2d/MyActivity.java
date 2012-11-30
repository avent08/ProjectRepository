package com.example.opengl2d;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MyActivity extends Activity
{
    private GLSurfaceView mGLSurfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

       // Remove the title bar from the window.
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Make the windows into full screen mode.
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // Create an OpenGL view.
        mGLSurfaceView = new GLSurfaceView(this);
        OpenGLRenderer renderer = new OpenGLRenderer();
		mGLSurfaceView.setRenderer(renderer);
		setContentView(mGLSurfaceView);
    }
}

