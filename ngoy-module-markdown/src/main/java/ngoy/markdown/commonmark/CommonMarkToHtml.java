package ngoy.markdown.commonmark;

import ngoy.markdown.MarkdownToHtml;
import org.commonmark.ext.heading.anchor.HeadingAnchorExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import static java.util.Arrays.asList;

public class CommonMarkToHtml implements MarkdownToHtml {

    @Override
    public String convert(String markdown) {
        Parser parser = Parser.builder()
                .build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder()
                .extensions(asList(HeadingAnchorExtension.create()))
                .build();
        return renderer.render(document);
    }
}
