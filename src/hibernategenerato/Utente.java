package hibernategenerato;
// default package
// Generated 8-nov-2017 11.08.49 by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Utente generated by hbm2java
 */
public class Utente implements java.io.Serializable {

	private Integer id;
	private String email;
	private String nome;
	private String cognome;
	private String pwd;
	private byte abilitato;
	private Set edificios = new HashSet(0);
	private Set aps = new HashSet(0);
	private Set campuses = new HashSet(0);
	private Set stanzas = new HashSet(0);
	private Set notifiches = new HashSet(0);
	private Set informazionis = new HashSet(0);

	public Utente() {
	}

	public Utente(String email, String nome, String cognome, String pwd, byte abilitato) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.abilitato = abilitato;
	}

	public Utente(String email, String nome, String cognome, String pwd, byte abilitato, Set edificios, Set aps,
			Set campuses, Set stanzas, Set notifiches, Set informazionis) {
		this.email = email;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.abilitato = abilitato;
		this.edificios = edificios;
		this.aps = aps;
		this.campuses = campuses;
		this.stanzas = stanzas;
		this.notifiches = notifiches;
		this.informazionis = informazionis;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public byte getAbilitato() {
		return this.abilitato;
	}

	public void setAbilitato(byte abilitato) {
		this.abilitato = abilitato;
	}

	public Set getEdificios() {
		return this.edificios;
	}

	public void setEdificios(Set edificios) {
		this.edificios = edificios;
	}

	public Set getAps() {
		return this.aps;
	}

	public void setAps(Set aps) {
		this.aps = aps;
	}

	public Set getCampuses() {
		return this.campuses;
	}

	public void setCampuses(Set campuses) {
		this.campuses = campuses;
	}

	public Set getStanzas() {
		return this.stanzas;
	}

	public void setStanzas(Set stanzas) {
		this.stanzas = stanzas;
	}

	public Set getNotifiches() {
		return this.notifiches;
	}

	public void setNotifiches(Set notifiches) {
		this.notifiches = notifiches;
	}

	public Set getInformazionis() {
		return this.informazionis;
	}

	public void setInformazionis(Set informazionis) {
		this.informazionis = informazionis;
	}

}
