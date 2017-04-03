package sample.filehandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class GetWordCountOfParticularWord 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("C:\\myworkSpace\\SampleFiles\\abc.txt");
		BufferedReader br=new  BufferedReader(fr);
		String line="";
		String particularWord="Rahul";
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		while((line=br.readLine())!=null)
		{
			StringTokenizer sr=new StringTokenizer(line,",");
			while(sr.hasMoreTokens())
			{
				String s=sr.nextToken();
				if(s.equals(particularWord))
				{
					if(h.containsKey(s))
					{
						h.put(s,h.get(s)+1);
					}
					else
					{
						h.put(s, 1);	
					}
				}
			}
		}
		for(Map.Entry<String, Integer> e:h.entrySet())
		{
			System.out.println(e.getKey()+""+""+e.getValue());
		}
	}
}
