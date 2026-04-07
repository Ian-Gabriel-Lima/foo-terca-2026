import aula6.Cliente;

void main() {
    ArrayList<Cliente> clientes = new ArrayList<>();
    boolean desejaSair = false;

    while (!desejaSair) {
        int opcaoEscolhida = menu();

        switch (opcaoEscolhida) {
            case 1:
            String nome = IO.readln("Digite o nome do cliente: ");
            String cpf = IO.readln("Digite seu cpf :");
            Float saldo = Float.parseFloat(IO.readln("Digite o saldo do cliente: "));
            Cliente novoCliente = new Cliente(nome, cpf, saldo);
                break;
            case 2:
                //
            case 5:
                desejaSair = true;

        }
    }

}

public int menu() {
    System.out.println("Digite uma das opções abaixo: ");
    System.out.println("1 = add novo cliente");
    System.out.println("2 = listar clientes");
    System.out.println("3 = Remover cliente");
    System.out.println("4 = Editar cliente");
    System.out.println("0 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;
}
