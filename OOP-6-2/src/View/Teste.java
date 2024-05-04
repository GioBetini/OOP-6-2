package View;

import Controller.integralController;
import Controller.parcialController;
import Controller.temporarioController;
import Model.tempoIntegral;
import Model.tempoParcial;
import Model.temporario;

public class Teste {
    public static void main(String[] args) throws Exception {
        integralController integral = new integralController();
        tempoIntegral funcionarioIntegral = integral.contratacao();
        
        System.out.println(String.format("Funcionário Integral contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"Banco de horas: %d\n"
                                        , funcionarioIntegral.getId(), funcionarioIntegral.getNome()
                                        , funcionarioIntegral.getSalario(), funcionarioIntegral.getBancoHoras()));

        parcialController parcial = new parcialController();
        tempoParcial funcionarioParcial = parcial.contratacao();

        System.out.println(String.format("Funcionário parcial contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"Hora de entrada: %d\n"
                                        +"Hora de saída: %d\n"
                                        , funcionarioParcial.getId(), funcionarioParcial.getNome()
                                        , funcionarioParcial.getSalario(), funcionarioParcial.getHoraEntrada(), funcionarioParcial.getHoraSaida()));


        temporarioController temp = new temporarioController();
        temporario funcionarioTemporario =  temp.contratacao();

        System.out.println(String.format("Funcionário temporario contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"data final "+funcionarioTemporario.getDia()+"/"+funcionarioTemporario.getMes()+"/"+funcionarioTemporario.getAno()
                                        , funcionarioTemporario.getId(), funcionarioTemporario.getNome()
                                        , funcionarioTemporario.getSalario()));
    }
}
