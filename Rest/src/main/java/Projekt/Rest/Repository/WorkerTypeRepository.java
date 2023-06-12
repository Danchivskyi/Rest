package Projekt.Rest.Repository;

import Projekt.Rest.data.WorkerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerTypeRepository extends JpaRepository<WorkerType, Long> {
}
