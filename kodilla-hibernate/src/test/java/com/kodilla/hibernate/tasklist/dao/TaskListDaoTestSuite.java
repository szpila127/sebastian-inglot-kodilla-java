package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn hibernate - TASKLIST";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("LISTNAME", DESCRIPTION);

        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //Then
        List<TaskList> readTasklist = taskListDao.findByListName(listName);
        Assert.assertEquals("LISTNAME", listName);
        Assert.assertEquals(1, readTasklist.size());

        //CleanUp
        int id = readTasklist.get(0).getId();
        taskListDao.deleteById(id);

    }
}
