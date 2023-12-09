package MAPAlocacao;

import javax.swing.*;

public class Carro {
    protected int ID;
    protected String modelo;
    protected String marca;
    protected double valorPorKm;

    public void cadastrarCarro(){
        this.modelo = JOptionPane.showInputDialog("Digite o nome do modelo");
        this.marca = JOptionPane.showInputDialog("Digite o nome da marca");
        this.valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por km"));
    }
    public String mostrarDadosCarro(){
        String msg = "Carro\n";
        msg = msg + "Modelo: " + this.modelo + "\n";
        msg = msg + "Marca: " + this.marca + "\n";
        msg = msg + "Valor por Km: " + this.valorPorKm + "\n";

        return msg;
    }
}
