import CLASS.Printer
import CLASS.User

class Usercontrolla(private val printer: Printer) {

    private val clientList: MutableList<User> = mutableListOf()

    fun registerUser() {
        println("Ingresa el nombre del cliente")
        val name = readln()
        println("¿Cuál es su primer apellido?")
        val firstLastName = readln()
        println("¿Cuál es su segundo apellido?")
        val secondLastName = readln()
        println("¿Cuál es su dorección?")
        val address = readln()
        println("¿Cuál es su RFC?")
        val rfc = readln()
        println("¿Cuál es su número de teléfono?")
        val phoneNumber = readln().toInt()
        println("¿Cuál es su correo electrónico?")
        val email = readln()

        val addedUser = User(name, firstLastName, secondLastName, address, rfc, phoneNumber, email)
        UserList.add(addedUser)
    }

    fun showUser() {
        if (UserList.isEmpty()) {
            printer.printMsg("No se encuentran clientes registrados")
        } else {
            var counter = 1
            for (cliente in clientList) {
                printer.printMsg("$cliente" + cliente.getuserData())
                counter++
            }
        }
    }

    fun loadClientsFromDB() {
    }

    fun getClienteByIndex(index: Int): User = UserList[index]

    fun areNotClientRegistered(): Boolean = UserList.isEmpty()
}