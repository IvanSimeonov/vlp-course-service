package bg.ivnsim.vlp.courseservice.course.mapper;

import bg.ivnsim.vlp.courseservice.course.dto.CourseDTO;
import bg.ivnsim.vlp.courseservice.course.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.mapper
 * <br>
 * Interface:CourseMapper
 * Maps the DTO to Entity and vice versa for Courses
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 12:29
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDTO courseToDTO(Course course);
    Course dtoToCourse(CourseDTO courseDTO);
}