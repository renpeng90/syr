package com.forezp.servicehi.service.coreJava.bixiangdong.day21;

class EncodeDemo2
{
	public static void main(String[] args) throws Exception
	{
		String s = "jͨ";

		byte[] by = s.getBytes("gbk");

		for(byte b : by)
		{
			System.out.println(Integer.toBinaryString(b&255));
		}


		System.out.println("Hello World!");
	}
}
