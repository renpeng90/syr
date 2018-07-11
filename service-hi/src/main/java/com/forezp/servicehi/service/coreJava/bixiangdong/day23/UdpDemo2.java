package com.forezp.servicehi.service.coreJava.bixiangdong.day23;

import java.net.*;
import java.io.*;
class  UdpSend2
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();

		BufferedReader bufr =
				new BufferedReader(new InputStreamReader(System.in));

		String line = null;

		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;

			byte[] buf = line.getBytes();

			DatagramPacket dp =
					new DatagramPacket(buf,buf.length,InetAddress.getByName("172.16.40.13"),10001);

			ds.send(dp);
		}
		ds.close();
	}
}



class  UdpRece2
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(10001);

		while(true)
		{
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);

			ds.receive(dp);

			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(),0,dp.getLength());


			System.out.println(ip+"::"+data);
		}
	}
}
