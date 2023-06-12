package Projekt.Rest.Repository;

import Projekt.Rest.data.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
    @Query(nativeQuery = true, value = "from worker where name = :email")
    Worker findByEmail(@Param("email")String email);
}
