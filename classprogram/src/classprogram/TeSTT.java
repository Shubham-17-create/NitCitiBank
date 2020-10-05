package classprogram;

import java.io.*;
import java.util.Properties;
class TeSTT
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("stdinfo.properties");
		FileInputStream fis = new FileInputStream(f);

		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("101"));
		System.out.println(p.getProperty("104"));

		FileOutputStream fos = new FileOutputStream(f);
		p.setProperty("106","pawan kalyan");
		p.setProperty("104","meghna");
		p.store(fos,"file updated with new content");


	}
}
