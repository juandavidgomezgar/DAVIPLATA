package Daviplata;

public class ClaseHija_sacarplata extends ClasePadre_Abstracta {
    public void Transacciones() {
        System.out.print("Cuanto deseas retirar: ");
        sacarplata();
        if (sacarplata <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - sacarplata);
            System.out.println("-----------------------------------");
            System.out.println("Sacaste : " + sacarplata);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("---------------------");
        }
    }
}
