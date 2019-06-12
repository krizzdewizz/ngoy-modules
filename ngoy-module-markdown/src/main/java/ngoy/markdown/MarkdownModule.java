package ngoy.markdown;

import ngoy.core.NgModule;
import ngoy.core.Provide;
import ngoy.markdown.commonmark.CommonMarkToHtml;
import ngoy.markdown.component.MarkdownComponent;
import ngoy.markdown.component.MarkdownTocComponent;

@NgModule(declarations = {MarkdownComponent.class, MarkdownTocComponent.class}, provide = {@Provide(provide = MarkdownToHtml.class, useClass = CommonMarkToHtml.class)})
public class MarkdownModule {
}
