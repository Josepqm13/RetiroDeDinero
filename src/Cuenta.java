public class Cuenta {
    private String sTitular;
    private double dCantidad;
    private double dCantActual=50;


    public void dIngresar(){
        if (dCantidad>=0 && dCantActual>=dCantidad){
            System.out.println("La cantidad ingresada fue: "+dCantidad);
        } else {
            System.out.println("La cantidad no fue correcta");
        }
    }
    public void dRetirar() {
        if (dCantidad>=0 && dCantActual>=dCantidad) {
            if (dCantActual - dCantidad < 0) {
                dCantActual = 0;
                System.out.println("cantidad actual en su tarjeta= " + dCantActual);
                System.out.println("No puede retirar más....");
            } else if (dCantActual - dCantidad >= 0)
            {
                dCantActual=dCantActual-dCantidad;
                System.out.println("cantidad restante en su tarjeta= " + dCantActual);
            }

            else {
                System.out.println("cantidad actual en su tarjeta= " + dCantActual);
            }
        }else {
            System.out.println("No se puede retirar");
        }
    }

    public String getsTitular() {
        return sTitular;
    }

    public void setsTitular(String sTitular) {
        this.sTitular = sTitular;
    }

    public double getdCantidad() {
        return dCantidad;
    }

    public void setdCantidad(double dCantidad) {
        this.dCantidad = dCantidad;
    }

    public double getdCantActual() {
        return dCantActual;
    }

    public void setdCantActual(double dCantActual) {
        this.dCantActual = dCantActual;
    }
}
