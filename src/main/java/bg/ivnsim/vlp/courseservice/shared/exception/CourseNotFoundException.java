package bg.ivnsim.vlp.courseservice.shared.exception;

/**
 * Project: FiSCo
 * Package: bg.ivnsim.vlp.courseservice.shared.exception
 * <br>
 * Class:CourseNotFoundException
 * Course not found exception
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 18.07.23
 * Time: 14:31
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CourseNotFoundException extends RuntimeException{

    public CourseNotFoundException(String message) {
        super(message);
    }
}