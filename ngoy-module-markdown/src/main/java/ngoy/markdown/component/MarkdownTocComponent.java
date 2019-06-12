package ngoy.markdown.component;

import ngoy.core.Component;
import ngoy.core.HostBinding;
import ngoy.core.Input;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@Component(selector = "ngoy-markdown-toc", templateUrl = "markdown-toc.component.html")
public class MarkdownTocComponent {
    @HostBinding("class.d-none")
    public final boolean dNone = true;

    @HostBinding("class.d-md-block")
    public final boolean dMdBlock = true;

    private List<List<Object>> entries;

    @Input
    public Set<String> exclude = new HashSet<>();

    @Input
    public void setEntries(List<List<Object>> entries) {
        this.entries = entries;
    }

    public List<List<Object>> getEntries() {
        if (exclude == null || exclude.isEmpty()) {
            return entries;
        }
        return entries.stream()
                .filter(e -> !exclude.contains(e.get(0)))
                .collect(toList());
    }
}
