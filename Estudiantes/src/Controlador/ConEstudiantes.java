/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloEstudiantes;
import Vista.VistaEstudiante;
import java.util.List;

public class ConEstudiantes {

    private final VistaEstudiante vista;
    private final List<ModeloEstudiantes> estudiantes;

    public ConEstudiantes(VistaEstudiante vista, List<ModeloEstudiantes> estudiantes) {
        this.vista = vista;
        this.estudiantes = estudiantes;
    }

    public void Iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = vista.MenuEstudiante();
            switch (opcion) {
                case 1:
                    ModeloEstudiantes nuevoEstudiante = vista.IngresarEstudintes();
                    estudiantes.add(nuevoEstudiante);
                    vista.MostrarMensaje("Estudiante Agregado Con Exito");
                    break;
                
                case 2:
                    ModeloEstudiantes estudianteAEliminar = vista.eliminarEstudiante(estudiantes);
                    if (estudianteAEliminar != null) {
                        estudiantes.remove(estudianteAEliminar);
                        vista.MostrarMensaje("Estudiante eliminado correctamente");
                    } else {
                        vista.MostrarMensaje("No se encontro ningun estudiante con esa ID.");
                    }
                    break;
                case 3:
                    vista.VerEstudiantes(estudiantes);
                    break;
                case 4:
                    salir = true;
                    vista.MostrarMensaje("¡Hasta luego!");
                    break;
                default:
                    vista.MostrarMensaje("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }

}