/**
 * - 02/2008: Class created by Nicolas Richasse
 * 
 * Changelog:
 * 	- class created
 * 
 * To do:
 * 	- ...
 */

package net.nlanr.jperf.ui.chart;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractChartPanel extends JPanel
{
	protected JFreeChart	jFreeChart;
	protected ChartPanel	chartPanel;

	public AbstractChartPanel()
	{
		init();
	}

	private void init()
	{
		// layout configuration
		this.setLayout(new BorderLayout());
	}
	
	public void setLowQuality()
	{
		jFreeChart.getRenderingHints().clear();
	}
	
	public ChartPanel getChartPanel()
	{
		return chartPanel;
	}

	public JFreeChart getJFreeChart()
	{
		return jFreeChart;
	}
}
