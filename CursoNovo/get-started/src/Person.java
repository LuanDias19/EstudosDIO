//import java.time.OffsetDateTime;

public record Person(String name, int age) {

    /*
     * public Person {
     * 
     * }
     * 
     * public Person(String name) {
     * this(name, 1);
     * }
     * 
     * public String getInfo() {
     * return "Name: " + name + ", Age: " + age;
     * }
     * 
     * 
     * private final String name;
     * private int age;
     * private int lastYearAge = OffsetDateTime.now().getYear();
     * 
     * public Person(String name, int age) {
     * this.name = name;
     * this.age = age;
     * }
     * 
     * public String getName() {
     * return name;
     * }
     * 
     * public int getAge() {
     * return age;
     * }
     * 
     * public void incAge() {
     * if (this.lastYearAge >= OffsetDateTime.now().getYear())
     * return;
     * 
     * this.age += 1;
     * this.lastYearAge = OffsetDateTime.now().getYear();
     * }
     */

}
