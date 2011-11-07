/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 1515732;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> __RECORD_TYPE = org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dbo.x_test_case_85.x_unused_id, dbo.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dbo.x_unused.id, dbo.x_unused.name]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, java.lang.String>("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.pk_x_test_case_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.pk_x_test_case_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.fk_x_test_case_85);
	}
}
