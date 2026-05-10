package com.jwebmp.plugins.jqplot.options.legends;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotLegendRenderer;

/**
 * Default renderer options, nothing really here
 *
 * @author GedMarc
 * @since 1 Mar 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotLegendRendererOptions<J extends JQPlotLegendRendererOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotLegendRenderer
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotLegendRendererOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@JsonIgnore
	@Override
	public String getRenderer()
	{
		return "$.jqplot.DateAxisRenderer";
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
	public void setLinkedGraph(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

}
