/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev;

import java.util.Scanner;
/**
 *
 * @author: Maria Eduarda, Sammuel Rodrigues, Larissa Santos, Ereikson Mendes, Nayra
 */
// REVISÃO EXTENDIDA PELA CLASSE CLIENTE
public class Revisao extends Carro {

    /* Declaração e atribuição de variaveis de instancia da classe*/
    private int codRev; // Uma variável inteira para armazenar o código de revisão
    private String descRev;// Uma variável de string para armazenar a descrição da revisão

    /*CONSTRUTOR COM PARAMETROS DA SUPERCLASSE*/
    public Revisao(int codRev, String descRev, String marca, String modelo, int ano, String placa) {
        super(marca, modelo, ano, placa);
        this.codRev = codRev;
        this.descRev = descRev;
    }

   //CONTRUTOR VAZIO//
    public Revisao() {

    }

    /* CADASTRAR CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
    public void cadastra(){
         super.cadastra();
         Scanner sca = new Scanner(System.in);
         System.out.print("Descrição da Revisão: ");
         setDescRev(sca.nextLine());
         System.out.print("Código da Revisão: ");
         setCodRev(sca.nextInt());
         sca.close();
    }
     
    /* EXIBIÇÃO DO CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
    public void mostra(){
        super.mostra();
        System.out.println("CÓDIGO DA REVISÃO: "+codRev
        +"\nDESCRIÇÃO: "+descRev);
    }

    
    /*Conjunto de métodos getters e setters da classe Entrega para acessar e atualizar seus campos
    - Os métodos getters são usados para obter o valor atual dos campos
    - Os métodos setters são usados para atualizar o valor dos campos*/
    public int getCodRev() {
        return codRev;
    }

    public void setCodRev(int codRev) {
        this.codRev = codRev;
    }

    public String getDescRev() {
        return descRev;
    }

    public void setDescRev(String descRev) {
        this.descRev = descRev;
    }

    

}
