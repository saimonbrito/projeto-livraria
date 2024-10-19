class Emprestimo {  
    private Cliente cliente;  
    private Livro livro;  

    public Emprestimo(Cliente cliente, Livro livro) {  
        this.cliente = cliente;  
        this.livro = livro;  
    }  

    public Cliente getCliente() {  
        return cliente;  
    }  

    public Livro getLivro() {  
        return livro;  
    }  

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }


}  