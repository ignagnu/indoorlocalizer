package it.uni.pwm.indoorlocalizer.model.pojo;
// default package
// Generated 8-nov-2017 11.08.49 by Hibernate Tools 5.2.5.Final

/**
 * EdificioId generated by hbm2java
 */
public class EdificioId implements java.io.Serializable {

	private int id;
	private int campusId;

	public EdificioId() {
	}

	public EdificioId(int id, int campusId) {
		this.id = id;
		this.campusId = campusId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCampusId() {
		return this.campusId;
	}

	public void setCampusId(int campusId) {
		this.campusId = campusId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EdificioId))
			return false;
		EdificioId castOther = (EdificioId) other;

		return (this.getId() == castOther.getId()) && (this.getCampusId() == castOther.getCampusId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getCampusId();
		return result;
	}

}
