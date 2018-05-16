package ru.kpfu.itis.uxcapture.repositories;

import org.hibernate.metamodel.source.binder.JpaCallbackClass;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.uxcapture.models.TouchMap;

/**
 * Created by Nurislam on 16.05.2018.
 */
public interface TouchMapRepository  extends JpaRepository<TouchMap, Long>{

}
