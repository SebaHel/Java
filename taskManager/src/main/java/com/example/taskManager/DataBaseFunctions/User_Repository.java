package com.example.taskManager.DataBaseFunctions;

import com.example.taskManager.DataBaseTableData.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repository extends JpaRepository<Users, Long> {

}
