package com.bridgelabz.oops.stockaccount;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
public interface StockInterface
{
	
	public void stockAccount(String newFile) throws JsonParseException, JsonMappingException, IOException;
	public void buy(int amount, String symbol) throws JsonGenerationException, JsonMappingException, IOException;
	public void sell(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException;
	public void valueOf() throws JsonParseException, JsonMappingException, IOException;
	public void printReport() throws JsonParseException, JsonMappingException, IOException;
	public void removeShare(String symbol) throws JsonParseException, JsonMappingException, IOException;
	
	
}
