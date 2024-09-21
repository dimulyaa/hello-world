fun main( ) {

    val string = "F2p)v\"y233{0->c}ttelciFc"

    val lenght = string.length
    println(lenght)

    val a=string.substring(0,lenght/2)

    println(a)

    val newString=a.map { it.plus(1) }.joinToString("")
    println(newString)

    val b=newString.replace("5","s")
    println(b)

    val c=b.replace("4","u")
    println(c)

    val neewString=c.map { it.minus(3) }.joinToString("")
    println(neewString)
    val d=neewString.replace("0","o")
    println(d)




    val stringg = "F2p)y\"y233{0->c}ttelciFc"

    val lenghtt = stringg.length
    println(lenghtt)

    val aa=stringg.substring(lenghtt/2)
    println(aa)

    val bb=aa.reversed()
    println(bb)

    val cc=bb.map { it.minus(4) }.joinToString("")
    println(cc)

    val dd =cc.replace("_"," ")
    println(dd)

    val abc=d.plus(dd)
    println(abc)


}