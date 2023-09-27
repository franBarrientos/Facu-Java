public class TestSalario {
    public static void main(String[] args) {
        Empleado miEmpleado = new Empleado(2342, "Barrientos",
                "Franco", 2000,1000 );

        double totalPorAntiguedad = 0;
        for (int i = 0; i < miEmpleado.antiguedad(); i++) {
            totalPorAntiguedad += miEmpleado.sueldoNeto() * 0.1;
        }

        System.out.println("total :"+ totalPorAntiguedad);
    }

}

