package com.jwebmp.plugins.jqplot;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for jqPlot — versatile jQuery plotting plugin.
 */
@PluginInformation(pluginName = "JqPlot",
		pluginUniqueName = "jq-plot",
		pluginDescription = "jqPlot is a versatile and expandable jQuery plotting plugin with customizable renderers for lines, bars, pies, bubbles, and more.",
		pluginVersion = "1.0.9",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jqplot, jquery, graphs, graphing, plotting, charts",
		pluginSubtitle = "A Versatile and Expandable jQuery Plotting Plugin!",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "http://www.jqplot.com/",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "http://www.jqplot.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/jqplot",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "jqplot",
		pluginModuleName = "com.jwebmp.plugins.jqplot",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "jqplot", version = "^1.0.9")
@NgScript("node_modules/jqplot/jqplot.js")
@NgStyleSheet("node_modules/jqplot/jqplot.css")
public class JQPlotPageConfigurator
		implements IPageConfigurator<JQPlotPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
