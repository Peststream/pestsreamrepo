package com.infocrats.utils;

import org.apache.log4j.Logger;

public class Log {
	private Log() {

	}

	private static Logger logger = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String sTestcaseName) {
		logger.info(
				"*****************************************************************************************************************");
		logger.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$          " + sTestcaseName
				+ "            $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		logger.info(
				"*****************************************************************************************************************");
	}

	public static void endTestCase(String sTestCaseName) {
		logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      " + sTestCaseName + "-E---N---D-"
				+ "             XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

	}

	public static void info(String message) {
		logger.info(message);
	}

	public static void warn(String message) {
		logger.warn(message);
	}

	public static void error(String message) {
		logger.error(message);
	}

	public static void fatal(String message) {
		logger.fatal(message);
	}

	public static void debug(String message) {
		logger.debug(message);
	}
}
