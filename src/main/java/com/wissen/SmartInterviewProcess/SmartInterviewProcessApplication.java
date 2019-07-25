package com.wissen.SmartInterviewProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SmartInterviewProcessApplication {

	static void authImplicit() {
		// If you don't specify credentials when constructing the client, the client
		// library will
		// look for credentials via the environment variable
		// GOOGLE_APPLICATION_CREDENTIALS.
//		Storage storage = (Storage) StorageOptions.getDefaultInstance().getService();

//		System.out.println("Buckets:");
//		Page<Bucket> buckets = storage.list();
//		for (Bucket bucket : buckets.iterateAll()) {
//			System.out.println(bucket.toString());
//		}
	}

	public static void main(String[] args) {

		SpringApplication.run(SmartInterviewProcessApplication.class, args);

	}

}
