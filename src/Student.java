/**
 * Student类
 * LiangWeiMing
 * 2020/3/4-17:00
 */
public class Student {
    /*
    姓名
     */
    private String name;
    /*
    年龄
     */
    private int age;
    /*
    成绩
     */
    private int record;
    /*
    班级
     */
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
