/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Shueek
 */
public class ModeloEstudiantes {
    
    private String NombreU,Cedula;

    public ModeloEstudiantes(String NombreU, String Cedula,
            String NuevoNom, String NuevaCedula) {
        this.NombreU = NombreU;
        this.Cedula = Cedula;
  
    }

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    
    public ModeloEstudiantes(String NombreU, String Cedula) {
        this.NombreU = NombreU;
        this.Cedula = Cedula;
    }

 

}
