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
    
    public String getComplejidad() {
        String complejidad="";
        switch(tipo){
            case "EE":
                complejidad = calcularEntrada();
                break;
            case "SE":
                complejidad = calcularSalida();
                break;
            case "CE":
                complejidad = calcularCE();
                break;
            case "FLE":
                complejidad = calcularFL();
                break;
            case "FLI":
                complejidad = calcularFL();
                break;
        }
        
        return complejidad;
    }
        
    public String calcularEntrada(){
        if ((nFichRefEntradas <= 1 && nDatosEntradas <= 15) || (nFichRefEntradas == 2 && nDatosEntradas <=4))
                    return "SIMPLE";
                else if((nFichRefEntradas>=3 && nDatosEntradas >=5) || (nFichRefEntradas ==2 && nDatosEntradas >=16))
                    return "COMPLEJA";
                else return "MEDIA";
    }
    
    public String calcularSalida(){
        if ((nFichRefEntradas <= 1 && nDatosEntradas <= 19) || (nFichRefEntradas <= 3  && nDatosEntradas <=5))
                    return "SIMPLE";
                else if((nFichRefEntradas>=4 && nDatosEntradas >=6) || (nFichRefEntradas >=2 && nDatosEntradas >=20))
                    return "COMPLEJA";
                else return "MEDIA";
    }
    
    public String calcularCE(){
        String complejidadSalida = "";
        if ((nFichRefSalidas <= 1 && nDatosSalidas <= 19) || (nFichRefSalidas <= 3  && nDatosSalidas <=5))
                    complejidadSalida = "SIMPLE";
                else if((nFichRefSalidas>=4 && nDatosSalidas >=6) || (nFichRefSalidas >=2 && nDatosSalidas >=20))
                    complejidadSalida = "COMPLEJA";
                else complejidadSalida = "MEDIA";
        
        String complejidadEntrada = calcularEntrada();
        if (complejidadEntrada == "COMPLEJA" || complejidadSalida == "COMPLEJA")
            return "COMPLEJA";
        else if (complejidadEntrada == "MEDIA" || complejidadSalida == "MEDIA")
            return "MEDIA";
        else return "SIMPLE";
                
    }
    
    public String calcularFL()
    {
        if ((nFichRefEntradas <= 1 && nDatosEntradas <= 50) || (nFichRefEntradas <= 5  && nDatosEntradas <=19))
                    return "SIMPLE";
                else if((nFichRefEntradas>=6 && nDatosEntradas >=20) || (nFichRefEntradas >=2 && nDatosEntradas >=51))
                    return "COMPLEJA";
                else return "MEDIA";
    }
    
    
    
    
    
}
