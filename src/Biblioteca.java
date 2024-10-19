import java.util.ArrayList;
import java.util.List;

class Biblioteca {  
    private List<Livro> livros = new ArrayList<>();  
    private List<Cliente> clientes = new ArrayList<>();  
    private List<Emprestimo> emprestimos = new ArrayList<>();  

    public Biblioteca() {  
        this.livros = new ArrayList<>();  
        this.clientes = new ArrayList<>();  
        this.emprestimos = new ArrayList<>();  
    }  

    public void adicionarLivro(Livro livro) {  
        livros.add(livro);  
    }  

    public void removerLivro(int id) {  
        livros.remove(id-1);  
    }  

    public void cadastrarCliente(Cliente cliente) {  
        clientes.add(cliente);  
    }  

    public Livro buscarLivro(int id) {  
        for (Livro livro : livros) {  
            if (livro.getId() == id) {  
                return livro;  
            }  
        }  
        return null;  
    }  

    public List<Livro> buscarLivrosEmprestados(Cliente cliente) {  
        return cliente.getLivrosEmprestados();  
    }  

    public void emprestarLivro(Cliente cliente, int id) {  
        Livro livro = buscarLivro(id);  
        if (livro != null && livro.isDisponivel()) {  
            if (clientes.contains(cliente)) {  
                livro.isDisponivel();  
                cliente.adicionarLivro(livro);  
                emprestimos.add(new Emprestimo(cliente, livro));  
                System.out.println("Livro '" + livro.getTitulo() + "' emprestado com sucesso a " + cliente.getNome() + ".");  
            } else {  
                System.out.println("Cliente " + cliente.getNome() + " não cadastrado.");  
            }  
        } else {  
            if (livro == null) {  
                System.out.println("Livro com ID " + id + " não encontrado.");  
            } else {  
                System.out.println("Livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");  
            }  
        }  
    }  

    public void devolverLivro(Cliente cliente, int id) {  
        Livro livro = buscarLivro(id);  
        if (livro != null && cliente.temLivroEmprestado(livro)) {  
            livro.isDisponivel();  
            cliente.removerLivro(livro);  
            emprestimos.removeIf(emp -> emp.getLivro().equals(livro) && emp.getCliente().equals(cliente));  
            System.out.println("Livro '" + livro.getTitulo() + "' devolvido com sucesso por " + cliente.getNome() + ".");  
        } else {  
            System.out.println("Livro '" +  "' não está emprestado para " + cliente.getNome() + ".");  
        }  
    }  

    public void listarLivros() {  
        System.out.println("Livros cadastrados:");  
        for (Livro livro : livros) {  
            System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + ", Disponível: " + livro.isDisponivel());  
        }  
    }  
}  
