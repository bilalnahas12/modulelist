package com.example.tp2

fun main(){
    class Module(
        val intitule: String,
        val siRegional: Boolean,
        val termine: Boolean,
        val nbHeures: Int)
    val modules=ArrayList<Module>()
   modules.add( Module("Module 1", true, false, 30))
    modules.add( Module("Module 2", false, true, 40))
    modules.add( Module("Module 3", true, true, 25))
    modules.forEach { module ->
        println("Module : ${module.intitule}")}
    modules.forEach {
        println("Module : $it")
    }
    //creer une liste d'intitules de la liste modules

    val menu = modules.map{it.intitule}
    menu.forEach{println(it)}
   val n= modules.filter{it.siRegional==true}
    n.forEach{println(it)}
    val modulesRegionaux = modules.filter{it.siRegional}.map{it.intitule}.forEach{println(it)}
    val m= modules.groupBy{it.siRegional}
    m[true]?.map{it.intitule}?.forEach{println(it)}
    m[false]?.map{it.intitule}?.forEach{println(it)}
    val nbHeuresT = modules.map{it.nbHeures}.fold(0){nbTotal,m -> m+nbTotal}
    println("nombre total des heures des modules $nbHeuresT")
    var modulesTs = modules.sortedBy{it.nbHeures}.map{it.intitule}
    println("modules nombre d'heures $modulesTs")
    var k = modules.sortedBy{it.intitule}.map{it.intitule}
    println("modules intitules $k")
}