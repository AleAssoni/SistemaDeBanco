class ContaCorrente(
    var limite: String,
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
        return "=-= Conta Corrente =-=\n"+
                "- Pix: $pix\n"+
                "- Saldo: $saldo\n"+
                "- Número da Conta: $numero\n"+
                "- Agência: $agencia\n"+
                "- Senha: $senha\n"+
                "- Limite: $limite\n"+
                "- Dados Adicionais: $cliente\n"+
                "- Dados Adicionais: $gerente"+
                "-=- Ações da Conta Corrente -=-";
    }
    override fun sacar(): String = "Saque efetuado com sucesso!"
    override fun depositar(): String = "Você não pode depositar mais do que o seu limite!"
    override fun transferir(): String = "Valor tranferido com sucesso!"
}