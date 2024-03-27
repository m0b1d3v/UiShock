package dev.m0b1.uishock.html;

import j2html.tags.specialized.H1Tag;
import j2html.tags.specialized.HeaderTag;
import j2html.tags.specialized.ImgTag;
import org.springframework.stereotype.Service;

import static j2html.TagCreator.a;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.hr;
import static j2html.TagCreator.img;

@Service
public class Header {

	// Class constructor field(s)
	// N/A

	public HeaderTag build() {
		return header(
			logo(),
			rootLink(),
			hr()
		);
	}

	private ImgTag logo() {
		return img()
			.withAlt("UiShock logo")
			.withHeight("180px")
			.withSrc("/apple-touch-icon.png")
			.withWidth("180px");
	}

	private H1Tag rootLink() {

		var linkTag = a()
			.withHref("/")
			.withText("UiShock");

		return h1(linkTag);
	}

}
