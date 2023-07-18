package bg.ivnsim.vlp.courseservice.course.service;

import bg.ivnsim.vlp.courseservice.course.dto.CourseDTO;

import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.service
 * <br>
 * Interface:CourseService
 * Interface for Course service
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 11:32
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface CourseService {

    /**
     * Create a course
     *
     * @param courseDTO - course data to be inserted
     * @return the created course data
     */
    CourseDTO createCourse(CourseDTO courseDTO);

    /**
     * Retrieve all courses
     *
     * @return a list of all course data
     */
    List<CourseDTO> getCourses();

    /**
     * Retrieve a course by id
     *
     * @param id - id of the course
     * @return the course data if found
     */
    CourseDTO getCourseById(Long id);

    /**
     * Delete a course by id
     *
     * @param id - id of the course
     */
    void deleteCourseById(Long id);


}