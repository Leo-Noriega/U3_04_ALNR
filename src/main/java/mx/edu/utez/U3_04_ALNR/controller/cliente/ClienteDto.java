package mx.edu.utez.U3_04_ALNR.controller.cliente;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link mx.edu.utez.U3_04_ALNR.model.Cliente}
 */
@Value
public class ClienteDto implements Serializable {
    String nombreCompleto;
    String numeroDeTelefono;
    String correoElectronico;
}