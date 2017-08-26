
public class Persona {
	
	String name;
	String sexo;
	int edad;

public void caminar(){

System.out.println(name + "Esta caminando");
}

public void estudiar(){

System.out.println (name + "Esta Estudiando");
}

	

}

class Curso {

public static void main(String args[]){
	Persona juan = new Persona ();
	juan.name =  "Juan Pablo";
	juan.sexo = "M";
	juan.edad = 22; 
	juan.caminar();
	juan.estudiar();

	Persona maria = new Persona();
	maria.name = "Maria";
	maria.sexo = "F";
	maria.edad = 30;
	maria.caminar();
	maria.estudiar();
}

}