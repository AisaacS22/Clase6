package pkgEjercicio;
import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    private String nombre;
    private double sueldo_base; //3500
    private double descuentos; //500
    private double sueldo_liquido; //3000

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }


    //INGRESOS Y CALCULOS
    public void ejercicio() {
        ClsEjercicio6 ej1 = new ClsEjercicio6();
        ej1.setNombre("Isaac");
        ej1.setSueldo_base(3500);


        ClsEjercicio6 ej2 = new ClsEjercicio6();
        ej2.setNombre("Manuel");
        ej2.setSueldo_base(3500);
        ej2.setDescuentos(500);


        ClsEjercicio6 ej3 = new ClsEjercicio6();
        ej3.setNombre("José");
        ej3.setSueldo_base(3500);
        ej3.setDescuentos(500);


        List<ClsEjercicio6> lista = new ArrayList<>();
        lista.add(ej1);
        lista.add(ej2);
        lista.add(ej3);

        for (ClsEjercicio6 empleado : lista) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Sueldo base: " + empleado.getSueldo_base());
            System.out.println("Descuentos: " + empleado.getDescuentos());
            System.out.println("Sueldo líquido: " + empleado.getSueldo_liquido());
            System.out.println();
        }
    }
}