package com.forezp.servicehi.service.coreJava.bixiangdong.day19;

/*
演示mp3的复制。通过缓冲区。
BufferedOutputStream
BufferedInputStream


*/
import com.forezp.servicehi.service.coreJava.bixiangdong.UtilGlobalConfig;

import java.io.*;
class  CopyMp3
{
	public static void main(String[] args) throws IOException
	{
		long start = System.currentTimeMillis();
		copy_2();
		long end = System.currentTimeMillis();

		System.out.println((end-start)+"毫秒");

		long start1 = System.currentTimeMillis();
		copy_1();
		long end1 = System.currentTimeMillis();

		System.out.println((end1-start1)+"毫秒");
	}

	public static void copy_2()throws IOException
	{
		MyBufferedInputStream bufis = new MyBufferedInputStream(new FileInputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "1.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+"3.mp3"));

		int by = 0;

		System.out.println("第一个字节:"+bufis.myRead());

		while((by=bufis.myRead())!=-1)
		{
			System.out.println(by);
			bufos.write(by);
		}

		bufos.close();
		bufis.myClose();
	}

	//通过字节流的缓冲区完成复制。
	public static void copy_1()throws IOException
	{
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "1.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream(UtilGlobalConfig.URL_LOACL_PREFIX_ONE+ "4.mp3"));

		int by = 0;

		while((by=bufis.read())!=-1)
		{
			bufos.write(by);
		}

		bufos.close();
		bufis.close();


	}
}
