package com.dubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
	private static final Log LOG = LogFactory.getLog(Launcher.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(new String[] { "classpath:spring-context.xml" });
			context.start();

		} catch (Exception e) {
			if (null != context) {
				context.close();
			}
			LOG.error("== DubboProvider context start error:", e);
		}
		synchronized (Launcher.class) {
			while (true) {
				try {
					Launcher.class.wait();
				} catch (InterruptedException e) {
					LOG.error("== synchronized error:", e);
				}
			}
		}
	}
}
