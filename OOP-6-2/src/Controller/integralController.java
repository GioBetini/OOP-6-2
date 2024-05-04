package Controller;

import javax.swing.JOptionPane;

import Model.tempoIntegral;

public class integralController implements IFuncionarioController {

    @Override
    public tempoIntegral contratacao() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de identificação do funcionário"));
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));
        
        tempoIntegral novoFuncionario = new tempoIntegral();
        novoFuncionario.setId(id);
        novoFuncionario.setNome(nome);
        novoFuncionario.setSalario(salario);

        return novoFuncionario;

    }
}
