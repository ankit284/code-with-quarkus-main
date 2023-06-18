package com.ankit.standalone;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.CommandLineArguments;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class AgentLauncherMain {

	@Inject
	@CommandLineArguments
	String[] args;
	
	public static void main(String[] args) {
		System.out.println(" Hello world from Quarkus Main");
		Quarkus.run(MyWorkload.class, args);
	}

}
