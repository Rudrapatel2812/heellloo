package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    private Integer id;
    private String semester;
    private static Double persentage;

    public Result() {
    }
    public Result(Integer id, String semester, Double persentage) {
        this.id = id;
        this.semester = semester;
        this.persentage = persentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public  Double getPersentage() {
        return persentage;
    }

    public void setPersentage(Double persentage) {
        this.persentage = persentage;
    }
}



