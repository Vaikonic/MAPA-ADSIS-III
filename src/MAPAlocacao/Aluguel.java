package MAPAlocacao;

import javax.swing.JOptionPane;

public class Aluguel {
    protected int ID;
    protected int qtdDias;
    protected int kmInicial;
    protected int kmFinal;
    protected double valorTotalAluguel;
    private final Cliente cliente = new Cliente();
    private final Carro carro = new Carro();

    public void iniciarLocacao(){
        cliente.cadastraUsuario();
        carro.cadastrarCarro();

        this.qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias"));
        this.kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o KM inicial"));
        valorTotalAluguel = qtdDias * carro.valorPorKm;

        if (qtdDias > 10){
            valorTotalAluguel = valorTotalAluguel * 0.1;
        }else{
            System.out.println("Não tem desconto :(");
        }
        if (qtdDias > 20) {
            valorTotalAluguel = valorTotalAluguel * 0.2;
        }else{
            System.out.println("Não tem desconto :(");
        }
        valorTotalAluguel *= 100;

    }
    public void fecharLocacao(){
        this.kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o KM final"));

    }
    public void mostrarResumoLocacao(){
        String msg = "Aluguel\n";
        msg = msg + "Quantidade de dias: " + this.qtdDias + "\n";
        msg = msg + "Km Inicial: " + this.kmInicial + "\n";
        msg = msg + "Km Final: " + this.kmFinal + "\n";
        msg = msg + "Valor Total: R$" + this.valorTotalAluguel + "\n";

        JOptionPane.showMessageDialog(null,cliente.dadosUsuario());
        JOptionPane.showMessageDialog(null,carro.mostrarDadosCarro());
        JOptionPane.showMessageDialog(null,msg);


    }

}
