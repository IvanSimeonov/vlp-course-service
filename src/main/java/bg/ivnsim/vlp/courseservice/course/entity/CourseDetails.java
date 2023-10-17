package bg.ivnsim.vlp.courseservice.course.entity;

import bg.ivnsim.vlp.courseservice.category.entity.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.entity
 * <br>
 * Class:CourseDetails
 * Details of a course
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 15.10.23
 * Time: 18:38
 * <br>
 */
@Entity(name = "CourseDetails")
@Table(name = "course_details")
@Getter
@Setter
public class CourseDetails {

  @Id
  private Long id;

  private String description;

  @Column(name = "created_on")
  private Date createdOn;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  @JoinColumn(name = "id")
  private Course course;

  @ManyToOne(fetch = FetchType.LAZY)
  private Category category;



}