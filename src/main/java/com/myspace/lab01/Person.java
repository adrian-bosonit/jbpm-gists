package com.myspace.lab01;

/**
 * This class was automatically generated by the data modeler tool.
 */
 
@javax.persistence.Entity
@javax.persistence.Table(name = "Person")
public class Person implements java.io.Serializable {

	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ID_GENERATOR", sequenceName = "PERSON_ID_SEQUENCE")
	private java.lang.Long id;

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Person name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Date of birth")
	private java.util.Date birthDate;

	public Person() {
	}
	
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}


	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public Person(java.lang.String name, java.util.Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

}