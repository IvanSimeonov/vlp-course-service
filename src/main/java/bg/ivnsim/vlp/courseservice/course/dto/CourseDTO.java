package bg.ivnsim.vlp.courseservice.course.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.dto
 * <br>
 * Class:CourseDTO
 * Data Transfer Object for Course Entity
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 11:33
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
}