public class Consulta {
    String nombre;
    String fecha;

    public Consulta(String nombre,String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;

    }
    @Override
    public String toString(){
        return nombre + "nombre" + fecha + "fecha";
    }
}
