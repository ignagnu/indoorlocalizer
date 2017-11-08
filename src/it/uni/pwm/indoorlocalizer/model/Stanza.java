package it.uni.pwm.indoorlocalizer.model;
// default package
// Generated 8-nov-2017 11.08.49 by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Stanza generated by hbm2java
 */
public class Stanza implements java.io.Serializable {

	private StanzaId id;
	private Edificio edificio;
	private Utente utente;
	private Integer piano;
	private Integer informazioniId;
	private Set notifiches = new HashSet(0);
	private Set aps = new HashSet(0);

	public Stanza() {
	}

	public Stanza(StanzaId id, Edificio edificio, Utente utente) {
		this.id = id;
		this.edificio = edificio;
		this.utente = utente;
	}

	public Stanza(StanzaId id, Edificio edificio, Utente utente, Integer piano, Integer informazioniId, Set notifiches,
			Set aps) {
		this.id = id;
		this.edificio = edificio;
		this.utente = utente;
		this.piano = piano;
		this.informazioniId = informazioniId;
		this.notifiches = notifiches;
		this.aps = aps;
	}

	public StanzaId getId() {
		return this.id;
	}

	public void setId(StanzaId id) {
		this.id = id;
	}

	public Edificio getEdificio() {
		return this.edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Integer getPiano() {
		return this.piano;
	}

	public void setPiano(Integer piano) {
		this.piano = piano;
	}

	public Integer getInformazioniId() {
		return this.informazioniId;
	}

	public void setInformazioniId(Integer informazioniId) {
		this.informazioniId = informazioniId;
	}

	public Set getNotifiches() {
		return this.notifiches;
	}

	public void setNotifiches(Set notifiches) {
		this.notifiches = notifiches;
	}

	public Set getAps() {
		return this.aps;
	}

	public void setAps(Set aps) {
		this.aps = aps;
	}

}
