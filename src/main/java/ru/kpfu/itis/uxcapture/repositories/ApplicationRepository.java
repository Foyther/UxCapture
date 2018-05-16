package ru.kpfu.itis.uxcapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.uxcapture.models.Application;

/**
 * Created by Nurislam on 16.05.2018.
 */
public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
