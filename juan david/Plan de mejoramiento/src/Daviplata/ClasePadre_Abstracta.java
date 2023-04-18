package Daviplata;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, sacarplata, meterplata,RecargarPlata,login;
    private int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. sacar plata.");
                System.out.println("    3. meter plata.");
                System.out.println("    4. Recargar plata.");
                System.out.println("    5. loguearse");
                System.out.println("    6. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 6) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (bandera == 0);
            
            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consultarsaldo();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new ClaseHija_sacarplata();
                mensajero.Transacciones();
            } else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new ClaseHija_meterplata();
                mensajero.Transacciones();
            } else if(seleccion == 4){
                ClasePadre_Abstracta mensajero = new ClaseHija_RecargarPlata();
                mensajero.Transacciones();
            } else if(seleccion == 5){
                ClasePadre_Abstracta mensajero = new clasehija_login();
                mensajero.Transacciones();
            } else if(seleccion == 6){
                System.out.println("--------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("--------------------------");
                bandera = 6;
            }
        } while (bandera != 2);
    }
    
    //Método para solicitar cantidad de la plata que se retira
    public void sacarplata(){
        sacarplata = entrada.nextInt();
    }
    
    //Método para solicitar meterplata
    public void meterplata(){
        meterplata = entrada.nextInt();
    }
    //metodo para recargar plata
    public void RecargarDinero(){
        RecargarPlata = entrada.nextInt();
    }
    //Método abstracto
    public abstract void Transacciones();
    
    //Métodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}



/*DISEÑAR UN PROGRAMA DE UN BOLSILLO ELECTRONICO DAVIPLATA,CON METODOS DE METER PLATA,SACAR PLATA,
LOGUEARSE,CONSULTAR SALDO,REALIZAR RECARGAS */