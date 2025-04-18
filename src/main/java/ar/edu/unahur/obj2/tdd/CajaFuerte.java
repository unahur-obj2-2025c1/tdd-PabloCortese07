package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean estaAbierta;
    private Integer clave;

    public Boolean estaAbierta(){
        return this.estaAbierta;
    }

    public void abrir(Integer clave){
        if(!this.estaAbierta && this.clave.equals(clave)) {
            estaAbierta = true;
        }
    }

    public void cerrar(Integer nuevaClave){
        this.estaAbierta = false;
        this.clave = nuevaClave;

    }
}
