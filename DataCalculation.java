package org.ml;

import java.io.IOException;
import tech.tablesaw.api.Table;
import tech.tablesaw.joining.DataFrameJoiner;

public class DataCalculation {
	public static void main(String arg[]) throws IOException
	{
		Table fulfilment_center_info_data=Table.read().csv("E:\\data project\\fulfilment_center_info.csv");
		Table meal_info_data=Table.read().csv("E:\\data project\\meal_info.csv");
		Table test_data=Table.read().csv("E:\\data project\\test.csv");
		Table train_data=Table.read().csv("E:\\data project\\train.csv");
		DataFrameJoiner train = train_data.joinOn("center_id");
		DataFrameJoiner test = test_data.joinOn("center_id");
		train_data=train.inner(fulfilment_center_info_data, "center_id");
		test_data=test.inner(fulfilment_center_info_data, "center_id");
		DataFrameJoiner train1 = train_data.joinOn("meal_id");
		DataFrameJoiner test1 = test_data.joinOn("meal_id");
		train_data=train1.inner(meal_info_data, "meal_id");
		test_data=test1.inner(meal_info_data, "meal_id");
		System.out.println(test_data.structure());
		System.out.println(train_data.structure());
		System.out.println(train_data.shape());
		System.out.println(train_data.summary());
		System.out.println(test_data.summary());
		String centerId="center_id";
		String center_meal_pair=train_data.columnArray()[train_data.columnIndex(centerId)]+"_"+ train_data.columnArray()[train_data.columnIndex("meal_id")];
		for(int r=0;r<train_data.columnCount();r++) {
			System.out.println(test_data.columnArray()[r].summary());
		}
	}
}



