package ru.kpfu.itis.uxcapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.uxcapture.models.Display;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Repository
public interface DisplayRepository extends JpaRepository<Display, Long>{
    Display findByName(String name);
}
