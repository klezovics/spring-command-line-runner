package com.klezovich.cmd_line_runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Task1 implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger(SpringCommandLineRunnerApplication.class);
	
	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			logger.info("Msg from task 1 ... ");
		}

	}

}
