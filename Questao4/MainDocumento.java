package Questao4;

public class MainDocumento {
    public static void main(String[] args) {
      
        Documento documento = new Documento("Pronto") {
            @Override
            public void exibirDetalhes() {
                System.out.println("Detalhes do documento: " + getTitulo());
            }
        };

        
        documento.exibirDetalhes();

        
        Impressao impressao = new Impressao() {
            @Override
            public void imprimir() {
                System.out.println("Imprimindo o documento: " + documento.getTitulo());
            }
        };
        impressao.imprimir();

        
        Compartilhamento compartilhamento = new Compartilhamento() {
            @Override
            public void compartilharPorEmail(String email) {
                System.out.println("Compartilhando o documento por e-mail para: " + email);
            }
        };
        compartilhamento.compartilharPorEmail("Eduardo100@gnys.com");
    }
}
