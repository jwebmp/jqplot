package com.jwebmp.plugins.jqplot;

import com.jwebmp.core.Feature;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * This is the default implementation of the JQPlot Graph Library
 *
 * @author mmagon
 * @version 2.0
 * <p>
 * 2016/02/26 Update to the feature for 1.0.9 and updates to the JavaScript Engine
 * @since 2014/07/08
 */
public class JQPlotGraphDestroyFeature
		extends Feature<JQPlotGraphDestroyFeature, JavaScriptPart<?>, JQPlotGraphDestroyFeature>
{
	/**
	 * The graph this feature is linked to
	 */
	private JQPlotGraph graph;
	
	public JQPlotGraphDestroyFeature(JQPlotGraph forGraph)
	{
		super("JWGraphFeature");
		setComponent(forGraph);
		graph = forGraph;
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
		addQuery("if(!jw.jqplots){jw.jqplots={};}" +
		         "if(jw.jqplots." + graph.getID() + " !== null){" +
		         "if (jw.jqplots." + graph.getID() + ".data(\"jqplot\") !== null) {" +
		         //     "alert('destroying jqplot');" +
		         "try{jw.jqplots." + graph.getID() + ".data(\"jqplot\").destroy();" +
		         "}catch(err){}" +
		         "finally{" +
		         "jw.jqplots." + graph.getID() + " = null;" +
		         "}" +
		         "   }" +
		         "}"
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
}
