import java.util.ArrayList;

public class Mostrar {
    public void mostrar(ArrayList<Consulta> consultas, ArrayList<Calendario> calendarios, ArrayList<Paciente> pacientes){
        System.out.println("--HORARIOS DISPONIBLES--");
        f or (Calendario calendario : calendarios) {
            System.out.println("Dia" + calendario.dia);
            System.out.println("Hora" + calendario.hora);
            System.out.println("Mes" + calendario.mes);
            System.out.println("\n");
        }
        System.out.println("\n\n");
        System.out.println("--CONSULTAS AGENDADAS--");
        for (Consulta consulta : consultas) {
            System.out.println("Nombre de consulta " + consulta.nombre);
            System.out.println("Fecha de consulta " + consulta.fecha);
        }
        System.out.println("--PACIENTES AGENDADAS--");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre del paciente " + paciente.nombrePaciente);
            System.out.println("Apellidos del paciente " + paciente.apellidoPaciente);
            System.out.println("Edad del paciente " + paciente.edad);
            System.out.println("Telefono del paciente " + paciente.telefono);
            System.out.println("Motivo de visita del paciente " + paciente.motivoDeVisita);

        }
    }
}
