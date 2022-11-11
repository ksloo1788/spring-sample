package com.jefflks.schedule;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

public class SampleCommandLine {

	public void run() {
		runScript("/home/test.bat");
	}

	static int iExitValue;
	static String sCommandString;

	public static void runScript(String command) {
		sCommandString = command;
		CommandLine oCmdLine = CommandLine.parse(sCommandString);
		DefaultExecutor oDefaultExecutor = new DefaultExecutor();
		oDefaultExecutor.setExitValue(0);
		try {
			iExitValue = oDefaultExecutor.execute(oCmdLine);
		} catch (ExecuteException e) {
			System.err.println("Execution failed.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Permission denied.");
			e.printStackTrace();
		}
	}

}
