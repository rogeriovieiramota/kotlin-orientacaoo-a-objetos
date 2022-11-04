fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    val contaFran = Conta()

    contaAlex.titular="Alex"
    contaAlex.numero=1000
    contaAlex.saldo=100.01

    contaFran.titular="Fran"
    contaFran.numero=2000
    contaFran.saldo=200.22

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    Conta()

}

class Conta {

    var titular=""
    var numero=0
    var saldo=0.0



}