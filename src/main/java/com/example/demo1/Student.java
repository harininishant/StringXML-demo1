package com.example.demo1;

import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

public class Student {

    private int studentID;
    private String name;
    private Course course;
    private List<String> hobbies;
    private Map<String,String>skillMap;
    private NumberFormat format;// used for formating numbers

    public Student(int studentID, String name, Course course, NumberFormat format) { // for constructor based we use contsructor-arg in bean
        this.studentID = studentID;
        this.name = name;
        this.course = course;
        this.format = format;
        System.out.println("%%%%%%%%%%%%% BEAN CREATED %%%%%%%%%%%%%%%");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + format.format(studentID) +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", hobbies=" + hobbies +
                ", skillMap=" + skillMap +
                                '}';
    }



    public void setHobbies(List<String> hobbies) {// for setter method we use properties in bean
        this.hobbies = hobbies;
    }

    public void setSkillMap(Map<String, String> skillMap) {
        this.skillMap = skillMap;
    }
    /* this should be called after bean is created */
    public void init(){
        System.out.println("********* POST CREATION INITIALIZATION *********");
    }
    /* this should be called after bean is DESTROYED */
    public void release(){
        System.out.println("********* POST DESTROY WORK *********");
    }
}
