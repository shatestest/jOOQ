/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaActor extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> {

	private static final long serialVersionUID = -1382847565;

	/**
	 * The singleton instance of <code>sakila.actor</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaActor ACTOR = new org.jooq.examples.mysql.sakila.tables.SakilaActor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord.class;
	}

	/**
	 * The column <code>sakila.actor.actor_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.Short> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.actor.first_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this);

	/**
	 * The column <code>sakila.actor.last_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this);

	/**
	 * The column <code>sakila.actor.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.actor</code> table reference
	 */
	public SakilaActor() {
		super("actor", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.actor</code> table reference
	 */
	public SakilaActor(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_ACTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_ACTOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_ACTOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaActor as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaActor(alias);
	}
}