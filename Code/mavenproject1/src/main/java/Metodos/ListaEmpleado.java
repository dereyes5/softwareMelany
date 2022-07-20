
package Metodos;

import java.util.LinkedList;

public class ListaEmpleado {
    private LinkedList<Empleado> empleados;
    public void agregar(Empleado empleado){
        empleados.add(empleado);
    }
    public void eliminar(int indice){
        empleados.remove(indice);
    }
    public int totall(){
        return empleados.size();
    }
    public Empleado obtener(int indice){
        return empleados.get(indice);
    }
}