package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        int idade = 18;

        int salario = 1000;
        if (idade <= 18) {
            salario = 500;
            System.err.println("Salário: " + salario);
        } else
            salario = 1000;

        int[] idades = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        ArrayList<Integer> idad = new ArrayList<Integer>();
        idad.add(8);
        idad.add(8);
        idad.add(8);
        idad.add(8);
        idad.add(8);

        for (int i = 0; i < idad.size(); i++) {
            System.out.println(idad.get(i));
        }
        char letra = 'a';
        String nome = String.valueOf(letra);
        System.out.println(nome);

        int letr = 4;
        String nom = String.valueOf(letr);

        System.out.println(letr);
        System.out.println(nom);

        System.out.println(((Object) letr).getClass().getName());
        System.out.println(((Object) nom).getClass().getName());

        int a = 10;
        double b = a;

        // porem

        // a = b; // não é possivel

        // para dar certo é necessario fazer um cast

        a = (int) b;

        // pois o java não faz conversão automatica de tipos
        // E o cast é uma forma de forçar a conversão de um tipo de dado para outro.
        // O cast é feito colocando o tipo de dado desejado entre parênteses antes do
        // valor a ser convertido.
        // O cast é uma forma de forçar a conversão de um tipo de dado para outro.
        // O cast é feito colocando o tipo de dado desejado entre parênteses antes do
        // valor a ser convertido.

        // COMO O INT E MENOR QUE O DOUBLE ELE NÃO FAZ A CONVERSÃO AUTOMATICA!!!!!!

        // PARAMOS NO MINUTO 32:00Como sair do ZERO em JAVA em 1h - com
    }
}