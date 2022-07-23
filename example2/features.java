package example2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class features {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Sasha"));
        users.add(new User(2,"Matt"));
        users.add(new User(3,"Denis"));
        users.add(new User(4,"Frida"));
        users.add(new User(5,"Caleb"));
        users.add(new User(6,"Nate"));
        users.add(new User(7,"Lana"));


        users.stream().forEach(User==talk);//method reference

        List<User> filteredList = users.stream().filter(user -> user.id>5)
                .collect(Collectors.toList());
        System.out.println("Filtered");
        filteredList.stream().forEach(User::talk);

        List<User> mappedList = users.stream()
                .map(user -> new User(user.id+100,user.name))
                .collect(Collectors.toList());
        mappedList.stream().forEach(user -> System.out.println(user.toString()));


        Map<Integer, String> userMap = users.stream().collect(Collectors
                .toMap(user -> user.id, user -> user.name));

        userMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}


