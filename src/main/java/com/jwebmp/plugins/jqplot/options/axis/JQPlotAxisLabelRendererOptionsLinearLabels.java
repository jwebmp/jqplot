package com.jwebmp.plugins.jqplot.options.axis;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotAxisLabelRenderer;


/**
 * The default jqPlot axis renderer, creating a numeric axis.
 *
 * @author GedMarc
 * @since 29 Feb 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotAxisLabelRendererOptionsLinearLabels<J extends JQPlotAxisLabelRendererOptionsLinearLabels<J>>
		extends JavaScriptPart<J>
		implements JQPlotAxisLabelRenderer
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * EXPERIMENTAL!!
	 */
	private String breakPoints;
	private String breakTickLabel;//	Label to use at the axis break if breakPoints are specified.
	private Boolean drawBaseline;//	True to draw the axis baseline.
	private Integer baselineWidth;//	width of the baseline in pixels.
	private String baselineColor;//	CSS color spec for the baseline.
	private Boolean forceTickAt0;//	This will ensure that there is always a tick mark at 0.
	private Boolean forceTickAt100;//	This will ensure that there is always a tick mark at 100.
	private Integer tickInset;//	Controls the amount to inset the first and last ticks from the edges of the grid, in multiples of the tick interval.
	private Integer minorTicks;//	Number of ticks to add between “major? ticks.
	private Boolean alignTicks;//	true to align tick marks across opposed axes such as from the y2axis to yaxis.

	/**
	 * The Default Axis Label Renderer Options
	 *
	 * @param linkedGraph
	 */
	public JQPlotAxisLabelRendererOptionsLinearLabels(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * EXPERIMENTAL!! Use at your own risk! Works only with linear axes and the default tick renderer. Array of [start, stop] points to create a broken axis. Broken axes have a
	 * “jump? in them, which
	 * is an immediate transition from a smaller value to a larger value. Currently, axis ticks MUST be manually assigned if using breakPoints by using the axis ticks array
	 * option.
	 *
	 * @return
	 */
	public String getBreakPoints()
	{
		return breakPoints;
	}

	/**
	 * EXPERIMENTAL!! Use at your own risk! Works only with linear axes and the default tick renderer. Array of [start, stop] points to create a broken axis. Broken axes have a
	 * “jump? in them, which
	 * is an immediate transition from a smaller value to a larger value. Currently, axis ticks MUST be manually assigned if using breakPoints by using the axis ticks array
	 * option.
	 *
	 * @param breakPoints
	 */
	@SuppressWarnings("unchecked")
	public J setBreakPoints(String breakPoints)
	{
		this.breakPoints = breakPoints;
		return (J) this;
	}

	/**
	 * Label to use at the axis break if breakPoints are specified.
	 *
	 * @return
	 */
	public String getBreakTickLabel()
	{
		return breakTickLabel;
	}

	/**
	 * Label to use at the axis break if breakPoints are specified.
	 *
	 * @param breakTickLabel
	 */
	@SuppressWarnings("unchecked")
	public J setBreakTickLabel(String breakTickLabel)
	{
		this.breakTickLabel = breakTickLabel;
		return (J) this;
	}

	/**
	 * True to draw the axis baseline.
	 *
	 * @return
	 */
	public Boolean getDrawBaseline()
	{
		return drawBaseline;
	}

	/**
	 * True to draw the axis baseline.
	 *
	 * @param drawBaseline
	 */
	@SuppressWarnings("unchecked")
	public J setDrawBaseline(Boolean drawBaseline)
	{
		this.drawBaseline = drawBaseline;
		return (J) this;
	}

	/**
	 * width of the baseline in pixels.
	 *
	 * @return
	 */
	public Integer getBaselineWidth()
	{
		return baselineWidth;
	}

	/**
	 * width of the baseline in pixels.
	 *
	 * @param baselineWidth
	 */
	@SuppressWarnings("unchecked")
	public J setBaselineWidth(Integer baselineWidth)
	{
		this.baselineWidth = baselineWidth;
		return (J) this;
	}

	/**
	 * colour of the baseline
	 *
	 * @return
	 */
	public String getBaselineColor()
	{
		return baselineColor;
	}

	/**
	 * colour of the baseline
	 *
	 * @param baselineColor
	 */
	@SuppressWarnings("unchecked")
	public J setBaselineColor(String baselineColor)
	{
		this.baselineColor = baselineColor;
		return (J) this;
	}

	/**
	 * true to always force a tick at 0
	 *
	 * @return
	 */
	public Boolean getForceTickAt0()
	{
		return forceTickAt0;
	}

	/**
	 * true to always force a tick at 0
	 *
	 * @param forceTickAt0
	 */
	@SuppressWarnings("unchecked")
	public J setForceTickAt0(Boolean forceTickAt0)
	{
		this.forceTickAt0 = forceTickAt0;
		return (J) this;
	}

	/**
	 * true to force a tick at 100
	 *
	 * @return
	 */
	public Boolean getForceTickAt100()
	{
		return forceTickAt100;
	}

	/**
	 * true to force a tick at 100
	 *
	 * @param forceTickAt100
	 */
	@SuppressWarnings("unchecked")
	public J setForceTickAt100(Boolean forceTickAt100)
	{
		this.forceTickAt100 = forceTickAt100;
		return (J) this;
	}

	/**
	 * Controls the amount to inset the first and last ticks from the edges of the grid, in multiples of the tick interval. 0 is no inset, 0.5 is one half a tick interval, 1 is a
	 * full tick interval,
	 * etc.
	 *
	 * @return
	 */
	public Integer getTickInset()
	{
		return tickInset;
	}

	/**
	 * Controls the amount to inset the first and last ticks from the edges of the grid, in multiples of the tick interval. 0 is no inset, 0.5 is one half a tick interval, 1 is a
	 * full tick interval,
	 * etc.
	 *
	 * @param tickInset
	 */
	@SuppressWarnings("unchecked")
	public J setTickInset(Integer tickInset)
	{
		this.tickInset = tickInset;
		return (J) this;
	}

	/**
	 * Number of ticks to add between “major? ticks. Major ticks are ticks supplied by user or auto computed. Minor ticks cannot be created by user.
	 *
	 * @return
	 */
	public Integer getMinorTicks()
	{
		return minorTicks;
	}

	/**
	 * Number of ticks to add between “major? ticks. Major ticks are ticks supplied by user or auto computed. Minor ticks cannot be created by user.
	 *
	 * @param minorTicks
	 */
	@SuppressWarnings("unchecked")
	public J setMinorTicks(Integer minorTicks)
	{
		this.minorTicks = minorTicks;
		return (J) this;
	}

	/**
	 * true to align tick marks across opposed axes such as from the y2axis to yaxis.
	 *
	 * @return
	 */
	public Boolean getAlignTicks()
	{
		return alignTicks;
	}

	/**
	 * true to align tick marks across opposed axes such as from the y2axis to yaxis.
	 *
	 * @param alignTicks
	 */
	@SuppressWarnings("unchecked")
	public J setAlignTicks(Boolean alignTicks)
	{
		this.alignTicks = alignTicks;
		return (J) this;
	}

	@JsonProperty("renderer")
	@JsonRawValue
	@Override
	public String getRenderer()
	{
		return "$.jqplot.LinearAxisRenderer";
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

}
