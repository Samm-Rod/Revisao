package rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Documento extends Revisao {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int KmAtual;
    private String nChassi;


    // Construtor com argumentos
    public Documento(int codRev, String descRev, String marca, String modelo, int ano, int kmAtual) {
        super(codRev, descRev);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        KmAtual = kmAtual;
    }

    // Construtor sem argumentos
    public Documento(){

    }

    // Inserção de dados da documentação
    public void historico(){
        ArrayList<Documento> list = new ArrayList<>();
        super.cadastra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a marca do carro: ");
        setMarca(sc.nextLine());
        System.out.print("Entre com o modelo do carro: ");
        setModelo(sc.nextLine());
        System.out.print("Entre com o ano do carro: ");
        setAno(sc.nextInt());
        System.out.print("Entre com a quilomentragem Atual: ");
        setKmAtual(sc.nextInt());
        list.add(new Documento(getCodRev(),getDescRev(),marca, modelo, ano, KmAtual));
    }

    // Lista revisões documentadas
    public List<Documento> listar(){
        ArrayList<Documento> list = new ArrayList<>();
        for(Documento pesq: list){
            System.out.println(pesq);
        }
        return list;
    }

    // Faz uma busca da lista de revisões
    public List<Documento> pesquisa(String nChassi){
        ArrayList<Documento> list = new ArrayList<>();
        boolean nCha = list.contains(nChassi);
        for(Documento pesq: list){
            if(nCha){
                System.out.println(pesq);
            }else{
                System.out.println("Numero do Chassi invalido ou " +
                        "Carro nao documentado !");
            }
        }
        return list;
    }

    public void calculaRevisao(){

    }

    public void updateHistorico(){

    }

    public void TipoRevisao(){

    }

    public List<Documento>  removeDocumento(String nChassi){
        ArrayList<Documento> list = new ArrayList<>();
        for(Documento pesq: list){
            if(nChassi.equals(getnChassi())){
                list.remove(pesq);
                System.out.println("Dados removidos da lista de revisão !");
            }else{
                System.out.println("Numero do Chassi invalido ou " +
                        "Carro nao documentado !");
            }
        }
        return list;
    }



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

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int kmAtual) {
        KmAtual = kmAtual;
    }

    public String getnChassi() {
        return nChassi;
    }

    public void setnChassi(String nChassi) {
        this.nChassi = nChassi;
    }

    @Override
    public String toString() {
        return "Documento " +
                "[ Marca: " + marca + '\'' +
                ", Modelo: " + modelo + '\'' +
                ", Ano: " + ano +
                ", Quilometragem: " + KmAtual +
                ", Numero do Chassi: " + nChassi + '\'' +
                "] " + super.toString();
    }
}
