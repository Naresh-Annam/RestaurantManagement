package com.code.RestaurantManagement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class RestaurantService {

    @Autowired
    private Repository repo;

    public List<Restaurant> listAll() {
        return repo.findAll();
    }

    public void save(Restaurant restaurant) {
        repo.save(restaurant);
    }

    public Restaurant get(long id) {
        return repo.findById(id).get();
    }

    public void publish(long id) {
        repo.deleteById(id);
    }
}
