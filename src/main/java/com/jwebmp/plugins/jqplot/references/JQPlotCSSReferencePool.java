package com.jwebmp.plugins.jqplot.references;

import com.jwebmp.core.base.references.CSSReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum JQPlotCSSReferencePool
{

	GraphCore(new CSSReference("jqPlot", 1.08, "bower_components/jqplot-jwebswing/jquery.jqplot.css", "https://cdnjs.cloudflare.com/ajax/libs/jqPlot/1.0.8/jquery.jqplot.css"));

	private final CSSReference reference;

	JQPlotCSSReferencePool(CSSReference reference)
	{
		this.reference = reference;

	}

	public CSSReference getReference()
	{
		return reference;
	}

}
