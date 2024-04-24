public class Livro {

    
    private String nome, autor; 
    private int isbn, ano;
    
    public Livro(String nome, String autor, int isbn, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
    }


    //getter e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  
}
