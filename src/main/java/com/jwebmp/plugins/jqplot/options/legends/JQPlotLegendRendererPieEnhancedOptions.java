package com.jwebmp.plugins.jqplot.options.legends;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotLegendRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @since 1 Mar 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotLegendRendererPieEnhancedOptions<J extends JQPlotLegendRendererPieEnhancedOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotLegendRenderer
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * Maximum number of rows in the legend.
	 */
	private Integer numberRows;
	/**
	 * Maximum number of columns in the legend.
	 */
	private Integer numberColumns;
	/**
	 * false to not enable series on/off toggling on the legend.
	 */
	private Boolean seriesToggle;
	/**
	 * True to replot the chart after toggling series on/off.
	 */
	private Boolean seriesToggleReplot;
	/**
	 * true to toggle series with a show/hide method only and not allow fading in/out.
	 */
	private Boolean disableIEFading;
	/**
	 * optional array of toolTip text corresponding to each pie slice
	 */
	private List<String> toolTips;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotLegendRendererPieEnhancedOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@JsonIgnore
	@Override
	public String getRenderer()
	{
		return "$.jqplot.EnhancedPieLegendRenderer";
	}

	/**
	 * Gets the linked graph
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Sets the linked graph
	 *
	 * @param linkedGraph
	 */
	@SuppressWarnings("unchecked")
	public J setLinkedGraph(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
		return (J) this;
	}

	/**
	 * Maximum number of rows in the legend.
	 *
	 * @return
	 */
	public Integer getNumberRows()
	{
		return numberRows;
	}

	/**
	 * Maximum number of rows in the legend.
	 *
	 * @param numberRows
	 */
	@SuppressWarnings("unchecked")
	public J setNumberRows(Integer numberRows)
	{
		this.numberRows = numberRows;
		return (J) this;
	}

	/**
	 * Maximum number of columns in the legend.
	 *
	 * @return
	 */
	public Integer getNumberColumns()
	{
		return numberColumns;
	}

	/**
	 * Maximum number of columns in the legend.
	 *
	 * @param numberColumns
	 */
	@SuppressWarnings("unchecked")
	public J setNumberColumns(Integer numberColumns)
	{
		this.numberColumns = numberColumns;
		return (J) this;
	}

	/**
	 * false to not enable series on/off toggling on the legend.
	 *
	 * @return
	 */
	public Boolean getSeriesToggle()
	{
		return seriesToggle;
	}

	/**
	 * false to not enable series on/off toggling on the legend.
	 *
	 * @param seriesToggle
	 */
	@SuppressWarnings("unchecked")
	public J setSeriesToggle(Boolean seriesToggle)
	{
		this.seriesToggle = seriesToggle;
		return (J) this;
	}

	/**
	 * True to replot the chart after toggling series on/off.
	 *
	 * @return
	 */
	public Boolean getSeriesToggleReplot()
	{
		return seriesToggleReplot;
	}

	/**
	 * True to replot the chart after toggling series on/off.
	 *
	 * @param seriesToggleReplot
	 */
	@SuppressWarnings("unchecked")
	public J setSeriesToggleReplot(Boolean seriesToggleReplot)
	{
		this.seriesToggleReplot = seriesToggleReplot;
		return (J) this;
	}

	/**
	 * true to toggle series with a show/hide method only and not allow fading in/out.
	 *
	 * @return
	 */
	public Boolean getDisableIEFading()
	{
		return disableIEFading;
	}

	/**
	 * true to toggle series with a show/hide method only and not allow fading in/out.
	 *
	 * @param disableIEFading
	 */
	@SuppressWarnings("unchecked")
	public J setDisableIEFading(Boolean disableIEFading)
	{
		this.disableIEFading = disableIEFading;
		return (J) this;
	}

	/**
	 * optional array of toolTip text corresponding to each pie slice
	 *
	 * @return
	 */
	public List<String> getToolTips()
	{
		if (toolTips == null)
		{
			toolTips = new ArrayList<>();
		}
		return toolTips;
	}

	/**
	 * optional array of toolTip text corresponding to each pie slice
	 *
	 * @param toolTips
	 */
	@SuppressWarnings("unchecked")
	public J setToolTips(List<String> toolTips)
	{
		this.toolTips = toolTips;
		return (J) this;
	}

}
