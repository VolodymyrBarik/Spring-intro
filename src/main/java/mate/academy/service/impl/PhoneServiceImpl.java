package mate.academy.service.impl;

import mate.academy.dao.PhoneDao;
import mate.academy.model.Phone;
import mate.academy.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    private final PhoneDao phoneDao;

    @Autowired
    public PhoneServiceImpl(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }

    public Phone save(Phone phone) {
        return null;
    }

    public List<Phone> findAll() {
        return null;
    }
}
