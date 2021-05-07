package org.ml;

	import java.io.IOException;

	import tech.tablesaw.api.Table;
	import tech.tablesaw.joining.DataFrameJoiner;
	import tech.tablesaw.plotly.Plot;
	import tech.tablesaw.plotly.components.Figure;
	import tech.tablesaw.plotly.components.Layout;
	import tech.tablesaw.plotly.traces.BoxTrace;
	import tech.tablesaw.plotly.traces.HistogramTrace;

	public class dataanalyssis
	{
	public static void main(String arg[])
	{
	System.out.println("data Analysis");
	try
	{
	Table bank_data=Table.read().csv("E:\\data project\\fulfilment_center_info.csv");
	Table bank_data=Table.read().csv("E:\\data project\\meal_info.csv");
	Table bank_data=Table.read().csv("E:\\data project\\test.csv");
	Table bank_data=Table.read().csv("E:\\data project\\train.csv");
	System.out.println(bank_data.shape());
	System.out.println(bank_data.first(7));
	System.out.println(bank_data.last(7));  
	System.out.println(bank_data.summary());
	System.out.println(bank_data.structure());
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	}
	}