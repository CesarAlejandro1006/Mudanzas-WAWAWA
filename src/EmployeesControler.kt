import CLASS.Employees
import CLASS.Printer

class EmployeesControler(private val printer: Printer) {
    private val employeesList = mutableListOf<Employees>()


    fun registerEmployees() {
        printer.printMsg("Nombre del empleado")
        val name = readln()
        printer.printMsg("Primer apellido del empleado")
        val firstLastName = readln()
        printer.printMsg("Segundo apellido del empleado")
        val secondLastName = readln()
        printer.printMsg("Puesto del empleado")
        val puesto = readln()
        printer.printMsg("Número de teléfono")
        val phoneNumber = readln().toInt()
        printer.printMsg("Número de nómina")
        val nomina = readln()
        printer.printMsg("Correo electrónico")
        val email = readln()
        val isAvailable = true

        val addedEmpleado =
            Employees(name, firstLastName, secondLastName, puesto, phoneNumber, nomina, email, isAvailable)
        employeesList.add(addedEmpleado)
    }

    fun modifyEmpleado(modifiedEmpleado: Employees, index: Int) {
        if (index in employeesList.indices) {
            employeesList[index] = modifiedEmpleado
        } else {
            printer.printMsg("índice de empleado no válido")
        }
    }

    fun getEmpleadoByIndex(index: Int): Employees? {
        return if (index in employeesList.indices) {
            employeesList[index]
        } else {
            printer.printMsg("Índice de habitación no válido")
            null
        }
    }

    fun showEmpleado() {
        if (employeesList.isEmpty()) {
            printer.printMsg("No se encuentran empleados registrados")
        } else {
            var counter = 1
            for (empleado in employeesList) {
                printer.printMsg("$counter" + empleado.getEmployeesData())
                counter++
            }

        }
    }

    fun areNotEmpleadoRegistered(): Boolean = employeesList.isEmpty()
}