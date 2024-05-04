package com.example.taskManager.DataBaseFunctions;

import com.example.taskManager.DataBaseTableData.Priorities;
import com.example.taskManager.DataBaseTableData.TaskCategories;
import com.example.taskManager.DataBaseTableData.Tasks;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TaskConfig {

    @Bean
    CommandLineRunner commandLineRunner(JpaTaskRepository jpaTaskRepository) {
        return args -> {
            Tasks task1 = new Tasks("TASK0001", "Do 2 Hour of Programing", TaskCategories.WORK, Priorities.MEDIUM

            );
            Tasks task2 = new Tasks("TASK0002", "Clean Kitchen", TaskCategories.HOME, Priorities.HIGH

            );
            jpaTaskRepository.saveAll(List.of(task1,task2));

        };
    }
}
