package com.ankit.standalone;


import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@Startup(value = 1)
@ApplicationScoped
public class EagerAppBean1 {


 public EagerAppBean1() {
	 System.out.println("this" + this.getClass().getCanonicalName());
 }


}