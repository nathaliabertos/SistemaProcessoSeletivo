public class Case1 {
    public static void main(String[] args) {
        analisarCandidatos(1900.0);
        analisarCandidatos(22000.0);
        analisarCandidatos(2000.0);
    }


    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }
}


