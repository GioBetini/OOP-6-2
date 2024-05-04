package Model;

public class tempoIntegral extends Funcionario{
    private int bancoHoras;

    public tempoIntegral(){
        bancoHoras = 0;
    }

    public int getBancoHoras() {
        return bancoHoras;
    }

    public void setBancoHoras(int bancoHoras) {
        this.bancoHoras = bancoHoras;
    }
}
