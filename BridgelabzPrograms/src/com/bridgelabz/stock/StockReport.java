
package com.bridgelabz.stock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockReport 
{
	public static List<StockInformation>list=new ArrayList<StockInformation>();
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/stock.json");
		list = mapper.readValue(file, new TypeReference<List<StockInformation>>(){});
		System.out.println(list);
		long totalPriceOfShare;
		System.out.println("*************************************Stock Report************************************");
		System.out.println();
		System.out.println("Stock Name\t\t\t"+"ShareNumber\t\t"+"PricePerShare\t\t"+"ToatlPriceOfShare\t");
		System.out.println("-------------------------------------------------------------------------------------------------");
		for(int i=0;i<3;i++)
		{
			totalPriceOfShare=(long) (list.get(i).getNumber()*list.get(i).getPrice());
			System.out.println(" "+list.get(i).getName()+"\t\t\t"+list.get(i).getNumber()+"\t\t\t"+
			list.get(i).getPrice()+"\t\t\t"+totalPriceOfShare);
		}
	}
}
