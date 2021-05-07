package org.ml;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
public class regression
{ 
	public static void main(String[] args)
	
			throws Exception
	{
		DataSource source =new DataSource("E:\\data project\\train.csv");
		Instances dataset=source.getDataSet();
		dataset.setClassIndex(dataset.numAttributes()-1);
		//linear Regression
		LinearRegression lr=new LinearRegression();
		lr.buildClassifier(dataset);
		
		Evaluation lreval =new Evaluation(dataset);
	    lreval.evaluateModel(lr,dataset);
		System.out.println(lreval.toSummaryString());
		
		
	}

}

