import java.util.ArrayList;
import java.util.Scanner;

public class Consulltorio {
    IngresarFechas ingresarFechas = new IngresarFechas();
    Agendar agendar = new Agendar();
    Cita cita = new Cita();
    Mostrar mostrar = new Mostrar();


    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            System.out.println("--MENU DEL CONSULTORIO--");
            System.out.println(" [1] Ingresar fecha de consulta");
            System.out.println(" [2] Agendar una cita");
            System.out.println(" [3] Cancelar cita");
            System.out.println(" [4] Mostrar Citas");
            System.out.println(" [5] Salir");
            op=scanner.nextInt();
            switch (op){
                case 1:
                    ingresarFechas.fechas(ingresarFechas.getCalendarios());
                    break;
                case 2:
                    agendar.agendarPaciente(agendar.getPacientes(),ingresarFechas.getCalendarios());
                    cita.cita(cita.getConsultas(),ingresarFechas.getCalendarios(),agendar.getPacientes());
                    break;
                case 3:
                    break;
                case 4:
                    mostrar.mostrar(cita.getConsultas(),ingresarFechas.getCalendarios(),agendar.getPacientes());
                    break;
                default:
            }

        }while(op != 4);
    }
}
