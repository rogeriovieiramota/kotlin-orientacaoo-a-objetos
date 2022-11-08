package implementacao

fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    val contaFran = Conta()

    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 100.00

    //val valor = 0.0
    //contaAlex.deposita02(50.0)
    contaAlex.deposita02(50.0)
    contaFran.deposita02(300.0)

    contaAlex.saca(50.0)
    contaAlex.saca(50.0)

    //contaAlex.deposita02(50.0)

    if (contaFran.transfere(100.00, contaAlex)) {
        println("saldo alex" + contaAlex.saldo)
        println("saldo fran" + contaFran.saldo)
    } else {
        println("saldo fran" + contaFran.saldo)
    }


}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    //função membro
    //função de métodos
    //MÉTODO ou o método propriamente dito

    fun deposita02(valor: Double) {
        this.saldo += valor
        println(saldo)
    }

    fun saca(valor: Double) {

        if (this.saldo >= valor) {
            saldo -= valor
            println(" O valor do saldo da conta e " + saldo)
        }

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

}

