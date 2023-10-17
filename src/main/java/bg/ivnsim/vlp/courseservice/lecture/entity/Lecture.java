package bg.ivnsim.vlp.courseservice.lecture.entity;

import bg.ivnsim.vlp.courseservice.course.entity.Course;
import jakarta.persistence.*;
import lombok.*;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.lecture.entity
 * <br>
 * Class:Lecture
 * Entity describing the Lecture table
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 3.10.23
 * Time: 16:51
 * <br>
 */
@Entity(name = "Lecture")
@Table(name = "lecture")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Lecture {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @ManyToOne(fetch = FetchType.LAZY)
  private Course course;
}