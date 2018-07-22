package com.xc.study.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

	private static final Properties p = new Properties();

	static {
		InputStream in = PropertiesUtils.class.getResourceAsStream("/study/applicationContext.properties");
		try {
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String getValue(String key) {
		return key == null ? "" : p.getProperty(key);
	}
}
