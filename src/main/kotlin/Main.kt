import kotlin.math.pow

fun main(args: Array<String>) {


    var diam = 0
    var area = 0.0
    var perim = 0.0
    var pi = 3.14

    print("Digite o diamentro do circulo: ")
    diam = readLine()!!.toInt()

    var raio: Double =- diam. toDouble()/2

    area =  pi * raio.pow(2)
    perim = (raio * 2) * pi

    println("\ncom base no diametro $diam, temos que a área do circulo " +
             "é igual a $area e seu perimetro é igual a $perim")
}
