package com.chen.methodreference;

/**
 * @Author liu
 * @Date 2018-12-12 9:35
 */
public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

//    public static int compareStudentByScore(Student s1, Student s2){
//        return s1.getScore() - s2.getScore();
//    }
//
//    public static int compareStudentByName(Student s1,Student s2){
//        return s1.getName().compareToIgnoreCase(s2.getName());
//    }

    public int compareStudentByScore(Student other){
        return this.getScore() -  other.getScore();
    }

    public int compareStudentByName(Student other){
        return this.getName().compareToIgnoreCase(other.getName());
    }

}
