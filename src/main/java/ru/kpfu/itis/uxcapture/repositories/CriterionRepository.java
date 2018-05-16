package ru.kpfu.itis.uxcapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.CriterionReview;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Repository
public interface CriterionRepository extends JpaRepository<Criterion, Long> {
}
