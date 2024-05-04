package com.example.taskManager.DataBaseFunctions;

import com.example.taskManager.DataBaseTableData.TaskCategories;
import com.example.taskManager.DataBaseTableData.Tasks;
import com.example.taskManager.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/Task")
    public String index(Model model){
        model.addAttribute("tasks",taskService.getTaskList());
        return "index";
    }

    @GetMapping("/Task/category{id}")
    public String showSection(@PathVariable("id") Long id, Model model) {
        TaskCategories taskCategory = taskService.getTaskCategoryById(id);
        model.addAttribute("tasks", taskService.getTasksByCategory(taskCategory));
        return "index";
    }

    @GetMapping("/Task/{id}/delete")
    public String removeTask(@PathVariable Long id){
        taskService.removeTask(id);
        return "redirect:/Task";
    }

    @GetMapping("/Task/new")
    public String addNew(Model model){
        model.addAttribute("task", new Tasks());
        return "TaskAdd";
    }

    @PostMapping("/Task/new")
    public String addNew(@ModelAttribute Tasks tasks, Model model){
        model.addAttribute("task", tasks);
        taskService.addTask(tasks);
        return "redirect:/Task";
    }


}
