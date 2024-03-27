package dev.m0b1.uishock.html;

import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.HeadTag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static j2html.TagCreator.body;
import static j2html.TagCreator.document;
import static j2html.TagCreator.html;
import static j2html.TagCreator.main;

@RequiredArgsConstructor
@Service
public class Template {

	// Class constructor field(s)
	private final Footer footer;
	private final Head head;
	private final Header header;

	public String build(DomContent... mainContent) {

		var headTag = head.build();
		var bodyTag = buildBody(mainContent);
		var htmlTag = buildHtml(headTag, bodyTag);
		var documentTag = document().render();

		return String.format("%s%n%s", documentTag, htmlTag);
	}

	private String buildHtml(HeadTag headTag, BodyTag bodyTag) {
		return html()
			.withLang("en")
			.attr("data-theme", "light")
			.with(headTag)
			.with(bodyTag)
			.renderFormatted();
	}

	private BodyTag buildBody(DomContent... mainContent) {

		var headerTag = header.build();
		var mainTag = main(mainContent);
		var footerTag = footer.build();

		return body(
			headerTag,
			mainTag,
			footerTag
		);
	}

}
