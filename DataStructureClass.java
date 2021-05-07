package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.joining.DataFrameJoiner;

public class DataStructureClass {

	public static void main(String arg[])
	{
	System.out.println("data Analysis");
	try
	{
	         Table fulfilment_center_info_data=Table.read().csv("E:\\data project\\fulfilment_center_info.csv");
	         Table meal_info_data=Table.read().csv("E:\\data project\\meal_info.csv");
	         Table test_data=Table.read().csv("E:\\data project\\test.csv");
	         Table train_data=Table.read().csv("E:\\data project\\train.csv");
	         
	System.out.println(train_data.structure());
	System.out.println(fulfilment_center_info_data.structure());
	System.out.println(meal_info_data.structure());
	System.out.println(test_data.structure());
    
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	}
}
