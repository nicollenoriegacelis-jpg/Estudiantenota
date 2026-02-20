//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Estudiante e1 = new Estudiante("sofia", 3.5, 3.9, 4.5);
        e1.mostrarinformacion();

        System.out.println(e1.calcularpromedio());
        System.out.println(e1.estaAprobado(3.0));

        Estudiante e2 = new Estudiante( "nicolle");

        e2.asignarNotas(4.5, 2.9 , 1.5);

        e2.mostrarinformacion();
        System.out.println("El promedio es" + e2.calcularpromedio());
        System.out.println(e1.estaAprobado(3.0));





    }
}