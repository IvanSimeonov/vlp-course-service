package bg.ivnsim.vlp.courseservice.course.entity;

import bg.ivnsim.vlp.courseservice.lecture.entity.Lecture;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.courseservice.course.entity
 * <br>
 * Class:Course
 * Entity describing the COURSE table
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 11:27
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "Course")
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(
        mappedBy = "course",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Lecture> lectures = new ArrayList<>();

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
        lecture.setCourse(this);
    }

    public void removeLecture(Lecture lecture) {
        lectures.remove(lecture);
        lecture.setCourse(null);
    }

}