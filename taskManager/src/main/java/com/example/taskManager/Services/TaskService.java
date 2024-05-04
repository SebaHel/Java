package com.example.taskManager.Services;

import com.example.taskManager.DataBaseFunctions.JpaTaskRepository;
import com.example.taskManager.DataBaseTableData.TaskCategories;
import com.example.taskManager.DataBaseTableData.Tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    @Autowired
    private final JpaTaskRepository jpaTaskRepository;

    public TaskService(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    public List<Tasks> getTaskList() {
        return jpaTaskRepository.findAll();
    }

    public Tasks addTask(Tasks tasks){
        tasks.setDeadline();
        return jpaTaskRepository.save(tasks);
    }


    public void removeTask(Long id){
        jpaTaskRepository.deleteById(id);
    }

    public List<Tasks> getTasksByCategory(TaskCategories taskCategories) {
        return jpaTaskRepository.findByCategory(taskCategories);
    }
    public TaskCategories getTaskCategoryById(Long id) {
        switch (id.intValue()) {
            case 1: return TaskCategories.WORK;
            case 2: return TaskCategories.SCHOOL;
            case 3: return TaskCategories.HOME;
            case 4: return TaskCategories.PERSONAL;
            case 5: return TaskCategories.OTHER;
            default: throw new IllegalArgumentException("Invalid Task Category ID: " + id);
        }
    }
}
