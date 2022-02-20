class Gerente (
    var salario: String,
    var turno: String,
    var filial: String,
    var nomeCompleto: String,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
) : Pessoa(
    endereco,
    telefone,
    email,
    codigo,
) {
    override fun toString(): String {
        return "\n=-= Gerente =-=\n" +
                "- Salario: $salario\n" +
                "- Turno: $turno\n" +
                "- Filial: $filial\n" +
                "- Nome completo: $nomeCompleto\n" +
                "- Endereço: $endereco\n" +
                "- Telefone: $telefone\n" +
                "- Email: $email\n" +
                "- Código: $codigo\n";
    }
}