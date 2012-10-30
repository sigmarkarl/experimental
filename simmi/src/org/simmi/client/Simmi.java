package org.simmi.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import elemental.html.WebGLRenderingContext;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Simmi implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Canvas c = Canvas.createIfSupported();
		WebGLRenderingContext webgl = (WebGLRenderingContext)elemental.client.Browser.getDocument().createCanvasElement().getContext("experimental-webgl");
		//Matrix m;
		//AudioContext ac = Browser.getWindow().newAudioContext();
		//Browser.getWindow().getNavigator().get
		
	}
}
