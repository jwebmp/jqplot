package com.jwebmp.plugins.jqplot.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.options.axis.JQPlotAxisOptions;


/**
 * The settings for the axes available
 *
 * @author GedMarc
 * @since 28 Feb 2016
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotAxes<J extends JQPlotAxes<J>>
		extends JavaScriptPart<J>
{


	@JsonIgnore
	private JQPlotGraph linkedGraph;

	@JsonProperty("xaxis")
	private JQPlotAxisOptions xAxis;
	@JsonProperty("x2axis")
	private JQPlotAxisOptions x2Axis;
	@JsonProperty("yaxis")
	private JQPlotAxisOptions yAxis;
	@JsonProperty("y2axis")
	private JQPlotAxisOptions y2Axis;
	@JsonProperty("y3axis")
	private JQPlotAxisOptions y3Axis;
	@JsonProperty("y4axis")
	private JQPlotAxisOptions y4Axis;
	@JsonProperty("y5axis")
	private JQPlotAxisOptions y5Axis;
	@JsonProperty("y6axis")
	private JQPlotAxisOptions y6Axis;
	@JsonProperty("y7axis")
	private JQPlotAxisOptions y7Axis;
	@JsonProperty("y8axis")
	private JQPlotAxisOptions y8Axis;
	@JsonProperty("y9axis")
	private JQPlotAxisOptions y9Axis;
	@JsonProperty("zaxis")
	private JQPlotAxisOptions zAxis;

	public JQPlotAxes(JQPlotGraph linkedGraph)
	{
		this.linkedGraph = linkedGraph;
	}

	/**
	 * Gets the X Axis Options
	 *
	 * @return
	 */
	public JQPlotAxisOptions getxAxis()
	{
		if (xAxis == null)
		{
			xAxis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return xAxis;
	}

	/**
	 * Sets the X Axis
	 *
	 * @param xAxis
	 */
	@SuppressWarnings("unchecked")
	public J setxAxis(JQPlotAxisOptions xAxis)
	{
		this.xAxis = xAxis;
		return (J) this;
	}

	/**
	 * Returns the linked graph with this options
	 *
	 * @return
	 */
	public JQPlotGraph getLinkedGraph()
	{
		return linkedGraph;
	}

	/**
	 * Sets the linked graph with this object
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
	 * Gets the X 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getX2Axis()
	{
		if (x2Axis == null)
		{
			x2Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return x2Axis;
	}

	/**
	 * Sets the X 2 Axis
	 *
	 * @param x2Axis
	 */
	@SuppressWarnings("unchecked")
	public J setX2Axis(JQPlotAxisOptions x2Axis)
	{
		this.x2Axis = x2Axis;
		return (J) this;
	}

	/**
	 * Gets the Y Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getyAxis()
	{
		if (yAxis == null)
		{
			yAxis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return yAxis;
	}

	/**
	 * Sets the Y Axis
	 *
	 * @param yAxis
	 */
	@SuppressWarnings("unchecked")
	public J setyAxis(JQPlotAxisOptions yAxis)
	{
		this.yAxis = yAxis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY2Axis()
	{
		if (y2Axis == null)
		{
			y2Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y2Axis;
	}

	/**
	 * Sets the Y 2Axis
	 *
	 * @param y2Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY2Axis(JQPlotAxisOptions y2Axis)
	{
		this.y2Axis = y2Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY3Axis()
	{
		if (y3Axis == null)
		{
			y3Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y3Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y3Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY3Axis(JQPlotAxisOptions y3Axis)
	{
		this.y3Axis = y3Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY4Axis()
	{
		if (y4Axis == null)
		{
			y4Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y4Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y4Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY4Axis(JQPlotAxisOptions y4Axis)
	{
		this.y4Axis = y4Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY5Axis()
	{
		if (y5Axis == null)
		{
			y5Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y5Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y5Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY5Axis(JQPlotAxisOptions y5Axis)
	{
		this.y5Axis = y5Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY6Axis()
	{
		if (y6Axis == null)
		{
			y6Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y6Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y6Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY6Axis(JQPlotAxisOptions y6Axis)
	{
		this.y6Axis = y6Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY7Axis()
	{
		if (y7Axis == null)
		{
			y7Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y7Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y7Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY7Axis(JQPlotAxisOptions y7Axis)
	{
		this.y7Axis = y7Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY8Axis()
	{
		if (y8Axis == null)
		{
			y8Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y8Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y8Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY8Axis(JQPlotAxisOptions y8Axis)
	{
		this.y8Axis = y8Axis;
		return (J) this;
	}

	/**
	 * Gets the Y 2 Axis
	 *
	 * @return
	 */
	public JQPlotAxisOptions getY9Axis()
	{
		if (y9Axis == null)
		{
			y9Axis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return y9Axis;
	}

	/**
	 * Sets the Y 3 Axis
	 *
	 * @param y9Axis
	 */
	@SuppressWarnings("unchecked")
	public J setY9Axis(JQPlotAxisOptions y9Axis)
	{
		this.y9Axis = y9Axis;
		return (J) this;
	}

	/**
	 * Gets the Z Axis Options
	 *
	 * @return
	 */
	public JQPlotAxisOptions getzAxis()
	{
		if (zAxis == null)
		{
			zAxis = new JQPlotAxisOptions(getLinkedGraph());
		}
		return zAxis;
	}

	/**
	 * Sets the zAxis Options
	 *
	 * @param zAxis
	 */
	@SuppressWarnings("unchecked")
	public J setzAxis(JQPlotAxisOptions zAxis)
	{
		this.zAxis = zAxis;
		return (J) this;
	}

}
