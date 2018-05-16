package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getByLogin(String login);

    User getById(long id);

    void delete(long id);
}
