package com.mycompany.n2;
/**
 * @author ester.silva
 */
public class Teste {
    public static void main(String[] args) {
        ProvaUCB alunoUCB = new ProvaUCB(8.5, 9.0);
        if (alunoUCB.aprovado()) {
            System.out.println("Aluno UCB: Aprovado");
        } else {
            System.out.println("Aluno UCB: Reprovado");
        }

        ProvaFafifo alunoFafifo = new ProvaFafifo(6.5, 7.5);
        if (alunoFafifo.aprovado()) {
            System.out.println("Aluno Fafifo: Aprovado");
        } else {
            System.out.println("Aluno Fafifo: Reprovado");
        }
    }
}