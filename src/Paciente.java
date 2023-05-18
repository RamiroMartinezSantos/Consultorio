public class Paciente {
    String nombrePaciente;
    String apellidoPaciente;
    int edad;
    int telefono;
    String motivoDeVisita;
public Paciente(String nombrePaciente, String apellidoPaciente, int edad, int telefono, String motivoDeVisita){
    this.nombrePaciente = nombrePaciente;
    this.apellidoPaciente = apellidoPaciente;
    this.edad = edad;
    this.telefono = telefono;
    this.motivoDeVisita = motivoDeVisita;
}
@Override
public String toString(){
    return nombrePaciente + "nombrePaciente" + apellidoPaciente + "apellidoPaciente" + edad + "edad" + telefono + "telefono" + motivoDeVisita + "motivoDeVisita";
}

}
