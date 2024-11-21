package com.prolegoma.exercises.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "plugin1")
public class MyPlugin1 extends MySuperMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        super.execute();
        getLog().info("Executing MyPlugin1");
        // Plugin 1 specific logic
    }
}