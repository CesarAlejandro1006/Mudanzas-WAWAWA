package CLASS

class Solicitudes {
    val user: User,
    val employees: Employees,
    val removal: Removal,
    val date: String,
    val hora: String,
    val details: String,
    val address: String,
    var totalPeso: Double, //Peso total de la mudanza
    var totalDistance: Double, // Total en dinero de la distancia
    val nameRegistrador: String,
    private var isCancelled: Boolean = false
    )
    {

        init {
            calcularTotal()
        }

        fun calcularTotal(): Double {
            var priceTotal = totalPeso * removal.peso
            priceTotal += totalDistance * removal.distance

            if (removal.seguro) {
                priceTotal += calcularCostoSeguro()
            }
            return priceTotal
        }

        fun calcularCostoSeguro(): Double { //Es el costo del seguro
            return 150.00
        }

        fun cancelSolicitud() {
            isCancelled = true
        }

        fun updatePeso(totalPeso: Double) {
            this.totalPeso = totalPeso
            calcularTotal()
        }

        fun updateDistance(totalDistance: Double) {
            this.totalDistance = totalDistance
            calcularTotal()
        }

        fun getSolicitudesData(): String {
            return "Fecha: $date"
            "Class.Cliente: $user"
            "Class.Empleado: $employees"
            "Dirección: $address"
            "Peso total de la mudanza: $totalPeso"
            "Distancia total de la mudanza: $totalDistance"
            "Detalles de la mudanza: $details"
            "Persona que registro la solicitud: $nameRegistrador"
        }

    }