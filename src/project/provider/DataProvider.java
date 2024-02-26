package project.provider;

import project.entity.User;

import java.util.stream.Stream;

public class DataProvider {
    public Stream<User> getUsers() {

        return Stream.of(
                new User("Alice", "alice123@gmail.com"),
                new User("Nate", "natan423@gmail.com"),
                new User("Veronika", "ver123@gmail.com"),
                new User("Bob", "bob543@gmail.com"),
                new User("Jake", "jakel@gmail.com")
        );
    }
}




