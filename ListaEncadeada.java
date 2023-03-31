import java.util.Arrays;


public class ListaEncadeada {
    private Node head;

    private static class Node {
        int data;
        Node next;

        //definimos a estrutura dos nós, possuindo um ponteiro para o proximo e a informação presente nele

        public Node(int data){

            this.data = data;
            this.next = null;

        }
    }

    public void estaVazia(){
        if(head == null){
            System.out.println("esta vazia!");
        }else{
            System.out.println("nao esta vazia!");
        }
    }

    public void imprimirLista(){
        Node noAtual = head;
        System.out.println("os elementos da lista são: ");
        while(noAtual != null){
            System.out.println(noAtual.data);
            noAtual = noAtual.next;

        }

    }

    public void addInicio(int data){
        Node novoNode = new Node(data);
        novoNode.next = head;
        head = novoNode;
    }

    public void addFinal(int data){
        Node novoNode = new Node(data);

        if(head == null){
            head = novoNode;
            return;
        }

        Node noAtual = head;

        while(noAtual.next != null){

            noAtual = noAtual.next;

        }
        noAtual.next = novoNode;

    }

    public void tamanhoLista(){
        Node noAtual = head;
        int numElementos = 0;
        while(noAtual != null){
            numElementos++;
            noAtual = noAtual.next;

        }
        System.out.println("o numero de elementos é:" + numElementos);
    }

    public void retirarElemento(int posicao){
        Node noAtual = head;

        for (int p = 0; p < posicao-2; p++) {
            noAtual = noAtual.next;
        }

        if(posicao == 1){
            head = head.next;
            return;
        }

        Node noAux = noAtual;
        noAtual = noAtual.next;
        noAux.next = noAtual.next;

    }

}


