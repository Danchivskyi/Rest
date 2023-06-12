package Projekt.Rest.data;


import jakarta.persistence.*;

@Entity
@Table(name = "worker_type")
public class WorkerType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "worker_type_generator")
    @SequenceGenerator(name = "worker_type_generator", sequenceName = "worker_type_seq", allocationSize = 1)
    @Column(name = "worker_type_id", nullable = false)
    private long workerTypeId;

    @Column(name = "name", nullable = false)
    private String name;


    public WorkerType(long workerTypeId, String name) {
        this.workerTypeId = workerTypeId;
        this.name = name;
    }

    public WorkerType() {

    }

    public long getWorkerTypeId() {
        return workerTypeId;
    }

    public void setWorkerTypeId(long workerTypeId) {
        this.workerTypeId = workerTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
