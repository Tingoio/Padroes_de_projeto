package heranca;
public class estudante extends pessoa{
    public String rgm;

    @Override
    public boolean Salvar(){
        System.out.println("Salvando na tabela estudante..");
        return true;
    }
}
