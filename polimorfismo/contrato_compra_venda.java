package polimorfismo;

public class contrato_compra_venda extends contrato {
    //Adiciona a propriedade mercadoria
    public String mercadoria;

    //Sobrescreve o valor
    @Override
    public boolean Salvar(){
        if(this.mercadoria.equals("alcool")){
            return false;
        }
        return true;
    }
}
