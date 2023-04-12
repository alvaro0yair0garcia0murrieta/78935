package com.calificacion.calificacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Materia
{
    @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private int _idmateria;
	public int getidmateria()
	{
		return this._idmateria;
	}
	public void setidmateria(int value)
	{
		this._idmateria = value;
	}

	private String _nombre;
	public String getnombre()
	{
		return this._nombre;
	}
	public void setnombre(String value)
	{
		this._nombre = value;
	}

	private int _crecditos;
	public int getcrecditos()
	{
		return this._crecditos;
	}
	public void setcrecditos(int value)
	{
		this._crecditos = value;
	}
	private String _maestro;
	public String get_maestro() {
		return _maestro;
	}
	public void set_maestro(String _maestro) {
		this._maestro = _maestro;
	}
	public Materia(int _idmateria, String _nombre, int _crecditos, String _maestro) {
		this._idmateria = _idmateria;
		this._nombre = _nombre;
		this._crecditos = _crecditos;
		this._maestro = _maestro;
	}
	public Materia(){}

}
