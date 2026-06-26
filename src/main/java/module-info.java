import com.jwebmp.plugins.jqplot.implementations.JQPlotInclusionModule;

module com.jwebmp.plugins.jqplot {
	exports com.jwebmp.plugins.jqplot;
	exports com.jwebmp.plugins.jqplot.parts;
	exports com.jwebmp.plugins.jqplot.parts.interfaces;
	exports com.jwebmp.plugins.jqplot.options;
	exports com.jwebmp.plugins.jqplot.options.axis;
	exports com.jwebmp.plugins.jqplot.options.grid;
	exports com.jwebmp.plugins.jqplot.options.legends;
	exports com.jwebmp.plugins.jqplot.options.series;
	exports com.jwebmp.plugins.jqplot.options.ticks;
	exports com.jwebmp.plugins.jqplot.options.title;
	exports com.jwebmp.plugins.jqplot.graphs;
	exports com.jwebmp.plugins.jqplot.graphs.display;
	exports com.jwebmp.plugins.jqplot.references;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.google.common;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqplot.JQPlotPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with JQPlotInclusionModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqplot.implementations.JQPlotExclusionsModule;

	opens com.jwebmp.plugins.jqplot to tools.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.parts to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.parts.interfaces to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.axis to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.grid to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.legends to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.series to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.ticks to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.options.title to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.graphs to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqplot.graphs.display to tools.jackson.databind, com.jwebmp.core;
}
