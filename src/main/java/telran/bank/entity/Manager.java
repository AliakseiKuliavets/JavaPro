package telran.bank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
@Getter
@Setter
@ToString
public class Manager {
    private UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private int status;
    private LocalDate createIt;
    private LocalDate updateIt;
    private List<Client> clients;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int status, LocalDate createIt, LocalDate updateIt, List<Client> clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.createIt = createIt;
        this.updateIt = updateIt;
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return status == manager.status && Objects.equals(id, manager.id) && Objects.equals(firstName, manager.firstName)
                && Objects.equals(lastName, manager.lastName) && Objects.equals(createIt, manager.createIt) &&
                Objects.equals(updateIt, manager.updateIt) && Objects.equals(clients, manager.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, status, createIt, updateIt, clients);
    }
}
