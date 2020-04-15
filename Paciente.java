package aulaarthur;

import java.util.Set;

public class Paciente {
   private String nome;
   private int idade;
   private String cpf;
   private boolean infectadoCorona;
   private boolean Vivo=true;
   
	
   
   public void novoPaciente(String nome, int idade, String cpf, boolean infectadoCorona) {
	this.nome=nome;  
	this.idade=idade;
	this.cpf=cpf;
	this.infectadoCorona=infectadoCorona;   
   }
   
   public void novoPaciente(String nome, int idade, String cpf, boolean infectadoCorona, boolean vivo) {
		this.nome=nome;  
		this.idade=idade;
		this.cpf=cpf;
		this.infectadoCorona=infectadoCorona;   
	    this.Vivo=vivo;   
   }
   public void mudarVivo(boolean vivo) {
	   this.Vivo=vivo;
   }
   public String statosDoPaciente() {
	   return ("nome: "+ getNomePaciente()+"\nvivo: "+getVivo()+"\ninfectado: "+getInfectadoCorona()+"\nvivo: "+getVivo());
	   
   }
   public int terminoTratamento() {
	   return idade+2;
   }
   public String getNomePaciente() {
		return nome;
   }

   public int getIdadePaciente() {
		return idade;
   }

   public String getcpf() {
		return cpf;
	}

   
   public boolean getInfectadoCorona() {
	    return infectadoCorona;
   }
   private boolean getVivo() {
	   return Vivo;
   }
}


