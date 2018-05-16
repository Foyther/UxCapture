package ru.kpfu.itis.uxcapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.uxcapture.models.Device;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
