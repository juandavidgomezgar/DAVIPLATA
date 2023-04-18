package Daviplata;

public class ClaseHija_RecargarPlata extends ClasePadre_Abstracta {
    public void Transacciones() {
        System.out.print("Cuanto deseas recargar: ");
        RecargarPlata();
        if (RecargarPlata <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - RecargarPlata);
            System.out.println("-----------------------------------");
            System.out.println("Recargaste : " + sacarplata);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("-----------------------------------");
        } else {
            System.out.println("---------------------");
            System.out.println("Recarga insuficiente.");
            System.out.println("---------------------");
        }
    }

    private void RecargarPlata() {
    }
}
