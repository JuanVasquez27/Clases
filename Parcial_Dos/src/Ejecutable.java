
public class Ejecutable {
	public static class EntregablesApp{
		
		 public static void main(String[] args) {
			
		
			
			Serie listaSeries[]=new  Serie[5];
			Video_juego listaVideoJuegos[]=new Video_juego[5];
			
			
			listaSeries[0]=new Serie();
			listaSeries[1]=new Serie("She-hulk", "Casa del dragon");
			listaSeries[2]=new Serie("Dragon ball z", "Mandalorian");
			listaSeries[3]=new Serie("loki", "Breaking bad");
			listaSeries[4]=new Serie("Flash", "Naruto");
			
			
			listaVideoJuegos[0]=new Video_juego();
			listaVideoJuegos[1]=new Video_juego("Fifa", "Pes");
			listaVideoJuegos[2]=new Video_juego("The last of us", "Warzone");
			listaVideoJuegos[3]=new Video_juego("GTA", "Crash");
			listaVideoJuegos[4]=new Video_juego("Fall guys", "God of war");
			
			listaSeries[1].entregar();;
			listaSeries[4].entregar();;
			listaVideoJuegos[0].entregar();
			
			int entregados=0;
			
			for(int i=0;i<listaSeries.length;i++) {
				if(listaSeries[i].isEntregado()) {
					entregados+=1;
					listaSeries[i].devolver();
				}
				if(listaVideoJuegos[i].isEntregado()) {
					entregados+=1;
					listaVideoJuegos[i].devolver();
				}
			}
			
			System.out.println("Hay "+entregados+" articulos entregados");
			
			Serie serieMayor=listaSeries[0];
			Video_juego videojuegoMayor=listaVideoJuegos[0];
			
			
			for (int i=1;i<listaSeries.length;i++) {
				if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR) {
					serieMayor=listaSeries[i];
				}
				
				if(listaVideoJuegos[i].compareTo(videojuegoMayor)==Video_juego.Mayor) {
					videojuegoMayor=listaVideoJuegos[i];
				}
			}
		
			System.out.println(videojuegoMayor);
			System.out.println(serieMayor);
			
		}	
		
	}
}
