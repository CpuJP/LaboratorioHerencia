/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author jp-co
 */
public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    double y[] = new double[15];
    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    
    public void calcularPromedio(){
        double sum = 0, prom = 0;
        for (int i = 0; i < numeroMaterias; i++) {
            sum = sum + y[i];
        }
        prom = sum / numeroMaterias;
        promedioNotas = prom;
        JOptionPane.showMessageDialog(null,"El promedio de las notas es: "+promedioNotas);
        
    }
    
    public void leerNotasEstudiante(){
        
        for (int i = 0; i < numeroMaterias; i++) {
           // y[i] = leerDatoTipoReal("Ingrese la nota No.: "+i);
            y[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nota No. "+i));
        }
        /*for (int i = 0; i < numeroMaterias; i++) {
            JOptionPane.showMessageDialog(null,"nota No."+"i"+ y[i]);
            sum = sum + y[i];
        }
        */
    }
    
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String carnet = "";
        carnet = leerDatoTipoCadena("Ingrese el No. del carnet del estudiante: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias que ve el estudiante: ");
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.leerNotasEstudiante();
        
        //nuevoEstudiante.imprimirReporteNotasEstudiante();
        nuevoEstudiante.calcularPromedio();
        
        return (nuevoEstudiante);
        
    }
    
    public void imprimirReporteNotasEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String contenido = "";
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
        for (int i = 0; i < numeroMaterias; i++) {
            contenido = contenido + y[i] +" "+"\n";
        }    
        JOptionPane.showMessageDialog(null, contenido, "Consolidado de notas", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
