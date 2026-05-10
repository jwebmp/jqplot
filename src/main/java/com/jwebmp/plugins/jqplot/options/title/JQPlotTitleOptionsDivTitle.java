package com.jwebmp.plugins.jqplot.options.title;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotTitleRenderer;

/**
 * @author GedMarc
 * @since 29 Feb 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotTitleOptionsDivTitle
		extends JavaScriptPart<JQPlotTitleOptionsDivTitle>
		implements JQPlotTitleRenderer
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotTitleOptionsDivTitle(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;

	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.DivTitleRenderer";
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
