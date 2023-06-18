package com.ankit.standalone;


import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@Startup(value = 2)
@ApplicationScoped
public class EagerAppBean2 {
	 
	 public EagerAppBean2() {
		 System.out.println("this" + this.getClass().getCanonicalName() );
	 }

}