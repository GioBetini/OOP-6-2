package Controller;

import javax.swing.JOptionPane;

import Model.tempoParcial;

public class parcialController implements IFuncionarioController{
    @Override  
    public tempoParcial contratacao(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de identificação do funcionário"));
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira seu salário."));
        
        tempoParcial novoFuncionario = new tempoParcial();
        novoFuncionario.setId(id);
        novoFuncionario.setNome(nome);
        novoFuncionario.setSalario(salario);
        
        return novoFuncionario;
    }

}
