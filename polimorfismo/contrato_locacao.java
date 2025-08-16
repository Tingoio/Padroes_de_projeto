package polimorfismo;

public class contrato_locacao extends contrato {
    public double valor;

    @Override
    public boolean Salvar(){
        if(this.situacao.equals("ativo")){
            return true;
        }
        return false;
    }
}
