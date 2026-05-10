package com.jwebmp.plugins.jqplot.parts.interfaces;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * @author GedMarc
 * @since 26 Feb 2016
 */
@FunctionalInterface
public interface JQPlotMarkerRenderer
		extends JQPlotRenderer
{

	/**
	 * Returns the marker renderer
	 *
	 * @return
	 */
	@JsonProperty("markerRenderer")
	@JsonRawValue
	String getMarkerRenderer();

}
