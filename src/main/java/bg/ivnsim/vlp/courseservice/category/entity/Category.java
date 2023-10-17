package bg.ivnsim.vlp.courseservice.category.entity;

import bg.ivnsim.vlp.courseservice.course.entity.CourseDetails;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.category.entity
 * <br>
 * Class:Category
 * The category entity
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 15.10.23
 * Time: 19:47
 * <br>
 */
@Entity(name = "Category")
@Table(name = "category")
@Getter
@Setter
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String description;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CourseDetails> courseDetailsList = new ArrayList<>();

  public void addCourseDetails(CourseDetails courseDetails) {
    courseDetailsList.add(courseDetails);
    courseDetails.setCategory(this);
  }

  public void removeCourseDetails(CourseDetails courseDetails){
    courseDetailsList.remove(courseDetails);
    courseDetails.setCategory(null);
  }

}