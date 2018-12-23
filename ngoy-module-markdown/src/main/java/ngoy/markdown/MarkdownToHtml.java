package ngoy.markdown;

/**
 * Performs the actual conversion from markdown to html.
 * <p>
 * Client may provide an own instance/class.
 * 
 * @author krizz
 */
public interface MarkdownToHtml {
	String convert(String markdown);
}
