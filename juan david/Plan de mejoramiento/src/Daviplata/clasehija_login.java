package Daviplata;

public class clasehija_login extends ClasePadre_Abstracta{
    
    public void Transacciones(){
        System.out.print("digita tu nombre: ");
        meterplata();
        System.out.print("digita tu numero de identidad: ");
        meterplata();
        
        transacciones = getSaldo();
        setSaldo(transacciones + meterplata);
        System.out.println("-----------------------------------");
        System.out.println("Tu nombre es: " + meterplata);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }
    
}