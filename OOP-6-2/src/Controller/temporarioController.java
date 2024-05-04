package Controller;

import javax.swing.JOptionPane;

import Model.temporario;

public class temporarioController implements IFuncionarioController{
    public temporario contratacao(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de identificação do funcionário"));
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia do fim do contrato"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes do fim do contrato"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do fim do contrato"));



        temporario novoFuncionario = new temporario();
        novoFuncionario.setId(id);
        novoFuncionario.setNome(nome);
        novoFuncionario.setSalario(salario);
        novoFuncionario.setDia(dia);
        novoFuncionario.setMes(mes);
        novoFuncionario.setAno(ano);
        
        return novoFuncionario;
    }
}
