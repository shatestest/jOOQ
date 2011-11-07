/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PArrays1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1390836565;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.Integer[]>("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> OUT_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.Integer[]>("OUT_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays1() {
		super(org.jooq.SQLDialect.HSQLDB, "P_ARRAYS1", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(java.lang.Integer[] value) {
		setValue(IN_ARRAY, value);
	}

	public java.lang.Integer[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
