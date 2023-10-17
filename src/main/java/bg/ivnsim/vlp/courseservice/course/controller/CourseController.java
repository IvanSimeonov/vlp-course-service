package bg.ivnsim.vlp.courseservice.course.controller;

import bg.ivnsim.vlp.courseservice.course.dto.CourseDTO;
import bg.ivnsim.vlp.courseservice.course.dto.CoursePageDTO;
import bg.ivnsim.vlp.courseservice.course.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.controller
 * <br>
 * Class:CourseController
 *
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 12:07
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @PostMapping("/courses")
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO) {
        return ResponseEntity.ok(courseService.createCourse(courseDTO));
    }
    @GetMapping("/courses")
    public ResponseEntity<CoursePageDTO> getCourses(
            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
            @RequestParam(name = "sortBy", required = false, defaultValue = "title") String sortBy,
            @RequestParam(name = "sortDirection", required = false, defaultValue = "asc") String sortDirection
    ) {
        return ResponseEntity.ok(courseService.getCourses(page, size, sortBy, sortDirection));
    }

    @GetMapping("/courses/all")
    public ResponseEntity<List<CourseDTO>> getAllCourses() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }


    @GetMapping("/courses/{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(courseService.getCourseById(id));
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourseById(@PathVariable("id") Long id) {
        courseService.deleteCourseById(id);
    }


}