package dev.m0b1.uishock.html;

import j2html.tags.specialized.HeadTag;
import j2html.tags.specialized.LinkTag;
import j2html.tags.specialized.MetaTag;
import j2html.tags.specialized.ScriptTag;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import static j2html.TagCreator.head;
import static j2html.TagCreator.link;
import static j2html.TagCreator.meta;
import static j2html.TagCreator.script;
import static j2html.TagCreator.title;

@RequiredArgsConstructor
@Service
public final class Head {

	// Class constructor variables
	private final Environment environment;

	public HeadTag build() {

		var headTag = head(
			metaCharset(),
			metaTag("description", "An alternative user interface for PiShock devices."),
			metaTag("viewport", "width=device-width, initial-scale=1"),
			title("UiShock"),
			linkRelHref("apple-touch-icon", "/apple-touch-icon.png").withSizes("180x180"),
			linkRelHref("icon", "/favicon-32x32.png").withSizes("32x32").withType("image/png"),
			linkRelHref("icon", "/favicon-16x16.png").withSizes("16x16").withType("image/png"),
			linkRelHref("manifest", "/site.webmanifest"),
			linkRelHref("stylesheet", "/webjars/picocss__pico/2.0.3/css/pico.css"),
			linkRelHref("stylesheet", "/uishock.css"),
			linkScript("/uishock.js")
		);

		addLiveReloadScriptForDevelopment(headTag);

		return headTag;
	}

	private MetaTag metaCharset() {
		return meta()
			.withCharset("utf-8");
	}

	private MetaTag metaTag(String name, String content) {
		return meta()
			.withName(name)
			.withContent(content);
	}

	private LinkTag linkRelHref(String rel, String href) {
		return link()
			.withRel(rel)
			.withHref(href);
	}

	private ScriptTag linkScript(String src) {
		return script()
			.isDefer()
			.withSrc(src);
	}

	private void addLiveReloadScriptForDevelopment(HeadTag headTag) {
		if (environment.matchesProfiles("development")) {
			headTag.with(linkScript("http://localhost:35729/livereload.js"));
		}
	}

}
