package com.route.todo_c35_sat.database.dao

import androidx.room.*
import com.route.todo_c35_sat.database.model.Todo
import java.util.*
import kotlin.collections.ArrayList

@Dao
interface TodoDao {
    @Insert
    fun addTodo(todo: Todo)

    @Update
    fun updateTodo(todo: Todo)

    @Delete
    fun deleteTodo(todo: Todo)

    @Query("select * from Todo")
    fun getAllTodos(): MutableList<Todo>

    @Query("select * from Todo where date =:date ")
    fun getTodosByDate(date: Date): MutableList<Todo>
}