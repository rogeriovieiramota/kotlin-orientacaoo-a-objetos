package introducao

import com.sun.javaws.LaunchDownload

fun main(){
    println("minha conta BYTE BANK")
    val titular:String = "rogerio"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 1000 + 0.20
    saldo += 2.0

    saldo = 0.0

    println("titular$titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    //introducao.testaCondicoes(saldo)

//    for (i in 1..5){
//        println(i)
//    }

//    for (i in 5 downTo 1){
//        println(i)
//    }

    var x=0
    while (x<5){
        println("xxx $x")
        x+=1
    }

loop@ for (i in 1..100){
    println("i $i")
    for (j in 1..100){
        println("j $j")
        if(j==5) break@loop
    }
}

}

fun testaCondicoes(saldo: Double){

    /*
if(saldo > 0.0){
    println("o saldo da conta é positiva")
}else if (saldo == 0.0){
    println("o saldo da conta é ZERO")
}else {
    println("o saldo da conta é NEGATIVA")
}
 */
/*
    when {
        saldo > 0.0 -> {
            println("o saldo da conta é positiva")
        }
        saldo == 0.0 -> {
            println("o saldo da conta é ZERO")
        }
        else -> {
            println("o saldo da conta é NEGATIVA")
        }
    }
*/
    when {
        saldo > 0.0 -> println("o saldo da conta é positiva")
        saldo == 0.0 -> println("o saldo da conta é ZERO")
        else -> println("o saldo da conta é NEGATIVA")
    }

}