import java.util.ArrayList;
import java.util.Scanner;

public class IngresarFechas {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Calendario> calendarios;
    public IngresarFechas(){calendarios = new ArrayList<>();}
    public void fechas(ArrayList<Calendario> calendarios){

        System.out.println(" INGRESE EL DIA ");
        Double dia = scanner.nextDouble();
        scanner.nextLine();
        if(dia > 30){
            System.out.println("EL DIA ESTA FUERA DE RANGO");
            return;
        }
        for (Calendario calendario : calendarios) {
            if(dia == calendario.dia){
                System.out.println("EL DIA INGRESADO YA ESTA AGENDADO EN OTRA CITA");
                return ;
            }
        }

        System.out.println(" INGRESE LA HORA ");
        String hora = scanner.nextLine();


        System.out.println(" INGRESE EL MES ");
        Double mes = scanner.nextDouble();
        scanner.nextLine();
        if(mes > 12)
        System.out.println("EL DIA ESTA FUERA DE RANGO");


        calendarios.add(new Calendario(dia,hora,mes));

    }
    public ArrayList<Calendario> getCalendarios() {
        return calendarios;
    }

}
