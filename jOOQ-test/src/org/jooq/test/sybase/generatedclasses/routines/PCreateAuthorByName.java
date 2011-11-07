/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 877137224;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_FIRST_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("p_first_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> P_LAST_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("p_last_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super(org.jooq.SQLDialect.SYBASE, "p_create_author_by_name", org.jooq.test.sybase.generatedclasses.Dba.DBA);

		addInParameter(P_FIRST_NAME);
		addInParameter(P_LAST_NAME);
	}

	/**
	 * Set the <code>p_first_name</code> parameter to the routine
	 */
	public void setPFirstName(java.lang.String value) {
		setValue(P_FIRST_NAME, value);
	}

	/**
	 * Set the <code>p_last_name</code> parameter to the routine
	 */
	public void setPLastName(java.lang.String value) {
		setValue(P_LAST_NAME, value);
	}
}
