package lesson.lesson22.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CustomerRepositoryTest {


    @Test
    void getInvalidCustomerById() {
        Customer customer = new Customer();
        CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);
        Mockito.when(customerRepository.getCustomerById(Mockito.anyLong())).thenThrow(new CustomerNotFoundException());

        CustomerService customerService = new SimpleCustomerService(customerRepository);

        Assertions.assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
    }
}