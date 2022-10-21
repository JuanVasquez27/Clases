
public class Video_juego implements entregable {
	
	 private final static int Horas_Estimadas_Def=10;
	  
	   
	    public final static int Mayor=1;
	  
	   
	    public final static int Menor=-1;
	  
	    
	    public final static int Igual=0;
	    
	    
	    private String titulo;
		  
	    private static int horasEstimadas;
	  
	   
	    private boolean entregado;
	  
	    private String genero;
	  
	  
	    private static int compañia;


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public int getHorasEstimadas() {
			return horasEstimadas;
		}


		public void setHorasEstimadas(int horasEstimadas) {
			Video_juego.horasEstimadas = horasEstimadas;
		}


		public String getGenero() {
			return genero;
		}


		public void setGenero(String genero) {
			this.genero = genero;
		}


		public int getCompañia() {
			return compañia;
		}


		public void setCompañia(int compañia) {
			Video_juego.compañia = compañia;
		}
	  
	    public void entregar() {
	    	entregado=true;
	    }
	    
	    public void devolver() {
	    	entregado=false;
	    }
	    
	    public boolean isEntregado() {
	        if(entregado){
	            return true;
	        }
	        return false;
	    }
	  
	    public int compareTo(Object a) {
	        int estado=Menor;
	  
	        
	        Video_juego ref=(Video_juego)a;
	        if (horasEstimadas>ref.getHorasEstimadas()){
	            estado=Mayor;
	        }else if(horasEstimadas==ref.getHorasEstimadas()){
	            estado=Igual;
	        }
	  
	        return estado;
	    }
	  
	  
	    public String toString(){
	        return "Informacion del video juego: \n" +
	                "\tTitulo: "+titulo+"\n" +
	                "\tHoras estimadas: "+horasEstimadas+"\n" +
	                "\tGenero: "+genero+"\n" +
	                "\tCompañia: "+compañia;
	    }
	  
	   
	    public boolean equals(Video_juego a){
	        if (titulo.equalsIgnoreCase(a.getTitulo())){
	            return true;
	        }
	        return false;
	    }
	  
	 
	    public Video_juego(){
	      this("", Horas_Estimadas_Def, "", "");
	    }
	  
	
	    public Video_juego(String titulo, String compañia){
	        this();
	    }
	  
	   
	    
	    public Video_juego(String titulo, int numeroTemporadas, String genero, String creador){
	        this.titulo=titulo;
	        this.compañia=horasEstimadas;
	        this.genero=genero;
	        this.compañia=compañia;
	        this.entregado=true;
	    }
	  
	}
