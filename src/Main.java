
import java.util.List;
import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {  
        Biblioteca biblioteca = new Biblioteca();

            Livro livro1 = new Livro(1, "George Orwell", "1984");
            Livro livro2 = new Livro(2, "J.R.R. Tolkien", "O Senhor dos Anéis");
            Livro livro3 = new Livro(3, "sant enreck", "fundao escuro");
            Livro livro4 = new Livro(4, "bite entt", "sentenarios unidos");
            Livro livro5 = new Livro(5, "sambaiba", "etart o fugitivo");
            Livro livro6 = new Livro(6, "jet kerter", "renegado dos seculos");
            
            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(livro2);
            biblioteca.adicionarLivro(livro3);
            biblioteca.adicionarLivro(livro4);
            biblioteca.adicionarLivro(livro5);
            biblioteca.adicionarLivro(livro6);
          
        try (Scanner scanner = new Scanner(System.in)) {
            
            
            System.out.println(" Seja bem vindo ; a livraria Saikas");
            
            System.out.println(" Diga o que realmente deseja");
            

            boolean sair = false;
                while (!sair) {
                    System.out.println(" ");
                    System.out.println(" (1) Emprestimo de Livro");
                    System.out.println(" (2) Devolução de Livro");
                    System.out.println(" (3) Sair do sistema \n");
                    System.out.print("Escolha uma opção: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1 ->   {
                            System.out.println(" ");
                                    biblioteca.listarLivros();

                                    Cliente cliente1 = new Cliente("Alice");  
                                    biblioteca.cadastrarCliente(cliente1);  
                                    
                                    List<Livro> livrosEmprestados = biblioteca.buscarLivrosEmprestados(cliente1);  
                                    System.out.println("Livros emprestados para " + cliente1.getNome() + ":");  
                                
                                    for (Livro livro : livrosEmprestados) {  
                                        System.out.println(" - " + livro.getTitulo());  
                                    }  

                                    System.out.println("");
                                    System.out.print("Escolha um livro pelo id: ");  
                                    int  continuar = scanner.nextInt();



                                    if(continuar != 0){
                    
                                        System.out.println("");
                                        
                                        biblioteca.emprestarLivro(cliente1, continuar);
                                        biblioteca.removerLivro(continuar);
                                        


                                        System.out.println("");

                                        biblioteca.listarLivros();
                                    }else{
                                        System.out.println("Livro nao encontrado ");
                                    }

                            sair = true; // Aqui você indica que deseja sair do loop após essa escolha
                                    }

                        case 2 ->   {
                            System.out.println("Devolver livro \n");
                            System.out.print("Digite seu nome: ");
                            String nomeCliente = scanner.nextLine();
                            
                            Cliente cliente = new Cliente(nomeCliente);
                            
                            System.out.print("Digite o id do livro a ser emprestado: ");
                            int tituloEmprestar = scanner.nextInt();
                            biblioteca.emprestarLivro(cliente, tituloEmprestar);
                            sair = true;
                                    }

                        case 3 ->   {
                            System.out.println("Volte sempre! \n");
                            sair = true;
                                    }

                        default -> System.out.println("Opção inválida. Escolha novamente \n");
                    }
                }

                   
        }  
              
            
        
    }  
}  
                    