package org.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.joining.DataFrameJoiner;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis
{
public static void main(String arg[])
{
System.out.println("data Analysis");
try
{
     Table fulfilment_center_info_data=Table.read().csv("E:\\data project\\fulfilment_center_info.csv");
     Table meal_info_data=Table.read().csv("E:\\data project\\meal_info.csv");
     Table test_data=Table.read().csv("E:\\data project\\test.csv");
     Table train_data=Table.read().csv("E:\\data project\\train.csv");
     Table meal_info=train_data.sortAscendingOn("num_orders");
     Table week_info=train_data.sortAscendingOn("week");
            System.out.println(meal_info.shape());
            System.out.println(week_info);
            System.out.println(meal_info);
                   Layout layout1 = Layout.builder().title("Distribution of meal_id").build();
                   HistogramTrace trace1 = HistogramTrace.builder(train_data.nCol("meal_id")).build();
                   Plot.show(new Figure(layout1, trace1));
                       Layout layout3 = Layout.builder().title(" train.csv").build();
                       BoxTrace trace3 =BoxTrace.builder(train_data.categoricalColumn("num_orders"), train_data.nCol("num_orders")).build();
                       Plot.show(new Figure(layout3, trace3));
}
catch(IOException e)
{
e.printStackTrace();
}
}
}

