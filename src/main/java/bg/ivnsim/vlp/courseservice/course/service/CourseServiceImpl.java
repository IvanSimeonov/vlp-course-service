package bg.ivnsim.vlp.courseservice.course.service;

import bg.ivnsim.vlp.courseservice.course.dto.CourseDTO;
import bg.ivnsim.vlp.courseservice.course.entity.Course;
import bg.ivnsim.vlp.courseservice.course.mapper.CourseMapper;
import bg.ivnsim.vlp.courseservice.course.repository.CourseRepository;
import bg.ivnsim.vlp.courseservice.shared.exception.CourseNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.service
 * <br>
 * Class:CourseServiceImpl
 * Implementation of the CourseService interface
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 11:40
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CourseServiceImpl implements CourseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseService.class);

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course course = CourseMapper.INSTANCE.dtoToCourse(courseDTO);
        course = courseRepository.save(course);
        return CourseMapper.INSTANCE.courseToDTO(course);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<CourseDTO> getCourses() {
        List<Course> courseList = courseRepository.findAll();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        courseList.forEach(course -> courseDTOList.add(CourseMapper.INSTANCE.courseToDTO(course)));
        return courseDTOList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseDTO getCourseById(Long id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
        return CourseMapper.INSTANCE.courseToDTO(course);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteCourseById(Long id) {
        courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
        courseRepository.deleteById(id);
    }
}