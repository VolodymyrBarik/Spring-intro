package mate.academy.service;

import mate.academy.model.Phone;

import java.util.List;

public interface PhoneService {
    Phone save(Phone phone);

    List<Phone> findAll();
}
