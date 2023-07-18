package bg.ivnsim.vlp.courseservice.course.repository;

import bg.ivnsim.vlp.courseservice.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.repository
 * <br>
 * Interface:CourseRepository
 * A repository for the courses table
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 11:30
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
}