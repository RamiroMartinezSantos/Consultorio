import java.util.ArrayList;
import java.util.Scanner;

public class Cita {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Consulta> consultas;
    public Cita(){consultas = new ArrayList<>();}
    public void cita(ArrayList<Consulta> consultas,ArrayList<Calendario> calendarios,ArrayList<Paciente> pacientes){
        System.out.println("INGRESE EL NOMBRE DEL PACIENTE ");
        String nombre = "";
        String nom = scanner.nextLine();
        for (Paciente paciente : pacientes) {
            if(paciente.nombrePaciente == nom){
                nombre = nom;
                break;
            }
        }
        System.out.println("--HORARIOS DISPONIBLES--");
        for (Calendario calendario : calendarios) {
            System.out.println("Dia" + calendario.dia);
            System.out.println("Hora" + calendario.hora);
            System.out.println("Mes" + calendario.mes);
            System.out.println("\n");
        }
        System.out.println("--QUE DIA QUIERE AGENDAR UNA CITA?--");
        String fecha = "";

        System.out.println("INGRESE EL DIA Y EL MES PARA AGENDAR LA CITA");
        int dia1 = 0;
        int mes1 = 0;
        for (Calendario calendario : calendarios) {
            if(dia1 == calendario.dia && mes1 == calendario.mes){
                fecha = "Dia" + calendario.dia + "Mes" + calendario.mes + "Hora" + calendario.hora;
            }
        }

        consultas.add(new Consulta(nombre,fecha));
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
}
