package com.example.taskManager.DataBaseFunctions;

import com.example.taskManager.DataBaseTableData.TaskCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.taskManager.DataBaseTableData.Tasks;
import java.util.List;

@Repository
public interface JpaTaskRepository extends JpaRepository<Tasks, Long> {
    @Query("SELECT t FROM Tasks t WHERE t.status = :taskCategories")
    List<Tasks> findByCategory(@Param("taskCategories") TaskCategories taskCategories);


}
