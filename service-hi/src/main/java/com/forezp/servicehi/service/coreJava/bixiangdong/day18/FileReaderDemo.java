package com.forezp.servicehi.service.coreJava.bixiangdong.day18;

import java.io.*;

class  FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		//创建一个文件读取流对象，和指定名称的文件相关联。
		//要保证该文件是已经存在的，如果不存在，会发生异常FileNotFoundException
		FileReader fr = new FileReader("E:/日常的记录日志，重要/技术，自己，别人/bixiangdong/download/demo.txt");

		//调用读取流对象的read方法。
		//read():一次读一个字符。而且会自动往下读。

		int ch = 0;

		while((ch=fr.read())!=-1)
		{
			System.out.println();
		}


//		while(true)
//		{
//			int ch = fr.read();
//			if(ch==-1)
//				break;
//			System.out.println("ch="+(char)ch);
//		}



		fr.close();


	}
}
