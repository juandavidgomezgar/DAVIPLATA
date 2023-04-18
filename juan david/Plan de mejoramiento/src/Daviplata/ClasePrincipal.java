package Daviplata;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClasePadre_Abstracta mesajero = new ClaseHija_Consultarsaldo();
        mesajero.setSaldo(1000000);
        mesajero.Operaciones();
    }
}
