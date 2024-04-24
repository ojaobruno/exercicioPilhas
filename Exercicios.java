import java.util.Scanner;
import java.util.Stack;

public class Exercicios{
    //Exercicios do 1 ao 3, Pilhas e Filas: 

    public static void main(String[] args) throws Exception {
    
    while(true){
        int opcao; 

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Escolha a opção desejada entre 1 e 3: ");
        System.out.println("1 - Opção 1 ");
        System.out.println("2 - Opção 2 ");
        System.out.println("3 - Opção 3 ");
        System.out.print("Sua opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println();
                opcao1();
                break;
            case 2:
                System.out.println();
                opcao2();
                break;
            case 3:
                System.out.println();
                opcao3();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
            }
        }
    }

    //Métodos: 
    public static void opcao1(){

        Scanner ler = new Scanner(System.in); 
        Stack <Integer> numPar = new Stack<>();
        Stack <Integer> numImpar = new Stack<>(); 

        //Variavel
        int num1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número entre 1 e 99: ");
            num1 = ler.nextInt();

            while(num1 <= 0 || num1 >= 100){
                System.out.println("Número inválido. Digite um número entre 1 e 99: ");
                num1 = ler.nextInt();
            }
            
            if(num1%2==0){
                numPar.push(num1);
            }else{
                numImpar.push(num1);
            }
        }
        System.out.println();
        System.out.println("A pilha de números pares: "+numPar);
        System.out.println("A pilha de números ímpares: "+numImpar);
    }

    public static void opcao2(){
        Scanner ler = new Scanner(System.in); 
        Stack <Integer> numPar = new Stack<>();
        //Stack <Integer> numImpar = new Stack<>(); 

        //Variavel
        int num1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número par entre 1 e 99: ");
            num1 = ler.nextInt();

            while(num1 <= 0 || num1 >= 100){
                System.out.println("Número inválido. Digite um número entre 1 e 99: ");
                num1 = ler.nextInt();
            }
            
            if(num1%2==0){
                numPar.push(num1);
            }else{
                continue;
            }
        }
        if(numPar.empty()){
            System.out.print("A pilha esta vazia, pois você inseriu apenas números impares ");
        }
        else{
            System.out.println("A pilha de números pares é: "+numPar);
            System.out.println("Desempilhando e imprimindo os números pares:");
            while (!numPar.empty()) {
                System.out.println(numPar.pop());
        }
    }
        
}

    public static void opcao3(){
        Scanner ler = new Scanner(System.in);
        Stack<Livro> pilhaLivros = new Stack<>();
        int numLivros = 0;

        while (numLivros < 2) {
            System.out.println("Digite as informações do livro " + (numLivros + 1) + ":");
            System.out.print("Nome: ");
            String nome = ler.nextLine();

            System.out.print("Autor: ");
            String autor = ler.nextLine();

            System.out.print("ISBN: ");
            int isbn = ler.nextInt();
            ler.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Ano: ");
            int ano = ler.nextInt();
            ler.nextLine(); // Consumir a quebra de linha pendente

            Livro livro = new Livro(nome, autor, isbn, ano);
            pilhaLivros.push(livro);
            numLivros++;

            System.out.println("Livro adicionado à pilha.\n");
        }

        // Mostra os atributos de todos os livros na pilha
        System.out.println("Livros na pilha:");
        System.out.println();
        for (Livro livro : pilhaLivros) {
            livro.imprimir();
            System.out.println();
        }

    }
}
