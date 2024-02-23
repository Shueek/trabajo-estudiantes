/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import Controlador.ConEstudiantes;
import Modelo.ModeloEstudiantes;
import java.util.ArrayList; 
import java.util.List; 
import Modelo.ModeloEstudiantes;
import Vista.VistaEstudiante;

public class Estudiantes {

    public static void main(String[] args) {
        List<ModeloEstudiantes> estudiantes = new ArrayList<>();
        VistaEstudiante vista = new VistaEstudiante();
        ConEstudiantes cont = new ConEstudiantes(vista, estudiantes);
        cont.Iniciar();
    }
    
}
