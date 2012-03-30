/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "nation", schema = "PUBLIC")
public class Nation implements java.io.Serializable {

	private static final long serialVersionUID = 1194497602;

	private java.lang.String code;
	private java.lang.String name;
	private java.lang.String continent;
	private java.lang.String capital;

	@javax.persistence.Id
	@javax.persistence.Column(name = "code", unique = true, nullable = false, length = 3)
	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	@javax.persistence.Column(name = "name", nullable = false, precision = 40)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "continent", precision = 10)
	public java.lang.String getContinent() {
		return this.continent;
	}

	public void setContinent(java.lang.String continent) {
		this.continent = continent;
	}

	@javax.persistence.Column(name = "capital", precision = 30)
	public java.lang.String getCapital() {
		return this.capital;
	}

	public void setCapital(java.lang.String capital) {
		this.capital = capital;
	}
}