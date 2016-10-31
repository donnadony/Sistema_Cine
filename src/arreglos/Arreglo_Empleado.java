package arreglos;

import clases.Empleado;
import java.util.ArrayList;


public class Arreglo_Empleado {
	
	private ArrayList <Empleado> emp;
	
	public Arreglo_Empleado() {
		emp = new ArrayList <Empleado> ();
		emp.add(new Empleado(10001,0,"Juanito","Apaterno1","Amaterno1","",""));
		emp.add(new Empleado(10002,1,"Carlos","Apaterno2","Amaterno2","",""));
		emp.add(new Empleado(10003,2,"Fernando","Apaterno4","Amaterno3","",""));
		emp.add(new Empleado(10004,0,"Nombre4","Apaterno4","Amaterno4","",""));
	}
	
	public void agregar(Empleado z){
		emp.add(z);
	}
	public int tamaño(){
		return emp.size();
	}
	public Empleado obtener(int z){
		return emp.get(z);
	}
	public void eliminar(Empleado z){
		emp.remove(z);		
	}
	public Empleado buscar(int z){
		Empleado x;
		for (int i=0; i<tamaño(); i++){
			x = obtener(i);
			if (x.getCod_e() == z){
				return x;
			}
		}
		return null;		
	}
	
	public int codCorrelativo() {
		if (tamaño() == 0)
			return 10001;
		else
			return obtener(tamaño()-1).getCod_e() + 1;		
	}
	
}
