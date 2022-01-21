package domain.repository;

import domain.repository.entity.DespesasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesasRepository extends JpaRepository<DespesasEntity, Long> {

}
