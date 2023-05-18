public class Calendario {
    Double dia;
    String hora;
    Double mes;
public Calendario(Double dia, String hora, Double mes){
    this.dia = dia;
    this.hora = hora;
    this.mes = mes;
}
@Override
    public String toString(){
        return dia + "dia" + hora + "hora" + mes + "mes";
    }
}


