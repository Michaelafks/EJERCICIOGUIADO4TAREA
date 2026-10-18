public class Tarea {

    public String titulo;
    public String responsable;

    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Horas completadas: " + horasEstimadas);

    }

    public void completar(){

        if( completada == true){
            System.out.println("Tarea completada");
        }else {
            System.out.println("Tarea Incompleta");
        }

    }

    public void mostrarResponsable(){

        System.out.println("Responsable: " + responsable);
    }

    public void mostrarEstrado(){

        System.out.println("Completada: " + completada);

    }

}
