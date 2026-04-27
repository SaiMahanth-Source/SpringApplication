package org.mahanth;

public class Developer {

//    private int age ;
    private Laptop laptop;

    public Developer() { // For verification purpose in order to know object created for this bean bia spring
        System.out.println("Developer Constructor");
    }

//    public Developer(int age) {
//        this.age = age;
//    }

        public Developer(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Building project will be starting soon");
        laptop.compile();
    }

//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
