package com.jwebmp.plugins.jqplot;

import tools.jackson.core.JacksonException;
import com.guicedee.client.IGuiceContext;
import com.guicedee.client.implementations.ObjectBinderKeys;
import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.graphs.display.JQPlotSeriesItem;
import com.jwebmp.plugins.jqplot.options.JQPlotOptions;
import com.jwebmp.plugins.jqplot.options.JQPlotSeriesOptions;
import com.jwebmp.plugins.jqplot.parts.XAxisTypes;
import com.jwebmp.plugins.jqplot.parts.YAxisTypes;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This class incorporates the JQPlot library from http://www.jqplot.com
 *
 * @param <O>
 * @param <J>
 * @author mmagon
 * @version 3.0
 * <p>
 * Changes to how the Renderering and options work together
 * <p>
 * 3.0 2016/02/28 Implementation into Options interface with JavaScriptFunctions as the base
 * @since 2014/07/08
 */
public class JQPlotGraph<O extends JavaScriptPart<?>, J extends JQPlotGraph<O, J>>
		extends Component<GlobalChildren, NoAttributes, JQPlotGraphFeatures, JQPlotGraphEvents, J>
		implements DisplayObjectType, NoNewLineBeforeClosingTag
{
	
	
	private JQPlotGraphFeature feature;
	private JQPlotOptions<?> options;
	
	private List<JQPlotSeriesItem> seriesData = new ArrayList<>();
	
	private List<JQPlotSeriesItem> x1SeriesData = new ArrayList<>();
	private List<JQPlotSeriesItem> x2SeriesData = new ArrayList<>();
	
	
	public JQPlotGraph()
	{
		super(ComponentTypes.Div);
		addFeature(getFeature());
	}
	
	/**
	 * Creates a feature that will destroy this graph
	 *
	 * @return
	 */
	public JQPlotGraphDestroyFeature createDestroyFeature()
	{
		return new JQPlotGraphDestroyFeature(this);
	}
	
	/**
	 * Gets the feature for the graph. Please don't ever return a null. JQPlotGraphFeature is also fine
	 * <p>
	 *
	 * @return
	 */
	public JQPlotGraphFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQPlotGraphFeature(this);
		}
		return feature;
	}
	
	/**
	 * Sets the feature for this graph
	 *
	 * @param feature
	 */
	public void setFeature(JQPlotGraphFeature feature)
	{
		this.feature = feature;
	}
	
	/**
	 * Renders the data point section on the graph
	 * <p>
	 *
	 * @return The Data Points String
	 */
	public StringBuilder getDataPointRender()
	{
		try
		{
			seriesData.clear();
			seriesData.addAll(x1SeriesData);
			if (!x2SeriesData.isEmpty())
			{
				seriesData.addAll(x2SeriesData);
			}
			return new StringBuilder(IGuiceContext.get(ObjectBinderKeys.DefaultObjectMapper)
			                                     .writeValueAsString(seriesData));
		}
		catch (JacksonException e)
		{
			return new StringBuilder("Failed to construct data renderer " + e.getMessage() + " - " + ExceptionUtils.getStackTrace(e));
		}
	}
	
	;
	
	/**
	 * Returns the graph options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQPlotOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQPlotOptions<>(this);
			getFeature().setOptions(options);
		}
		return options;
	}
	
	/**
	 * Sets the options for this graph
	 *
	 * @param options
	 */
	public void setOptions(JQPlotOptions<?> options)
	{
		this.options = options;
	}
	
	public J addSeries(JQPlotSeriesItem seriesItem, JQPlotSeriesOptions<?, ?, ?> seriesRenderer)
	{
		x1SeriesData.add(seriesItem);
		getOptions().getSeries()
		            .add(seriesRenderer);
		return (J) this;
	}
	
	public J addSeriesX2(JQPlotSeriesItem seriesItem, JQPlotSeriesOptions<?, ?, ?> seriesRenderer)
	{
		x2SeriesData.add(seriesItem);
		seriesRenderer.setXaxis(XAxisTypes.X2Axis);
		seriesRenderer.setYaxis(YAxisTypes.Y2Axis);
		getOptions().getSeries()
		            .add(seriesRenderer);
		return (J) this;
	}
	
	public List<JQPlotSeriesItem> getX1SeriesData()
	{
		return x1SeriesData;
	}
	
	public JQPlotGraph<O, J> setX1SeriesData(List<JQPlotSeriesItem> x1SeriesData)
	{
		this.x1SeriesData = x1SeriesData;
		return this;
	}
	
	public List<JQPlotSeriesItem> getX2SeriesData()
	{
		return x2SeriesData;
	}
	
	public JQPlotGraph<O, J> setX2SeriesData(List<JQPlotSeriesItem> x2SeriesData)
	{
		this.x2SeriesData = x2SeriesData;
		return this;
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
