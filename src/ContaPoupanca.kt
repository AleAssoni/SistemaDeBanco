class ContaPoupanca(
    var rendimento: String,
    pix: String,
    saldo: String,
    numero: String,
    agencia: String,
    senha: String,
    cliente: Cliente,
    gerente: Gerente,
) : Conta(
    pix,
    saldo,
    numero,
    agencia,
    senha,
    cliente,
    gerente,
){
    override fun toString(): String {
        return "\n=-= Conta Poupanca =-=\n"+
                "- Pix: $pix\n"+
                "- Saldo: $saldo\n"+
                "- Número da Conta: $numero\n"+
                "- Agência: $agencia\n"+
                "- Senha: $senha\n"+
                "- Rendimento: $rendimento\n"+
                "- Dados Adicionais: $cliente\n"+
                "- Dados Adicionais: $gerente"+
                "-=- Ações da Conta Poupança -=-";
    }
    override fun sacar(): String = "Saque efetuado com sucesso!"
    override fun depositar(): String = "Você não pode depositar mais do que o seu limite!"
    override fun transferir(): String = "Valor tranferido com sucesso!"

}