
import java.util.ArrayList;
import java.util.List;

class Cliente {  
    private String nome;  
    private List<Livro> livrosEmprestados;  


    public Cliente(String nome) {  
        this.nome = nome;  
        this.livrosEmprestados = new ArrayList<>();  
    }  

    public String getNome() {  
        return nome;  
    }  

    

    public void adicionarLivro(Livro livro) {  
        livrosEmprestados.add(livro);  
    }  

    public void removerLivro(Livro livro) {  
        livrosEmprestados.remove(livro);  
    }  

    public List<Livro> getLivrosEmprestados() {  
        return livrosEmprestados;  
    }  

    public boolean temLivroEmprestado(Livro livro) {  
        return livrosEmprestados.contains(livro);  
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }


}

