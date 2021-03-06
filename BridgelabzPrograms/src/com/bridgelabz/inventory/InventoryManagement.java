/*  Purpose: Reading data from JSON file and calculate weight and price for each inventory.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 14-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.inventory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.inventory.model.InventoryModel;
import com.bridgelabz.inventory.model.Pulse;
import com.bridgelabz.inventory.model.Rice;
import com.bridgelabz.inventory.model.Wheat;
import com.bridgelabz.utility.OOPUtility;

public class InventoryManagement  
{
	public static List<Inventory> inventoryList = new ArrayList<Inventory>();
	public static void main(String[] args) throws Exception 
	{

    ObjectMapper mapper=new ObjectMapper();
    BufferedReader reader = new BufferedReader(new FileReader("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/inventory.json" ));
     
    //InventoryMethods1.display(inventoryList);
    List<Rice> rice=new ArrayList<Rice>();
	List<Wheat> wheat=new ArrayList<Wheat>();
	List<Pulse> pulse=new ArrayList<Pulse>();
	InventoryModel list = mapper.readValue(reader, InventoryModel.class );
	System.out.println(list); 
	rice=list.getRice();
	System.out.println("Total Rice: "+rice);
	wheat=list.getWheat();
	System.out.println("Total Wheat: "+wheat);
	pulse=list.getPulse();
	System.out.println("Total Pulse: "+pulse);
	   
	//variable declaration
	   long totalWeight,totalPrice;
	   String kg="Kg";
	   String rs="Rs";
        int counter=0;
        //while loop
        while(counter>=0)
        {  
            System.out.println("Inventory Products");
            System.out.println("1. Wheat");
            System.out.println("2. Rice");
            System.out.println("3. Pulse");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter Your Choice:");
            int choice1=OOPUtility.isInt();
            //switch case
          switch(choice1)
          {
          case 1:
        	
        	  System.out.println("--Available Wheats in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.println("----------");
        		  System.out.println(list.getWheat().get(i).getName());
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		 totalWeight=list.getWheat().get(i).getWeight();
        		 String name=list.getWheat().get(i).getName();
        		  System.out.println("Weight of "+name+" Wheat : "+totalWeight +kg);
        	  }
        	  System.out.println();
    
        	  totalWeight=list.getWheat().get(0).getWeight()+list.getWheat().get(1).getWeight()+list.getWheat().get(2).getWeight();
        	  System.out.println("Total Weight of Wheat : "+totalWeight +kg);
        	  System.out.println();
    
        	  for(int i=0;i<3;i++)
        	  {
        		  totalPrice =list.getWheat().get(i).getWeight()*list.getWheat().get(i).getPrice();
        		  String name=list.getWheat().get(i).getName();
        		  System.out.println("Price of "+name+" Wheat : "+totalPrice +rs);
        	  }
        	  System.out.println();
        	  totalWeight =list.getWheat().get(0).getWeight()*list.getWheat().get(0).getPrice()+ list.getWheat().get(1).getWeight()*list.getWheat().get(1).getPrice()+ list.getWheat().get(2).getWeight()*list.getWheat().get(2).getPrice();
        	  System.out.println("Total Price of Wheat : "+totalWeight);
        	  System.out.println();
        	  break;
        	  
          case 2:
        	  
        	  System.out.println("--Available Rice in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.println("----------");
        		  System.out.println(list.getRice().get(i).getName());
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  totalWeight=list.getRice().get(i).getWeight();
        		  String name=list.getRice().get(i).getName();
        		  System.out.println("Weight of "+name+ " Rice : "+totalWeight +kg);
        	  }
        	  System.out.println();
    
        	  totalWeight=list.getRice().get(0).getWeight()+list.getRice().get(1).getWeight()+list.getRice().get(2).getWeight();
        	  System.out.println("Total Weight of Rice : "+totalWeight +kg);
        	  System.out.println();
    
        	  for(int i=0;i<3;i++)
        	  {
        		  totalWeight =list.getRice().get(i).getWeight()*list.getRice().get(i).getPrice();
        		  String name=list.getRice().get(i).getName();
        		  System.out.println("Price of "+name+" Rice : "+totalWeight +rs);
        	  }
        	  System.out.println();
        	  totalWeight =list.getRice().get(0).getWeight()*list.getRice().get(0).getPrice()+ list.getRice().get(1).getWeight()*list.getRice().get(1).getPrice()+ list.getRice().get(2).getWeight()*list.getRice().get(2).getPrice();
        	  System.out.println("Total Price of Rice : "+totalWeight);
        	  System.out.println();
        	  break;
        	  
          case 3:
        	  
        	  System.out.println("--Available Pulses in Inventory--");
        	  for(int i=0;i<3;i++)
        	  {
        		  System.out.println("----------");
        		  System.out.println(list.getPulse().get(i).getName());
        	  
        	  }
        	  System.out.println();
        	  for(int i=0;i<3;i++)
        	  {
        		  totalWeight=list.getPulse().get(i).getWeight();
        		  String name=list.getPulse().get(i).getName();
        		  System.out.println("Weight of "+name +" Pulse : "+totalWeight +kg);
        	  }
        	  System.out.println();
    
        	  totalWeight=list.getPulse().get(0).getWeight()+list.getPulse().get(1).getWeight()+list.getPulse().get(2).getWeight();
        	  System.out.println("Total Weight of Pulse : "+totalWeight +kg);
        	  System.out.println();
    
        	  for(int i=0;i<3;i++)
        	  {
        		  totalWeight =list.getPulse().get(i).getWeight()*list.getPulse().get(i).getPrice();
        		  String name=list.getPulse().get(i).getName();
        		  System.out.println("Price of "+name+" Pulse : "+totalWeight +rs);
        	  }
        	  System.out.println();
        	  totalWeight =list.getPulse().get(0).getWeight()*list.getPulse().get(0).getPrice()+ list.getPulse().get(1).getWeight()*list.getPulse().get(1).getPrice()+ list.getPulse().get(2).getWeight()*list.getPulse().get(2).getPrice();
        	  System.out.println("Total Price of Pulse : "+totalWeight);
        	  System.out.println();
        	  break;
        	  
          case 4:
        	  counter=1;
        	  System.out.println("Exit");
        	  return;
        	//default condition
          default:
        	System.out.println("You Entered Wrong Choice!");
        	 counter=1;
        	 return;
        	  
          }//end switch case
        }//end for loop
	}//end main
}//end class
