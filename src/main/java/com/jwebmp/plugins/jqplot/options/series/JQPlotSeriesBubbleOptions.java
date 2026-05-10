package com.jwebmp.plugins.jqplot.options.series;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotSeriesRenderer;


/**
 * @author GedMarc
 * @version 1.0
 * @since 09 Aug 2015
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotSeriesBubbleOptions<J extends JQPlotSeriesBubbleOptions<J>>
		extends JavaScriptPart<J>
		implements JQPlotSeriesRenderer
{


	/**
	 * The graph that this is linked to
	 */
	@JsonIgnore
	private JQPlotGraph linkedGraph;
	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 */
	private Boolean varyBubbleColors;
	/**
	 * True to scale the bubble radius based on plot size.
	 */

	private Boolean autoscaleBubbles;
	/**
	 * Multiplier the bubble size if autoscaleBubbles is true.
	 */

	private Integer autoscaleMultiplier;
	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 */

	private Integer autoscalePointsFactor;
	/**
	 * True to escape HTML in bubble label text.
	 */

	private Boolean escapeHtml;
	/**
	 * True to highlight bubbles when Moused over.
	 */

	private Boolean highlightMouseOver;
	/**
	 * True to highlight when a mouse button is pressed over a bubble.
	 */

	private Boolean highlightMouseDown;
	/**
	 * An array of colors to use when highlighting a slice.
	 */

	private String highlightColors;
	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 */

	private Double bubbleAlpha;
	/**
	 * Alpha transparency to apply when highlighting bubble.
	 */

	private Double highlightAlpha;
	/**
	 * True to color the bubbles with gradient fills instead of flat colors.;
	 */

	private Boolean bubbleGradients;
	/**
	 * True to show labels on bubbles (if any), false to not show.
	 */

	private Boolean showLabels;

	/**
	 * Constructs a new Bubble Options for the given graph
	 *
	 * @param linkedGraph
	 */
	public JQPlotSeriesBubbleOptions(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Gets the graph associated with this options
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Sets the graph that is linked to this options
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
	 * Sets the series render to bubble
	 *
	 * @return
	 */
	@Override
	public String getRenderer()
	{
		return "$.jqplot.BubbleRenderer";
	}

	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 *
	 * @return
	 */
	public boolean getVaryBubbleColors()
	{
		return varyBubbleColors;
	}

	/**
	 * True to vary the color of each bubble in this series according to the seriesColors array.
	 *
	 * @param varyBubbleColors
	 */
	@SuppressWarnings("unchecked")
	public J setVaryBubbleColors(boolean varyBubbleColors)
	{
		this.varyBubbleColors = varyBubbleColors;
		return (J) this;
	}

	/**
	 * True to scale the bubble radius based on plot size.
	 *
	 * @return
	 */
	public boolean getAutoscaleBubbles()
	{
		return autoscaleBubbles;
	}

	/**
	 * True to scale the bubble radius based on plot size.
	 *
	 * @param autoscaleBubbles
	 */
	@SuppressWarnings("unchecked")
	public J setAutoscaleBubbles(boolean autoscaleBubbles)
	{
		this.autoscaleBubbles = autoscaleBubbles;
		return (J) this;
	}

	/**
	 * Multiplier the bubble size if autoscaleBubbles get true.
	 *
	 * @return
	 */
	public int getAutoscaleMultiplier()
	{
		return autoscaleMultiplier;
	}

	/**
	 * Multiplier the bubble size if autoscaleBubbles get true.
	 *
	 * @param autoscaleMultiplier
	 */
	@SuppressWarnings("unchecked")
	public J setAutoscaleMultiplier(int autoscaleMultiplier)
	{
		this.autoscaleMultiplier = autoscaleMultiplier;
		return (J) this;
	}

	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 *
	 * @return
	 */
	public int getAutoscalePointsFactor()
	{
		return autoscalePointsFactor;
	}

	/**
	 * Factor which decreases bubble size based on how many bubbles on on the chart.
	 *
	 * @param autoscalePointsFactor
	 */
	@SuppressWarnings("unchecked")
	public J setAutoscalePointsFactor(int autoscalePointsFactor)
	{
		this.autoscalePointsFactor = autoscalePointsFactor;
		return (J) this;
	}

	/**
	 * True to escape html in bubble label text.
	 *
	 * @return
	 */
	public boolean getEscapeHtml()
	{
		return escapeHtml;
	}

	/**
	 * True to escape html in bubble label text.
	 *
	 * @param escapeHtml
	 */
	@SuppressWarnings("unchecked")
	public J setEscapeHtml(boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return (J) this;
	}

	/**
	 * True to highlight bubbles when moused over.
	 *
	 * @return
	 */
	public boolean getHighlightMouseOver()
	{
		return highlightMouseOver;
	}

	/**
	 * True to highlight bubbles when moused over.
	 *
	 * @param highlightMouseOver
	 */
	@SuppressWarnings("unchecked")
	public J setHighlightMouseOver(boolean highlightMouseOver)
	{
		this.highlightMouseOver = highlightMouseOver;
		return (J) this;
	}

	/**
	 * True to highlight when a mouse button get pressed over a bubble.
	 *
	 * @return
	 */
	public boolean getHighlightMouseDown()
	{
		return highlightMouseDown;
	}

	/**
	 * True to highlight when a mouse button get pressed over a bubble.
	 *
	 * @param highlightMouseDown
	 */
	@SuppressWarnings("unchecked")
	public J setHighlightMouseDown(boolean highlightMouseDown)
	{
		this.highlightMouseDown = highlightMouseDown;
		return (J) this;
	}

	/**
	 * An array of colors to use when highlighting a slice.
	 *
	 * @return
	 */
	public String getHighlightColors()
	{
		return highlightColors;
	}

	/**
	 * An array of colors to use when highlighting a slice.
	 *
	 * @param highlightColors
	 */
	@SuppressWarnings("unchecked")
	public J setHighlightColors(String highlightColors)
	{
		this.highlightColors = highlightColors;
		return (J) this;
	}

	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 *
	 * @return
	 */
	public double getBubbleAlpha()
	{
		return bubbleAlpha;
	}

	/**
	 * Alpha transparency to apply to all bubbles in this series.
	 *
	 * @param bubbleAlpha
	 */
	@SuppressWarnings("unchecked")
	public J setBubbleAlpha(double bubbleAlpha)
	{
		this.bubbleAlpha = bubbleAlpha;
		return (J) this;
	}

	/**
	 * Alpha transparency to apply when highlighting bubble.
	 *
	 * @return
	 */
	public double getHighlightAlpha()
	{
		return highlightAlpha;
	}

	/**
	 * Alpha transparency to apply when highlighting bubble.
	 *
	 * @param highlightAlpha
	 */
	@SuppressWarnings("unchecked")
	public J setHighlightAlpha(double highlightAlpha)
	{
		this.highlightAlpha = highlightAlpha;
		return (J) this;
	}

	/**
	 * True to color the bubbles with gradient fills instead of flat colors.
	 *
	 * @return
	 */
	public boolean getBubbleGradients()
	{
		return bubbleGradients;
	}

	/**
	 * True to color the bubbles with gradient fills instead of flat colors.
	 *
	 * @param bubbleGradients
	 */
	@SuppressWarnings("unchecked")
	public J setBubbleGradients(boolean bubbleGradients)
	{
		this.bubbleGradients = bubbleGradients;
		return (J) this;
	}

	/**
	 * True to show labels on bubbles (if any), false to not show.
	 *
	 * @return
	 */
	public boolean getShowLabels()
	{
		return showLabels;
	}

	/**
	 * True to show labels on bubbles (if any), false to not show.
	 *
	 * @param showLabels
	 */
	@SuppressWarnings("unchecked")
	public J setShowLabels(boolean showLabels)
	{
		this.showLabels = showLabels;
		return (J) this;
	}

}
