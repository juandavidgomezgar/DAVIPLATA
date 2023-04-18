package Daviplata;

public class ClaseHija_meterplata extends ClasePadre_Abstracta{
    
    public void Transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        meterplata();
        
        transacciones = getSaldo();
        setSaldo(transacciones + meterplata);
        System.out.println("-----------------------------------");
        System.out.println("Depositaste: " + meterplata);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
