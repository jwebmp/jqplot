package com.jwebmp.plugins.jqplot;

import com.google.common.base.Strings;
import com.jwebmp.core.Feature;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * This is the default implementation of the JQPlot Graph Library
 *
 * @author mmagon
 * @version 2.0
 * <p>
 * 2016/02/26 Update to the feature for 1.0.9 and updates to the JavaScript Engine
 * @since 2014/07/08
 */
public class JQPlotGraphFeature
		extends Feature<JQPlotGraphFeature, JavaScriptPart<?>, JQPlotGraphFeature>
{
	
	private String dataUrl;
	
	/**
	 * The graph this feature is linked to
	 */
	private JQPlotGraph graph;
	
	public JQPlotGraphFeature(JQPlotGraph forGraph)
	{
		super("JWGraphFeature");
		setComponent(forGraph);
		graph = forGraph;
//		forGraph.getPage()
//		        .addVariable(getVariableName());
	}
	
	public String getVariableName()
	{
		return graph.getID();
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		getGraph().addVariable(getVariableName());
		StringBuilder sb = new StringBuilder();
		
		addQuery("$.jqplot.config.enablePlugins = true;" + getNewLine());
		
		sb.append("if(jw.jqplots === undefined)" +
		          "jw.jqplots={};" +
		          "" +
		          "" +
		          "jw.jqplots.")
		  .append(getVariableName())
		  .append(" = $.");
		/*sb.append(getComponent().asBase()
		                        .getJQueryID())*/
		  sb.append("jqplot(");
		
		sb.append("'" + graph.getID() + "',");
		
		sb.append(Strings.isNullOrEmpty(dataUrl) ? graph.getDataPointRender() : "'" + dataUrl + "'")
		  .append(STRING_COMMNA)
		  .append(getNewLine());
		sb.append(getOptions());
		sb.append(");")
		  .append(getNewLine());
		addQuery(sb.toString());
		
		
		addQuery("$(window).resize(function() {" +
		         "if (jw.jqplots." + getVariableName() + ".data(\"jqplot\"))" +
		         "jw.jqplots." + getVariableName() + ".data(\"jqplot\").replot();" +
		         //	sb.toString() +
		         "});"
		);
	}
	
	/**
	 * Gets the graph with this feature
	 *
	 * @return
	 */
	public JQPlotGraph getGraph()
	{
		return graph;
	}
	
	/**
	 * Sets the graph for this feature
	 *
	 * @param graph
	 */
	public void setGraph(JQPlotGraph graph)
	{
		this.graph = graph;
	}
	
	/**
	 * A data url to use in place of the data render option
	 *
	 * @return
	 */
	public String getDataUrl()
	{
		return dataUrl;
	}
	
	/**
	 * A data url to use in place of the data render option
	 *
	 * @param dataUrl
	 * @return
	 */
	public JQPlotGraphFeature setDataUrl(String dataUrl)
	{
		this.dataUrl = dataUrl;
		return this;
	}
}
