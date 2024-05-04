package com.example.taskManager.DataBaseTableData;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "task")
public class Tasks {
    @Id
    @SequenceGenerator(name = "Task_sequence", sequenceName = "Task_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Task_sequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TaskCategories status;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority")
    private Priorities priority;

    @Column(name = "deadline",columnDefinition = "TIME")

    private LocalTime deadline;


    public Tasks() {
    }

    public Tasks(String title, String description, TaskCategories taskCategories, Priorities priorities) {
        this.title = title;
        this.description = description;
        this.status = taskCategories;
        this.priority = priorities;
        if (priority.getValue() != 0) {
            this.deadline = LocalTime.now().plusHours(24 / priority.getValue()).withNano(0);
        } else {
            this.deadline = LocalTime.now().withNano(0);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskCategories getStatus() {
        return status;
    }

    public void setStatus(TaskCategories status) {
        this.status = status;
    }

    public Priorities getPriority() {
        return priority;
    }

    public LocalTime getDeadline() {
        return deadline;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }

    public void setDeadline() {
        if (priority.getValue() != 0) {
            this.deadline = LocalTime.now().plusHours(24 / priority.getValue()).withNano(0);
        } else {
            this.deadline = LocalTime.now().withNano(0);
        }
    }

    public void setStatus(Priorities priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", taskCategories=" + status +
                ", priorities=" + status +
                ", timeLeft=" + deadline +
                '}';
    }
}
