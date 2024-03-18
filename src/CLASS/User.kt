package CLASS

import CLASS.Solicitudes

class User {
    val name: String,
    val firstLastName: String,
    val secondLastName: String,
    val address: String,
    val rfc: String,
    val phoneNumber: Int,
    val email: String,
    )
    {
        fun getUserData() =
            "Nombre: ${this.name} ${this.firstLastName} ${this.secondLastName}, Dirección: $address, RFC: $rfc, Número de teléfono: $phoneNumber, Correo electrónico $email"

        fun addSolicitudes(solicitudes: Solicitudes) {
        }

    }
}