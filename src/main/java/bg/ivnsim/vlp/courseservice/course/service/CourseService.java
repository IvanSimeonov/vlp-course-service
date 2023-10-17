package bg.ivnsim.vlp.courseservice.course.service;

import bg.ivnsim.vlp.courseservice.course.dto.CourseDTO;
import bg.ivnsim.vlp.courseservice.course.dto.CoursePageDTO;

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
     * Retrieve courses in pageable format
     *
     * @param page          - the number of the requested page
     * @param size          - the amount of courses on the requested page
     * @param sortBy        - the field for sorting the courses
     * @param sortDirection - the direction of the sorting (asc, desc)
     * @return a list of all course data
     */
    CoursePageDTO getCourses(Integer page, Integer size, String sortBy, String sortDirection);

    /**
     * Retrieve all courses
     *
     * @return a list of all course data
     */
    List<CourseDTO> getAllCourses();

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