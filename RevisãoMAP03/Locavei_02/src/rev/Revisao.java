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
public class Revisao {

    /* Declaração e atribuição de variaveis de instancia da classe*/

    public int codRev; // Uma variável inteira para armazenar o código de revisão
    public String descRev;// Uma variável de string para armazenar a descrição da revisão

    public Revisao(int codRev, String descRev) {
        this.codRev = codRev;
   
        this.descRev = descRev;
    }
    
    


    /* CADASTRAR CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
//    public void cadastra() {
//        // Solicita ao usuário que digite o código de revisão e armazena-o na variável 'codRev'
//        codRev = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da Revisão: "));
//        // Solicita ao usuário que digite a descrição e armazena-o na variável 'descRev'
//        descRev = JOptionPane.showInputDialog("Entre com a Descrição da Revisão: ");
//    }
    
     /* CADASTRAR CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
     public void cadastra(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Entre com o código da Revisão: ");
         codRev = sc.nextInt();
         System.out.print("Entre com a Descrição da Revisão: ");
         sc.nextLine();
         descRev = sc.nextLine();
     }

    /* EXIBIÇÃO DO CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
//    public void mostra() {
//        // Exibe uma mensagem com os dados digitados pelo usuário
//        JOptionPane.showMessageDialog(null, "Código da Revisão: " + codRev + ""
//                + "\nDescrição: " + descRev);
//    }
     
    /* EXIBIÇÃO DO CÓDIGO E DESCRIÇÃO DA REVISÃO (via interface)*/
    public void mostra(){
        System.out.println("\n-------------------------");
        System.out.println("CÓDIGO DA REVISÃO: "+getCodRev()
        +"\nDESCRIÇÃO: "+getDescRev());
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
