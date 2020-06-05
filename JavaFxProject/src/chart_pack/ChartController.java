package chart_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;

public class ChartController implements Initializable{
	@FXML
	private PieChart pieChart;
	@FXML
	private AreaChart<String, Integer> areaChart;
	@FXML
	private BarChart<String, Integer> barChart;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("A", 50.0),
				new PieChart.Data("B", 30.0),
				new PieChart.Data("C", 10.0),
				new PieChart.Data("D", 10.0)
				));
		
		XYChart.Series<String, Integer> series1 = new XYChart.Series<String,Integer>();
		series1.setName("남자");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("2005" , 70),
				new XYChart.Data("2010" , 30),
				new XYChart.Data("2015" , 20),
				new XYChart.Data("2020" , 50)
				));
		XYChart.Series<String, Integer> series2 = new XYChart.Series<String,Integer>();
		series2.setName("여자");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data("2005" , 20),
				new XYChart.Data("2010" , 50),
				new XYChart.Data("2015" , 70),
				new XYChart.Data("2020" , 20)
				));
		barChart.setData(FXCollections.observableArrayList(series1, series2));

		XYChart.Series<String, Integer> series3 = new XYChart.Series<String,Integer>();
		series3.setName("온도");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data("2005" , 20),
				new XYChart.Data("2010" , 50),
				new XYChart.Data("2015" , 70),
				new XYChart.Data("2020" , 200)
				));
		areaChart.setData(FXCollections.observableArrayList(series3));
	}

}
