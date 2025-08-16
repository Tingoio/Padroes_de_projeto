package polimorfismo;

public class contrato_prestacao_de_servico extends contrato {
    //Adicionar uma propriedade
    public String servico_contratado;

    //Sobrescrever o metodo salvar
    @Override
    public boolean Salvar() {
        System.out.println("bunda");
        return true;
    }
}
