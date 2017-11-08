package it.uni.pwm.indoorlocalizer.model;
// default package
// Generated 8-nov-2017 11.08.49 by Hibernate Tools 5.2.5.Final

/**
 * StanzaId generated by hbm2java
 */
public class StanzaId implements java.io.Serializable {

	private String nome;
	private int edificioId;
	private int edificioCampusId;

	public StanzaId() {
	}

	public StanzaId(String nome, int edificioId, int edificioCampusId) {
		this.nome = nome;
		this.edificioId = edificioId;
		this.edificioCampusId = edificioCampusId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEdificioId() {
		return this.edificioId;
	}

	public void setEdificioId(int edificioId) {
		this.edificioId = edificioId;
	}

	public int getEdificioCampusId() {
		return this.edificioCampusId;
	}

	public void setEdificioCampusId(int edificioCampusId) {
		this.edificioCampusId = edificioCampusId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StanzaId))
			return false;
		StanzaId castOther = (StanzaId) other;

		return ((this.getNome() == castOther.getNome()) || (this.getNome() != null && castOther.getNome() != null
				&& this.getNome().equals(castOther.getNome()))) && (this.getEdificioId() == castOther.getEdificioId())
				&& (this.getEdificioCampusId() == castOther.getEdificioCampusId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNome() == null ? 0 : this.getNome().hashCode());
		result = 37 * result + this.getEdificioId();
		result = 37 * result + this.getEdificioCampusId();
		return result;
	}

}
