package mx.edu.utez.U3_04_ALNR.repository;

import mx.edu.utez.U3_04_ALNR.model.Cede;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CedeRepository extends JpaRepository<Cede, Integer> {

    Optional<Cede> findByClaveCede(String claveCede);
}
