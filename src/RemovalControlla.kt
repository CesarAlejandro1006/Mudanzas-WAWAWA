import CLASS.Printer
import CLASS.Removal
import kotlin.text.toDouble as toDouble1

class RemovalControlla(private val printer: Printer) {
    private val RemovalList = mutableListOf<Removal>()

    fun registeredRemoval() {
        printer.printMsg("Precio por kg de mudanza")
        val peso = readln().toDouble1()
        printer.printMsg("Distancia en km de la mudanza")
        val distance = readln().toDouble1()
        printer.printMsg("¿Incluye seguro?")
        val seguro = false

        val addedRemoval = Removal(peso, distance, seguro)
        RemovalList.add(addedRemoval)
    }

    fun getMudanzaByIndex(index: Int): Removal? {
        return if (index in RemovalList.indices) {
            RemovalList[index]
        } else {
            printer.printMsg("Índice de mudanza no válido")
            null
        }
    }

    fun showMudanza() {
        if (RemovalList.isEmpty()) {
            printer.printMsg("No se encuentran mudanzas registradas")
        } else {
            var counter = 1
            for (mudanza in RemovalList) {
                printer.printMsg("$counter" + mudanza.getRemovalData())
                counter++
            }
        }
    }

    fun areNotEmployeesRegistered(): Boolean = RemovalList.isEmpty()
}