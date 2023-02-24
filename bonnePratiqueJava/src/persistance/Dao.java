package persistance;

import model.Customer;

import java.util.List;

public interface Dao {
    void save(Customer c);
    Optionnal<Customer> findById(int id);

    void delete(int id);

    List<Customer> findAll();

}
