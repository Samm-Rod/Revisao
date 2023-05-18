/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev;

import java.util.Scanner;

/**
 *
 * @author SouthSystem
 */
/* CLASSE SUPER CLIENTE  */
public class Carro {
    private String marca; 
    private String modelo;
    private int ano; 
    private String placa; 

    // CONTRUTOR CARRO COM PARAMETROS
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    //CONTRUTOR VAZIO
    public Carro() {

    }

    public void cadastra(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Marca do carro: ");
         setMarca (sc.nextLine());
         System.out.print("Modelo do carro: ");
         setModelo (sc.nextLine());
         System.out.print("Ano do carro: ");
         setAno (sc.nextInt());
         System.out.print("Numero da placa: ");
         sc.nextLine();
         setPlaca (sc.nextLine());
         sc.close();

    }

    public void mostra (){
     System.out.println("\n-------------------------");
     System.out.println("MARCA: "+marca
        +"\nMODELO: " +modelo
        +"\nANO: "+ano
        +"\nPLACA: "+placa);
    }

    /* EXIBIÇÃO DA MARCA, MODELO, ANO E PLACA*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
  }
    

    
    
    
    
    
 
    
    
    
    

