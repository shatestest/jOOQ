/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public enum TLanguage implements org.jooq.MasterDataType<java.lang.Integer> {

	/**
	 * English
	 */
	en(1, "en", "English"),

	/**
	 * Deutsch
	 */
	de(2, "de", "Deutsch"),

	/**
	 * Français
	 */
	fr(3, "fr", "Français"),
	pt(4, "pt", null),
	;

	private final java.lang.Integer id;
	private final java.lang.String cd;
	private final java.lang.String description;

	private TLanguage(java.lang.Integer id, java.lang.String cd, java.lang.String description) {
		this.id = id;
		this.cd = cd;
		this.description = description;
	}

	@Override
	public java.lang.Integer getPrimaryKey() {
		return id;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final java.lang.Integer getId() {
		return id;
	}

	/**
	 * An uncommented item
	 */
	public final java.lang.String getCd() {
		return cd;
	}

	/**
	 * An uncommented item
	 */
	public final java.lang.String getDescription() {
		return description;
	}
}
