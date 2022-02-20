abstract class Conta(
    var pix: String,
    var saldo: String,
    var numero: String,
    var agencia: String,
    var senha: String,
    var cliente: Cliente,
    var gerente: Gerente,
){
    open fun sacar(): String = ""
    open fun depositar(): String = ""
    open fun transferir(): String = ""
}