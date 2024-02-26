package project.view;

import project.entity.User;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AppView {
    public void getListOfUsers(Stream<User> users){

        AtomicInteger counter = new AtomicInteger(1);

        System.out.println("List of users: ");
        users.forEach(user -> System.out.println(counter.getAndIncrement()
                + ") " + user.toString()));

    }
    public void filterUsers(Stream<User> users){

        AtomicInteger counter = new AtomicInteger(1);

        System.out.println("Filtered list: ");
        users.filter(user -> user.getEmail().contains("123"))
                .forEach(user -> System.out.println(counter.getAndIncrement()
                        + ") " + user.toString()));

    }
}
