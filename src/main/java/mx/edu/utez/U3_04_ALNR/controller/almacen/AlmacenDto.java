package mx.edu.utez.U3_04_ALNR.controller.almacen;

import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link mx.edu.utez.U3_04_ALNR.model.Almacen}
 */
@Value
public class AlmacenDto implements Serializable {
    double precioDeVenta;
    char tamano;
    String claveCede;
}