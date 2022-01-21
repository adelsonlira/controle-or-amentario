package domain.repository;

import domain.repository.entity.ReceitasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitasRepository extends JpaRepository<ReceitasEntity, Long> {
}
