package com.company;

import javax.swing.*;

public class BuscaDados {
    public static String buscaSexo(){
        String sexo;

        sexo= JOptionPane.showInputDialog("Informe o sexo \n\t[MASCULINO]\n\t[FEMININO]\nOu envie 'N' para sair.");

        return sexo;
    }
    public static int buscaIdade(){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade!!!"));
        return idade;
    }


}
