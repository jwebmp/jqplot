package com.jwebmp.plugins.jqplot.parts;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
public enum TickParts
{

	Outside,
	Inside,
	Cross;

	TickParts()
	{

	}

	/**
	 * Returns the name of the enumeration in lower case
	 * <p>
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
