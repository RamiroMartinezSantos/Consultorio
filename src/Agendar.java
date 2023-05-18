import java.util.ArrayList;
import java.util.Scanner;

public class Agendar {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Paciente> pacientes;
    public Agendar(){pacientes = new ArrayList<>();}
    public void agendarPaciente(ArrayList<Paciente> pacientes,ArrayList<Calendario> calendarios){
        if(calendarios.isEmpty()){
            System.out.println("NO EXISTEN ALIMENTOS INGRESADOS");
        } else {
            System.out.println(" INGRESE EL NOMBRE DEL PACIENTE ");
            String nombrePaciente = scanner.nextLine();

            System.out.println(" INGRESE EL APELLIDO DEL PACIENTE");
            String apellidoPaciente = scanner.nextLine();

            System.out.println(" INGRESE LA EDAD DEL PACIENTE");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println(" INGRESE EL NUMERO DEL PACIENTE");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            System.out.println(" INGRESE EL MOTIVO POR EL QUE EL PACIENTE VISITA EL CONSULTORIO");
            System.out.println(" REVISION MEDICA");
            System.out.println(" CONSULTA GENERAL");
            System.out.println(" OTRO (ESPESIFICAR)");
            String motivoDeVisita = scanner.nextLine();


            pacientes.add(new Paciente(nombrePaciente, apellidoPaciente, edad, telefono, motivoDeVisita));
        }
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

}
