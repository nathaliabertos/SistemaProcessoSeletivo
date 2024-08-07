public class Case3 {
    public static void main(String[] args) {
        imprimirSelecionados();

    }

    static void imprimirSelecionados() {
        String[] candidatos = {"AUGUSTO", "MÔNICA", "FABRÍCIO", "DANIELA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }
    }
}
