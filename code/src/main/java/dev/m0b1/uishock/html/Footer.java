package dev.m0b1.uishock.html;

import j2html.tags.specialized.FooterTag;
import org.springframework.stereotype.Service;

import static j2html.TagCreator.footer;

@Service
public class Footer {

	// Class constructor field(s)
	// N/A

	public FooterTag build() {
		return footer();
	}

}
