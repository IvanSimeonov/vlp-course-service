package bg.ivnsim.vlp.courseservice.course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: FiSCo
 * Package: bg.ivnsim.vlp.courseservice.course.dto
 * <br>
 * Class:CoursePageDTO
 * A pageable course object for returning the courses in pageable format
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 23.07.23
 * Time: 14:45
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoursePageDTO {
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalPages;
    private Long totalPersons;
    private List<CourseDTO> courses = new ArrayList<>();
}