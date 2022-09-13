package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private Integer id;
    private static String title;
    private static String description;

    public Course() {
    }

    public Course(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Course.title = title;
    }

    public static String getDescription(String description) {
        return Course.description;
    }

    public  void setDescription(String description) {
        Course.description = description;
    }
}
