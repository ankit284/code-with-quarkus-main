package com.ankit.standalone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;


public class MyWorkload implements QuarkusApplication {

	@Inject
	DataSources dataSources;

	@Override
	public int run(String... args) throws Exception {
		System.out.println("Do startup logic here");
		for(String arg : args) {
			System.out.println(" Arguments " + arg);
		}

		try (Connection con1 = dataSources.getSampleDataSource().getConnection();
				PreparedStatement stmt = con1.prepareStatement("SELECT * FROM user");) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("User name :: " + rs.getString("username"));
			}
			rs.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

		try (Connection con1 = dataSources.getStudentDataSource().getConnection();
				PreparedStatement stmt = con1.prepareStatement("SELECT * FROM student");) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("First name :: " + rs.getString("first_name"));
			}
			rs.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

		Quarkus.waitForExit();
		return 0;
	}
}