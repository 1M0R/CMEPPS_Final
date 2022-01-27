/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmepps_final.variabs;

/**
 *
 * @author Pablo
 */
public class Elemento {

    String nombre;
    int nFichRefEntradas;
    int nFichRefSalidas;
    int nDatosEntradas;
    int nDatosSalidas;
    String tipo;
    
    public Elemento(String nombre, int nFichRefEntradas, int nFichRefSalidas, int nDatosEntradas, int nDatosSalidas, String tipo) {
        this.nombre = nombre;
        this.nFichRefEntradas = nFichRefEntradas;
        this.nFichRefSalidas = nFichRefSalidas;
        this.nDatosEntradas = nDatosEntradas;
        this.nDatosSalidas = nDatosSalidas;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnFichRefEntradas() {
        return nFichRefEntradas;
    }

    public void setnFichRefEntradas(int nFichRefEntradas) {
        this.nFichRefEntradas = nFichRefEntradas;
    }

    public int getnFichRefSalidas() {
        return nFichRefSalidas;
    }

    public void setnFichRefSalidas(int nFichRefSalidas) {
        this.nFichRefSalidas = nFichRefSalidas;
    }

    public int getnDatosEntradas() {
        return nDatosEntradas;
    }

    public void setnDatosEntradas(int nDatosEntradas) {
        this.nDatosEntradas = nDatosEntradas;
    }

    public int getnDatosSalidas() {
        return nDatosSalidas;
    }

    public void setnDatosSalidas(int nDatosSalidas) {
        this.nDatosSalidas = nDatosSalidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
}
