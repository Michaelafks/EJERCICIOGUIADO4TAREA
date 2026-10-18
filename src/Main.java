//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Tarea tarea1 = new Tarea();
    Tarea tarea2 = new Tarea();

    tarea1.titulo = "Ing. Software";
    tarea1.responsable = "Michael Shuguli";
    tarea1.horasEstimadas = 3.0;
    tarea1.completada = true;

    tarea1.mostrarInformacion();
    tarea1.mostrarResponsable();
    tarea1.mostrarEstrado();
    tarea1.completar();
}
