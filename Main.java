public class Main {
    public static void main(String[] args){

        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.estaVazia();

        listaEncadeada.addInicio(10);
        listaEncadeada.addFinal(15);
        listaEncadeada.addFinal(17);
        listaEncadeada.addFinal(16);

        listaEncadeada.imprimirLista();

        listaEncadeada.estaVazia();

        listaEncadeada.retirarElemento(1);

        listaEncadeada.imprimirLista();

        listaEncadeada.tamanhoLista();

    }
}
