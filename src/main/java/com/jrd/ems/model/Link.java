package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Link {

	
	private String link;
	
	private String rel;

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 *  link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}

	/**
	 *  rel the rel to set
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	
}
