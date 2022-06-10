package com.mitu.generics;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double weight;

    public Student() {
    }

    public Student(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    /**
     * TreeSet自定义排序方式一：
     * @param o o
     * @return o
     */
    @Override
    public int compareTo(Student o) {
        //按照重量排序
        return  (this.weight - o.weight >= 0 ? 1 : -1);
    }
}
