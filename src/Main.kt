import java.time.LocalDate

fun main(){
val cliente = Cliente(
    cpf = "12345678901",
    rg = "987654321",
    nomeCompleto = "Alexandre Dias Martins Assoni",
    dataDeNascimento = LocalDate.of(2004,3,19),
    endereco = "Rua Batista Fontana - n:2",
    telefone = "98002-8922",
    email = "Alezin@gmail.com",
    codigo = 19,
)
    println(cliente)

val gerente = Gerente(
    salario = "R$4,000",
    turno = "Manhã e Tarde",
    filial = "Centro",
    nomeCompleto = "Pedro Cardoso Mendes",
    endereco = "Rua Januario Alves - n:534",
    telefone = "99976-8436",
    email = "PeCardoso@gmail.com",
    codigo = 45,

)
    println(gerente)

val contaCorrente = ContaCorrente(
    pix = "980028922",
    saldo = "R$6,374,25",
    numero = "00001234-5",
    agencia = "1515",
    senha = "378-142",
    limite = "R$10,000,00",
    cliente = Cliente(
        cpf = "12345678901",
        rg = "987654321",
        nomeCompleto = "Alexandre Dias Martins Assoni",
        dataDeNascimento = LocalDate.of(2004,3,19),
        endereco = "Rua Batista Fontana - n:2",
        telefone = "98002-8922",
        email = "Alezin@gmail.com",
        codigo = 19,
    ),
    gerente = Gerente(
        salario = "R$4,000",
        turno = "Manhã e Tarde",
        filial = "Centro",
        nomeCompleto = "Pedro Cardoso Mendes",
        endereco = "Rua Januario Alves - n:534",
        telefone = "99976-8436",
        email = "PeCardoso@gmail.com",
        codigo = 45,
    ),
)
    println(contaCorrente)
    println(contaCorrente.sacar())
    println(contaCorrente.depositar())
    println(contaCorrente.transferir())

val contaPoupanca = ContaPoupanca(
    pix = "Alezin@gmail.com",
    saldo = "R$17,606,00",
    numero = "00005432-1",
    agencia = "1515",
    senha = "765-890",
    rendimento = "R$101,00",
    cliente = Cliente(
        cpf = "12345678901",
        rg = "987654321",
        nomeCompleto = "Alexandre Dias Martins Assoni",
        dataDeNascimento = LocalDate.of(2004,3,19),
        endereco = "Rua Batista Fontana - n:2",
        telefone = "98002-8922",
        email = "Alezin@gmail.com",
        codigo = 19,
    ),
    gerente = Gerente(
        salario = "R$4,000",
        turno = "Manhã e Tarde",
        filial = "Centro",
        nomeCompleto = "Pedro Cardoso Mendes",
        endereco = "Rua Januario Alves - n:534",
        telefone = "99976-8436",
        email = "PeCardoso@gmail.com",
        codigo = 45,
    )
)
    println(contaPoupanca)
    println(contaPoupanca.sacar())
    println(contaPoupanca.depositar())
    println(contaPoupanca.transferir())
}