package com.forezp.servicehi.service.coreJava.bixiangdong.day18;/*
演示对已有文件的数据续写。
*/
import java.io.*;
class  FileWriterDemo3
{
	public static void main(String[] args) throws IOException
	{

		//传递一个true参数，代表不覆盖已有的文件。并在已有文件的末尾处进行数据续写。
		FileWriter fw = new FileWriter("E:/日常的记录日志，重要/技术，自己，别人/bixiangdong/download/SystemDemo_copy.txt",true);

		fw.write("nihao\r\nxiexie");

		fw.close();
	}
}
