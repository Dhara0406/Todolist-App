package com.bawp.todoister.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.bawp.todoister.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insertTask(Task task);

    @Query("DELETE FROM task_name")
    void deleteAll();

    @Query("SELECT * FROM task_name")
    LiveData<List<Task>> getTasks();

    @Query("SELECT * FROM task_name WHERE task_name.task_id== :id")
    LiveData<Task> get(long id);

    @Update
    void update(Task task);
    @Delete
    void delete(Task task);





}
