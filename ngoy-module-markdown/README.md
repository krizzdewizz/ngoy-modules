# ngoy-module-markdown

Write Markdown inside an element or in a `.md` resource.

## Usage
Add the module dependency to your ngoy project:

`build.gradle`:
```
repositories {
	maven { url "https://jitpack.io" }
	implementation("com.github.krizzdewizz.ngoy-modules:ngoy-module-markdown:1.0.1")
}
```

`pom.xml`:
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
    <groupId>com.github.krizzdewizz.ngoy-modules</groupId>
    <artifactId>ngoy-module-markdown</artifactId>
    <version>1.0.1</version>
</dependency>
```

Add the `MarkdownModule` to the `imports` of your app's module:

```java
@Component(...)
@NgModule(imports = { MarkdownModule.class })
public class AppComponent  {
}
```

Then you can use the `<ngoy-markdown>` component. Full bindings/interpolation are available.

Write markdown inside the element:

```html
<ngoy-markdown>
# hello {{ 'markdown' }}
</ngoy-markdown>
```

Reference a resource loaded with `Class#getResourceAsStream()`:

```html
<ngoy-markdown url="/static/doc.md"></ngoy-markdown>
```

`url` should be an absolute path.

Optionally, add a table of contents from all the markdown's headings by specifing the `toc` attribute:

```html
<ngoy-markdown toc></ngoy-markdown>
```

The optional `toc-exclude` attribute specifies a `java.util.Set` of headings to exclude from the toc:

```java
@Component(...)
public class MyCmp {
    public static final Set<String> TOC_EXCLUDE = new HashSet<>(asList( //
                , "exclude-me" //
        ));
}
```

```html
<ngoy-markdown url="/static/doc.md" toc [toc-exclude]="TOC_EXCLUDE"></ngoy-markdown>
```

You would need to position/style the `ngoy-markdown-toc` component.

Example:

```css
ngoy-markdown-toc {
    position: fixed;
    display: block;
    top: 4rem;
    height: calc(100vh - 4rem);
}
```

You can provide your own `MarkdownToHtml` converter:

```java
public class MyMarkdownToHtmlConverter implements MarkdownToHtml {
    public String convert(String markdown) {
        return ...; //
    }
}

Ngoy<App> ngoy = Ngoy.app(App.class)
    .providers(Provider.useClass(MarkdownToHtml.class, MyMarkdownToHtmlConverter.class))
    .build();
```