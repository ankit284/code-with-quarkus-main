package com.ankit.standalone;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class DataSources {

	@Inject
	@DataSource("sample")
	AgroalDataSource sampleDataSource;
	
	@Inject
	@DataSource("student")
	AgroalDataSource studentDataSource;
	
	public DataSources() {
		System.out.println("Inside data sources");
	}

	public AgroalDataSource getSampleDataSource() {
		return sampleDataSource;
	}

	public void setSampleDataSource(AgroalDataSource sampleDataSource) {
		this.sampleDataSource = sampleDataSource;
	}

	public AgroalDataSource getStudentDataSource() {
		return studentDataSource;
	}

	public void setStudentDataSource(AgroalDataSource studentDataSource) {
		this.studentDataSource = studentDataSource;
	}
}
