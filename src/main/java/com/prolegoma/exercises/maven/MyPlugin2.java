package com.prolegoma.exercises.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "plugin2")
public class MyPlugin2 extends MySuperMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        super.execute();
        getLog().info("Executing MyPlugin2");
        // Plugin 2 specific logic
    }
}