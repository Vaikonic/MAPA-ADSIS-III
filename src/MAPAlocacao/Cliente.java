package MAPAlocacao;

import javax.swing.JOptionPane;

public class Cliente {
    protected int ID;
    protected String nome;
    protected String cpf;
    protected String telefone;

    public void cadastraUsuario(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do cliente");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do cliente");

    }
    public String dadosUsuario(){
        String msg = "Cliente\n";
        msg = msg + "Nome: " + this.nome + "\n";
        msg = msg + "CPF: " + this.cpf + "\n";
        msg = msg + "Telefone: " + this.telefone + "\n";

        return msg;

    }
}


