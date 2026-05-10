package com.jwebmp.plugins.jqplot.options.legends;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotLegendPieRenderer;

/**
 * Default renderer options, nothing really here
 *
 * @author GedMarc
 * @since 1 Mar 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotLegendRendererPieOptions<J extends JQPlotLegendRendererPieOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotLegendPieRenderer
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
	 * Fixed with of legend.
	 */
	private Integer width;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotLegendRendererPieOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@Override
	@JsonProperty("renderer")
	@JsonRawValue
	@JsonIgnore
	public String getRenderer()
	{
		return "$.jqplot.PieRenderer";
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
	public J setNumberColumns(Integer numberColumns)
	{
		this.numberColumns = numberColumns;
		return (J) this;
	}

	/**
	 * Fixed with of legend.
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * Fixed with of legend.
	 *
	 * @param width
	 */
	public J setWidth(Integer width)
	{
		this.width = width;
		return (J) this;
	}

}
