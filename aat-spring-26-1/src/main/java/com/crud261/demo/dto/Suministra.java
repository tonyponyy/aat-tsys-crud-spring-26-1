package com.crud261.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "suministra")
public class Suministra {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "pieza")
		@JsonIgnoreProperties("suministros")
		// intentar eliminar que se vean los suministros
	    private Pieza pieza;

	    @ManyToOne
	    @JoinColumn(name = "proveedor") 
		@JsonIgnoreProperties("suministros")
	 // intentar eliminar que se vean los suministros
	    private Proveedor proveedor;

	    private int precio;

		@Override
		public String toString() {
			return "Suministra [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + ", precio=" + precio
					+ "]";
		}

		public Suministra(int id, Pieza pieza, Proveedor proveedor, int precio) {
			super();
			this.id = id;
			this.pieza = pieza;
			this.proveedor = proveedor;
			this.precio = precio;
		}
		
		public Suministra() {

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Pieza getPieza() {
			return pieza;
		}

		public void setPieza(Pieza pieza) {
			this.pieza = pieza;
		}

		public Proveedor getProveedor() {
			return proveedor;
		}

		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}


  
}