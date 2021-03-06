/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaStore extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> {

	private static final long serialVersionUID = 623197570;

	/**
	 * The singleton instance of <code>sakila.store</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaStore STORE = new org.jooq.examples.mysql.sakila.tables.SakilaStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord.class;
	}

	/**
	 * The column <code>sakila.store.store_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Byte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this);

	/**
	 * The column <code>sakila.store.manager_staff_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Byte> MANAGER_STAFF_ID = createField("manager_staff_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this);

	/**
	 * The column <code>sakila.store.address_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Short> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this);

	/**
	 * The column <code>sakila.store.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>sakila.store</code> table reference
	 */
	public SakilaStore() {
		super("store", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.store</code> table reference
	 */
	public SakilaStore(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE);
	}

	private SakilaStore(java.lang.String alias, org.jooq.Table<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> aliased) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Byte> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_STORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_STORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_STORE_PRIMARY, org.jooq.examples.mysql.sakila.Keys.KEY_STORE_IDX_UNIQUE_MANAGER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_STORE_STAFF, org.jooq.examples.mysql.sakila.Keys.FK_STORE_ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaStore as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.examples.mysql.sakila.tables.SakilaStore rename(java.lang.String name) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaStore(name, null);
	}
}
