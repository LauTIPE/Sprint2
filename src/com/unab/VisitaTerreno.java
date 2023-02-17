package com.unab;
import java.time.LocalDate;
import java.time.LocalTime;
/*
 - Identificador de la visita en terreno * (N° Interno por la compañia)
- RUT Cliente* 
- Día: (Fecha del accidente) (DD/MM/AAAA)
- Hora (HH:MM - 0 a 23 y 0 a 59)
- Lugar* (min 10, max 50 car)
- Comentarios: (max 100 car)


 */


public class VisitaTerreno {

	private int idvisita;
	private LocalDate dia;
	private LocalTime hora;
	
	private String lugar;
	private String comentarios;
	
	// constructor vacio
	   public VisitaTerreno() {
			
	   }
	   public VisitaTerreno(int idvisita, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
	        this.idvisita = idvisita;
	        this.dia = dia;
	        this.hora = hora;
	        this.lugar = lugar;
	        this.comentarios = comentarios;
	    }
	
		public int getIdvisita() {
	        return idvisita;
	    }
	
	    /**
		 * @param idvisita the idvisita to set
		 */
		public void setIdvisita(int idvisita) {
			this.idvisita = idvisita;
		}
		
		public LocalDate getDia() {
	        return dia;
	    }
		/**
		 * @param dia the dia to set
		 */
		public void setDia(LocalDate dia) {
			this.dia = dia;
		}
		
	    public LocalTime getHora() {
	        return hora;
	    }
	    /**
		 * @param hora the hora to set
		 */

		public void setHora(LocalTime hora) {
			this.hora = hora;
		}

	    public String getLugar() {
	        return lugar;
	    }
	
		/**
		 * @param lugar the lugar to set
		 */
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

	    public String getComentarios() {
	        return comentarios;
	    }
		/**
		 * @param comentarios the comentarios to set
		 */
		public void setComentarios(String comentarios) {
			this.comentarios = comentarios;
		}
		
}

	
	
	

