package getsSets

fun main() {

    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()

    contaAlex.titular = "Alex"

    contaAlex.numero = 1000

    contaAlex.setSaldo(-200.0)



    val contaFran = Conta()

    contaFran.titular = "Fran"

    contaFran.numero = 1001

    contaFran.setSaldo(300.0)



    println(contaFran.titular)

    println(contaFran.numero)

    println(contaFran.getSaldo())



    println(contaAlex.titular)

    println(contaAlex.numero)

    println(contaAlex.getSaldo())



//    println("depositando na conta do Alex")

//    contaAlex.deposita(50.0)

//    println(contaAlex.saldo)

//

//    println("depositando na conta da Fran")

//    contaFran.deposita(70.0)

//    println(contaFran.saldo)

//

//    println("sacando na conta do Alex")

//    contaAlex.saca(250.0)

//    println(contaAlex.saldo)

//

//    println("sacando na conta da Fran")

//    contaFran.saca(100.0)

//    println(contaFran.saldo)

//

//    println("saque em excesso na conta do Alex")

//    contaAlex.saca(100.0)

//    println(contaAlex.saldo)

//

//    println("saque em excesso na conta da Fran")

//    contaFran.saca(500.0)

//    println(contaFran.saldo)

//

//    println("TransferĂȘncia da conta da Fran para o Alex")

//

//    if(contaFran.transfere(300.0, contaAlex)){

//        println("TransferĂȘncia sucedida")

//    } else {

//        println("Falha na transferĂȘncia")

//    }

//

//    println(contaAlex.saldo)

//    println(contaFran.saldo)

}



class Conta {

    var titular = ""

    var numero = 0

    private var saldo = 0.0



    fun deposita(valor: Double) {

        this.saldo += valor

    }



    fun saca(valor: Double) {

        if (saldo >= valor) {

            saldo -= valor

        }

    }



    fun transfere(valor: Double, destino: Conta): Boolean {

        if (saldo >= valor) {

            saldo -= valor

            destino.deposita(valor)

            return true

        }

        return false

    }



    fun getSaldo(): Double {

        return saldo

    }



    fun setSaldo(valor: Double){

        if(valor > 0){

            saldo = valor

        }

    }

}



fun testaCopiasEReferencias() {

    val numeroX = 10

    var numeroY = numeroX

    numeroY++



    println("numeroX $numeroX")

    println("numeroY $numeroY")



    val contaJoao = Conta()

    contaJoao.titular = "JoĂŁo"

    var contaMaria = Conta()

    contaMaria.titular = "Maria"

    contaJoao.titular = "JoĂŁo"



    println("titular conta joao: ${contaJoao.titular}")

    println("titular conta maria: ${contaMaria.titular}")



    println(contaJoao)

    println(contaMaria)

}



fun testaLacos() {

    var i = 0

    while (i < 5) {

        val titular: String = "Alex $i"

        val numeroConta: Int = 1000 + i

        var saldo = i + 10.0



        println("titular $titular")

        println("nĂșmero da conta $numeroConta")

        println("saldo da conta $saldo")

        println()

        i++

    }



    for (i in 5 downTo 1) {

        val titular: String = "Alex $i"

        val numeroConta: Int = 1000 + i

        var saldo = i + 10.0



        println("titular $titular")

        println("nĂșmero da conta $numeroConta")

        println("saldo da conta $saldo")

        println()

    }

}



fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {

        println("conta Ă© positiva")

    } else if (saldo == 0.0) {

        println("conta Ă© neutra")

    } else {

        println("conta Ă© negativa")

    }



    when {

        saldo > 0.0 -> println("conta Ă© positiva")

        saldo == 0.0 -> println("conta Ă© neutra")

        else -> println("conta Ă© negativa")

    }

}