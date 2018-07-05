package com.xc.corejava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IoDemo {

	public static void main(String[] args) {
		byteIo();
	}

	public static void byteIo() {
		try {
			InputStream is = new FileInputStream("F:/test/io/io.txt");
			System.out.println(is.available());
			byte[] buff = new byte[100];
			is.read(buff);
			System.out.println(new String(buff, "UTF-8"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
