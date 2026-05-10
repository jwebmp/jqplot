package com.jwebmp.plugins.jqplot.parts.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Defines default methods for JqPlot Renderering
 *
 * @author GedMarc
 * @since 26 Feb 2016
 */
@FunctionalInterface
public interface JQPlotRendererDefault
		extends JQPlotRenderer
{

	@JsonIgnore
	String getRenderer();
}
