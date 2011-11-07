/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1905612124;

	/**
	 * The singleton instance of X_TEST_CASE_85
	 */
	public static final org.jooq.test.oracle.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.oracle.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, java.lang.String>("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("X_TEST_CASE_85", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.Keys.PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.oracle.generatedclasses.Keys.PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.oracle.generatedclasses.Keys.FK_X_TEST_CASE_85);
	}
}
