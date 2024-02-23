/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ModeloEstudiantes;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shueek
 */
public class VistaEstudiante {

    private Scanner Ver;

    public VistaEstudiante() {
        this.Ver = new Scanner(System.in);
    }

    public int MenuEstudiante() {
        System.out.println("1 Ingresar Estudiante");
        System.out.println("2 Eliminar Estudiante");
        System.out.println("3 Ver estudiante");
        System.out.println("4 Actuslizar datos");
        System.out.println("5 Salir ");

        System.out.print("Ingrese Opcion");
        int opcion = Ver.nextInt();
        Ver.nextLine();
        return opcion;

    }

    public ModeloEstudiantes IngresarEstudintes() {
        System.out.println("ingrese nombre");
        String NombreU = Ver.nextLine();
        System.out.print("ingrese numero de ID");
        String Cedula = Ver.nextLine();
        return new ModeloEstudiantes(Cedula, NombreU);
    }

    public void MostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
      public void VerEstudiantes(List<ModeloEstudiantes> Alumnos) {
        if (Alumnos.isEmpty()) {
            System.out.println("No encontramos estudiantes.");
        } else {
            System.out.println("Estudiantes:");
            for (int i = 0; i < Alumnos.size(); i++) {
                System.out.println((i+1) + ". Cedula: " + Alumnos.get(i).getCedula() 
                        + ", Nombre: " + Alumnos.get(i).getNombreU());
            }
        }
      }
         public ModeloEstudiantes EscogerEstudiante(List<ModeloEstudiantes> Alumnos) {
        EscogerEstudiante(Alumnos);
        System.out.print("Seleccione numero del estudiante : ");
        int seleccion = Ver.nextInt();
        Ver.nextLine();
        if (seleccion > 0 && seleccion <= Alumnos.size()) {
            return Alumnos.get(seleccion - 1);
        } else {
            System.out.println("seleccion no valida .");
            return null;
        }
    }
    public String EliminarCedula() {
        System.out.print("Ingrese la Cedula del estudiante que desea eliminar: ");
        return Ver.nextLine(); 
    }
    public ModeloEstudiantes eliminarEstudiante(List<ModeloEstudiantes> estudiantes) {
        VerEstudiantes(estudiantes); 

        String CedulaEliminar = EliminarCedula(); 

        ModeloEstudiantes EstudianteEliminado = null;
        for (ModeloEstudiantes Alumnos : estudiantes) {
            if (Alumnos.getCedula().equals(CedulaEliminar)) {
                EstudianteEliminado = Alumnos;
                break;
            }
        }

        if (EstudianteEliminado != null) {
            MostrarMensaje("Alumno  eliminado : " + EstudianteEliminado.getNombreU());
        } else {
            MostrarMensaje("No se encontro ningun estudiante con esa Cedula.");
        }

        return EstudianteEliminado;
    }
}
