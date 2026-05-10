package com.jwebmp.plugins.jqplot.options.title;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jwebmp.core.htmlbuilder.css.colours.ColourHex;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.css.text.TextAlignments;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqplot.JQPlotGraph;
import com.jwebmp.plugins.jqplot.parts.interfaces.JQPlotTitleRenderer;


/**
 * Handles the text attribute of the JWGraph
 * <p>
 *
 * @author mmagon
 * @since 2014/07/09
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JQPlotTitleOptions<O extends JavaScriptPart<O> & JQPlotTitleRenderer, J extends JQPlotTitleOptions<O, J>>
		extends JavaScriptPart<J>
{

	@JsonIgnore
	private JQPlotGraph linkedGraph;

	/**
	 * text of the text
	 */
	private String text;
	/**
	 * Whether or not to show the text
	 */
	private Boolean show;

	/**
	 * CSS font-family spec for the text.
	 */
	private FontFamilies fontFamily;
	/**
	 * CSS font-size spec for the text.
	 */
	private Integer fontSize;
	/**
	 * CSS text-align spec for the text.
	 */
	private TextAlignments textAlign;
	/**
	 * CSS color spec for the text.
	 */
	private String textColor;
	/**
	 * for creating a DOM element for the text, see $.jqplot.DivTitleRenderer.
	 */
	private String renderer;

	private O rendererOptions;

	/**
	 * Constructs a Title Part for the JWGraph
	 * <p>
	 *
	 * @param title
	 * 		The text to add to the graph
	 * @param graph
	 * 		The linked graph
	 */
	public JQPlotTitleOptions(String title, JQPlotGraph graph)
	{
		text = title;
		linkedGraph = graph;
	}

	/**
	 * Whether or not to show the text
	 * <p>
	 *
	 * @return
	 */
	public Boolean getShow()
	{
		return show;
	}

	/**
	 * Whether or not to show the text
	 * <p>
	 *
	 * @param show
	 */
	@SuppressWarnings("unchecked")
	public J setShow(Boolean show)
	{
		this.show = show;
		return (J) this;
	}

	/**
	 * Returns the actual text
	 * <p>
	 *
	 * @return
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * Sets the actual text
	 * <p>
	 *
	 * @param text
	 */
	@SuppressWarnings("unchecked")
	public J setText(String text)
	{
		this.text = text;
		return (J) this;
	}

	/**
	 * Returns the font family
	 * <p>
	 *
	 * @return
	 */
	public FontFamilies getFontFamily()
	{
		return fontFamily;
	}

	/**
	 * Sets the font family
	 * <p>
	 *
	 * @param fontFamily
	 */
	@SuppressWarnings("unchecked")
	public J setFontFamily(FontFamilies fontFamily)
	{
		this.fontFamily = fontFamily;
		return (J) this;
	}

	/**
	 * Sets the font size
	 * <p>
	 *
	 * @return
	 */
	public Integer getFontSize()
	{
		return fontSize;
	}

	/**
	 * Sets the font size
	 * <p>
	 *
	 * @param fontSize
	 */
	@SuppressWarnings("unchecked")
	public J setFontSize(Integer fontSize)
	{
		this.fontSize = fontSize;
		return (J) this;
	}

	/**
	 * Returns the text alignment
	 * <p>
	 *
	 * @return
	 */
	public TextAlignments getTextAlign()
	{
		return textAlign;
	}

	/**
	 * sets the text alignment
	 * <p>
	 *
	 * @param textAlign
	 */
	@SuppressWarnings("unchecked")
	public J setTextAlign(TextAlignments textAlign)
	{
		this.textAlign = textAlign;
		return (J) this;
	}

	/**
	 * Sets the colour of the text
	 * <p>
	 *
	 * @return
	 */
	public String getTextColor()
	{
		return textColor;
	}

	/**
	 * Sets the text colour
	 * <p>
	 *
	 * @param textColor
	 */
	@SuppressWarnings("unchecked")
	public J setTextColor(ColourHex textColor)
	{
		this.textColor = textColor.getValue();
		return (J) this;
	}

	/**
	 * Returns the text renderer
	 * <p>
	 *
	 * @return
	 */
	public String getRenderer()
	{
		return renderer;
	}

	/**
	 * Returns the current renderer options or the default
	 *
	 * @return
	 */
	public O getRendererOptions()
	{
		if (rendererOptions == null)
		{
			setRendererOptions((O) new JQPlotTitleOptionsDivTitle(linkedGraph));
		}
		return rendererOptions;
	}

	/**
	 * Sets the renderer options
	 *
	 * @param rendererOptions
	 */
	@SuppressWarnings("unchecked")
	public J setRendererOptions(O rendererOptions)
	{
		this.rendererOptions = rendererOptions;
		renderer = rendererOptions.getRenderer();
		return (J) this;
	}

}
