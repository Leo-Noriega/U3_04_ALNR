package mx.edu.utez.U3_04_ALNR.controller.cede;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link mx.edu.utez.U3_04_ALNR.model.Cede}
 */
@Value
public class CedeDto implements Serializable {
    String estado;
    String municipio;
}