package com.lambdaschool.school.service;

import com.lambdaschool.school.SchoolApplicationTests;
import org.h2.server.Service;
import org.junit.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
// Stub - forces a return of data

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplicationTests.class)
public class CourseServiceImplTest {

    @Autowired
    private CourseService courseService;

    @BeforeEach
    void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown()
    {
    }

    //FINDALL TEST
    @Test
    public void findAll()
    {
        assertEquals(3, courseService.findAll().size());
    }

    //DELETE TESTS
    @Test
    public void deleteFound()
    {
        courseService.delete(1);
        assertEquals(2, courseService.findAll().size());
    }
}