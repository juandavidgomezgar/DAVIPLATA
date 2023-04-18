package Daviplata;

public class ClaseHija_Consultarsaldo extends ClasePadre_Abstracta{
    public void Transacciones(){
        System.out.print("------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.print("------------------------------------");
    }    
}
