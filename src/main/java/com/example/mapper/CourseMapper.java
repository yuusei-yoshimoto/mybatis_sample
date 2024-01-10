package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Course;

@Mapper
public interface CourseMapper {
    public List<Course> findAll(@Param("courseId") Integer courseId, @Param("courseName") String CourseName);

    public void insert(Course course);

    public Course findById(Integer id);
    public void update(Course course);

    public void deleteById(Integer id);
}