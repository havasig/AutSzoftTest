package com.havag.test.AutSzoft.test.Category;

import com.havag.test.AutSzoft.test.modules.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    //TODO: CategoryRepository
}
