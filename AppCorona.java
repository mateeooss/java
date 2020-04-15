package aulaarthur;

public class AppCorona {
	public static void main(String[] args) {
	  Paciente renata= new Paciente();
	  Paciente caio= new Paciente();
	  
	 renata.novoPaciente("renata", 20,"119.862.293.12", false); 
	 caio.novoPaciente("caio", 25,"119.894.213.42", false, false);
	
	 System.out.println(renata.statosDoPaciente());
	 
	System.out.println("\n\nnome:"+caio.getNomePaciente()+"\nterminara o tratamento com: "+caio.terminoTratamento()+" anos");
	 
	 
	}
}
