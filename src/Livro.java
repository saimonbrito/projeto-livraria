            
import java.util.Calendar;  
import java.util.Date;  

class Livro {  
    private int id;  
    private String autor;  
    private String titulo;  
    private boolean disponivel;  
    private Date dataCadastro;  
    private Date dataEntrega;  

    public Livro(int id, String autor, String titulo) {  
        this.id = id;  
        this.autor = autor;  
        this.titulo = titulo;  
        this.disponivel = true; // Inicialmente, o livro está disponível  
        this.dataCadastro = new Date();  
        this.dataEntrega = calcularDataEntrega();  
    }  

    private Date calcularDataEntrega() {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(new Date());  
        calendar.add(Calendar.DAY_OF_YEAR, 10); // 10 dias a partir de hoje  
        return calendar.getTime();  
    }  

    public int getId() {  
        return id;  
    }  

    public String getTitulo() {  
        return titulo;  
    }  

    public boolean isDisponivel() {  
        return disponivel;  
    }  

    public void marcarComoIndisponivel() {  
        this.disponivel = false;  
    }  

    public void marcarComoDisponivel() {  
        this.disponivel = true;  
    }  

    public Date getDataCadastro() {  
        return dataCadastro;  
    }  

    public Date getDataEntrega() {  
        return dataEntrega;  
    }  

    public void setId(int id) {
        this.id = id;
    }
    

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getAutor() {
        return autor;
    }

    
}  