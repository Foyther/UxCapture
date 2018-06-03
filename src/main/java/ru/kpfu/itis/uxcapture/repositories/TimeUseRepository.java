package ru.kpfu.itis.uxcapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.uxcapture.models.TimeUse;

/**
 * Created by Nurislam on 03.06.2018.
 */
@Repository
public interface TimeUseRepository extends JpaRepository<TimeUse,Long> {
}
