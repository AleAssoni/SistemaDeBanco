import java.time.LocalDate

class Cliente (
    var cpf: String,
    var rg: String,
    var nomeCompleto: String,
    var dataDeNascimento: LocalDate,
    endereco: String,
    telefone: String,
    email: String,
    codigo: Short,
) : Pessoa(
    endereco,
    telefone,
    email,
    codigo,
){
    override fun toString(): String {
        return "\n=-= Cliente =-=\n" +
                "- CPF: $cpf\n"+
                "- RG: $rg\n"+
                "- Nome completo: $nomeCompleto\n"+
                "- Data de nascimento: $dataDeNascimento\n"+
                "- Endereço: $endereco\n"+
                "- Telefone: $telefone\n"+
                "- Email: $email\n"+
                "- Código: $codigo";

    }
}