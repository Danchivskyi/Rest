package Projekt.Rest.data;

import jakarta.persistence.*;


@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "worker_generator")
    @SequenceGenerator(name = "worker_generator", sequenceName = "worker_seq", allocationSize = 1)
    @Column(name = "worker_id", nullable = false)
    private long workerId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "worker_type_id")
    private WorkerType workerType;

    public Worker(long workerId, String name, String surname, String login, String password, String email, WorkerType workerType) {
        this.workerId = workerId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.workerType = workerType;
    }

    public Worker() {

    }

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WorkerType getWorkerType() {
        return workerType;
    }

    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType;
    }


}

