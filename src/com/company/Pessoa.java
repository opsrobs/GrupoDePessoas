package com.company;
import java.util.ArrayList;

import static com.company.BuscaDados.*;

public class Pessoa {
    private String sexo;
    private int idade;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    Pessoa pessoa;

    public int lista(){
        String condicao = buscaSexo();
        int cont=0;
        ArrayList<String> pessoas = new ArrayList<>();
        while (!condicao.equalsIgnoreCase("n")){
            pessoa = new Pessoa();
            pessoas.add(toString());
            totalHomens(buscaSexo());

        }
        System.out.println(pessoas.size());
        return pessoas.size();
    }
    public int totalHomens(String condicao){
        int cont=0;
        if (condicao.equalsIgnoreCase("masculino")){
            cont++;
        }
        return cont;
    }



    public void preencherPessoa(){
        pessoa.setSexo(buscaSexo());
        pessoa.setIdade(buscaIdade());
    }
    public String toString(){
        final String s = "\n" + pessoa.getSexo() +
                "\n" + pessoa.getIdade() +
                "O percentual de pessoas do sexo masculino é: " +
                ((totalHomens(buscaSexo()) / lista()) * 100);
        return s;

    }
}
