public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        System.out.println("Datos ingresados");
        c.setsTitular("Allison Trelles");
        c.setdCantidad(49.90);
        System.out.println("REsultados");
        System.out.println(c.getsTitular());
        //System.out.println(c.getdCantidad());
        c.dIngresar();
        c.dRetirar();
    }
}