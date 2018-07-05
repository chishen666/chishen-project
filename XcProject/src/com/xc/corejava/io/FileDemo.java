package com.xc.corejava.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		testFile();
	}

	public static void testFile() throws IOException {
		String path = "F:/test/io/";
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
		if (file.exists() && file.isDirectory()) {// 文件是否存在和文件是否是文件夹
			File[] files = file.listFiles();
			for (File f : files) {
				System.out.println("getName: " + f.getName());// 文件名
				System.out.println("getPath: " + f.getPath());// 相对路径
				System.out.println("getAbsolutePath: " + f.getAbsolutePath());// 绝对路径
				System.out.println("getCanonicalPath: " + f.getCanonicalPath());// 解析路径
				System.out.println("getParent: " + f.getParent());// 父目录路径
				System.out.println("canRead: " + f.canRead());// 是否可读
				System.out.println("canWrite: " + f.canWrite());// 是否可写
				System.out.println("canExecute: " + f.canExecute());// 是否可执行
				System.out.println("isFile: " + f.isFile());// 是否是标准文件
				System.out.println("isAbsolute: " + f.isAbsolute());// 是否是绝对路径
				System.out.println("lastModified: " + f.lastModified());// 最后一次更新的时间戳
				System.out.println("length: " + f.length());// 文件的字节数,文件夹=0
				System.out.println("toURI: " + f.toURI());// uri路径
				System.out.println("toURL: " + f.toURI().toURL());// uri路径
			}
		}
	}

	public static void testRandomAccessFile() {

	}
}
