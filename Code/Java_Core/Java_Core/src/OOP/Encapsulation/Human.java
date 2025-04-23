package OOP.Encapsulation;

import java.util.Date;

public class Human {
    public String name; // bạn đang công khai tên của mình cho cả thế giới biết
    public int age; // bạn đang công khai tuổi của mình cho cả thế giới biết
    private String gender; // bạn đang giấu giới tính của mình với thiên hạ
    private Date dob; // bạn đang che giấu đi sinh nhật của mình

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Date calculateNextBirthday(){
        Date today = new Date();
        Date nextBirthday = new Date(dob.getYear(), dob.getMonth(), dob.getDate());
        if (nextBirthday.before(today)) {
            nextBirthday.setYear(nextBirthday.getYear() + 1);
        }
        return nextBirthday;
    } // bạn đang che đi cách tính sinh nhật tiếp theo của mình

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
