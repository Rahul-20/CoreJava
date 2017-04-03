package sample.filehandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class GetWordCountFromFile 
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileReader fr =new FileReader("C:\\myworkSpace\\SampleFiles\\abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String line = "";
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		while ((line = br.readLine()) != null) 
		{
			StringTokenizer  sz=new StringTokenizer(line,",");
			while(sz.hasMoreTokens())
			{
				String tok=sz.nextToken();
				if(!h.containsKey(tok))
					h.put(tok,1);
				else
				{
					h.put(tok,h.get(tok)+1);
				}
			}
		}
		for(Map.Entry<String, Integer> e:h.entrySet())
		{
			System.out.println(e.getKey()+""+""+e.getValue());
		}
	}
}
