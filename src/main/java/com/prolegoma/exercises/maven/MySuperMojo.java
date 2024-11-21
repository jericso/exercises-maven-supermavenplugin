package com.prolegoma.exercises.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public abstract class MySuperMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Executing MySuperMojo");
		// Common logic for both plugins
	}
}