/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package zad12;

import org.joda.time.LocalTime;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
