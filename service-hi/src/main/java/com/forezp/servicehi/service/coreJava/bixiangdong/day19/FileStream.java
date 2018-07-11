package com.forezp.servicehi.service.coreJava.bixiangdong.day19;/*
字符流：
FileReader
FileWriter。

BufferedReader
BufferedWriter

字节流：
InputStream  OutputStream

需求，想要操作图片数据。这时就要用到字节流。
复制一个图片.


*/
import com.forezp.servicehi.service.coreJava.bixiangdong.UtilGlobalConfig;

import java.io.*;
class  FileStream
{
	public static void main(String[] args) throws IOException
	{
		readFile_3();
		System.out.println("===================");
		readFile_2();
		System.out.println("===================");
		readFile_1();
		System.out.println("===================");
		writeFile();
	}

	public static void readFile_3()throws IOException
	{
		FileInputStream fis = new FileInputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "demo.txt");

//		int num = fis.available();
		byte[] buf = new byte[fis.available()];//定义一个刚刚好的缓冲区。不用在循环了。

		fis.read(buf);

		System.out.println(new String(buf));

		fis.close();
	}


	public static void readFile_2()throws IOException
	{
		FileInputStream fis = new FileInputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "demo.txt");

		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}

		fis.close();

	}



	public static void readFile_1()throws IOException
	{
		FileInputStream fis = new FileInputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "demo.txt");

		int ch = 0;

		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		}

		fis.close();
	}

	public static void writeFile()throws IOException
	{
		FileOutputStream fos = new FileOutputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "demo_copy.txt");


		fos.write("abcde".getBytes());

		fos.close();


	}
}
