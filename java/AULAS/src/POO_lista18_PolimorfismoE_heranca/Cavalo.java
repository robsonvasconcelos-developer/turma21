package POO_lista18_PolimorfismoE_heranca;

public class Cavalo extends Animal{

 	public Cavalo(String nome, int idade) {
 		super(nome, idade);
 		// TODO Auto-generated constructor stub
 	}


 	@Override
 	public void som() {
 		System.out.println("irrrr irrr irrr");

 	}

 }