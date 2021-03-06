/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85Dao extends org.jooq.impl.DAOImpl<org.jooq.examples.h2.matchers.tables.records.XTestCase_85Record, org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85, java.lang.Integer> {

	/**
	 * Create a new XTestCase_85Dao without any configuration
	 */
	public XTestCase_85Dao() {
		super(org.jooq.examples.h2.matchers.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85.class);
	}

	/**
	 * Create a new XTestCase_85Dao with an attached configuration
	 */
	public XTestCase_85Dao(org.jooq.Configuration configuration) {
		super(org.jooq.examples.h2.matchers.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.XTestCase_85.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.examples.h2.matchers.tables.XTestCase_85.ID, value);
	}

	/**
	 * Fetch records that have <code>X_UNUSED_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85> fetchByXUnusedId(java.lang.Integer... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.XTestCase_85.X_UNUSED_ID, values);
	}

	/**
	 * Fetch records that have <code>X_UNUSED_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.XTestCase_85> fetchByXUnusedName(java.lang.String... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.XTestCase_85.X_UNUSED_NAME, values);
	}
}
