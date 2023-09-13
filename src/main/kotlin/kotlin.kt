fun ej1()
{
    val arrayNumeros = arrayOf(13,61,35,96,3,93,6,43,68,33,75,88,19,17,81,52,5,51,74,54,10,45,91,39,47,83,59,65,30,46,24,55,92,72)
    var i = 0;
    var cantNumerosMayorA60 = 0
    var flag1 = false
    var primerElementoDivisiblePor7: Int? = null
    var arrayNumerosCapicua = mutableListOf<Int>()

    while(i < arrayNumeros.size)
    {
        if(arrayNumeros[i] > 60)
        {
            cantNumerosMayorA60++;
        }
        if(arrayNumeros[i] % 7 == 0 && !flag1)
        {
            primerElementoDivisiblePor7 = arrayNumeros[i]
            flag1 = true;
        }
        if(esCapicua(arrayNumeros[i]))
        {
            arrayNumerosCapicua.add(arrayNumeros[i])
        }
        i++
    }
    println("Cantidad de numeros mayores a 60: " + cantNumerosMayorA60)
    println("Primer elemento del array divisible por 7: " + primerElementoDivisiblePor7)
    println("Numeros capicua: ")
    for (num in arrayNumerosCapicua) {
        println(num)
    }
} /*Subirrrrrr*/
fun esCapicua(numero: Int): Boolean
{
    return numero.toString() == numero.toString().reversed()
}
fun ej1Simple()
{
    val arrayNumeros = arrayOf(13,61,35,96,3,93,6,43,68,33,75,88,19,17,81,52,5,51,74,54,10,45,91,39,47,83,59,65,30,46,24)
    var cantNumerosMayorA60 = arrayNumeros.count{it > 60}
    println("Cant numeros mayor a 60: " + cantNumerosMayorA60);
    var hayCapicua = arrayNumeros.any{esCapicua(it)}
    if(hayCapicua)
    {
        println("Hay numeros capicua en la coleccion.")
    }
    else
    {
        println("No hay numeros capicua en la coleccion.")
    }
    var primerElementoDivisiblePor7 = arrayNumeros.first{it % 7 == 0}
    println("El primer elemento divisible por 7 es: " + primerElementoDivisiblePor7);
}
/*Hacer esto con count-any-first-last, funciones de kotlin*/
fun main()
{
    ej1Simple()
}
