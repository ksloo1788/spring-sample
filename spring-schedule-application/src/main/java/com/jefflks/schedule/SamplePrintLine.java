package com.jefflks.schedule;

import org.springframework.stereotype.Component;

@Component
public class SamplePrintLine {


	public void run() {

		try {
			System.out.println("SamplePrintLine");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}