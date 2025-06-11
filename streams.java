import java.util.*;
import java.util.stream.*;

public class streams{
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Alice", List.of("Reading", "Swimming", "Reading")),
            new User("Bob", List.of("Gaming", "Swimming")),
            new User("Charlie", List.of("Gaming", "Coding")),
            new User("Daisy", List.of("Reading", "Dancing", "Gaming")),
            new User("Eve", List.of("Coding", "Reading"))
        );

        // 1️⃣ collect() – Collecting into a list
        System.out.println("\n=== Collect to List ===");
        List<String> collected = users.stream()
            .flatMap(user -> user.getHobbies().stream())
            .distinct()
            .collect(Collectors.toList());
        System.out.println(collected);

        // 2️⃣ forEach() – Just print all distinct hobbies
        System.out.println("\n=== forEach() Output ===");
        collected.stream().forEach(System.out::println);

        // 3️⃣ count() – Count number of unique hobbies
        System.out.println("\n=== Count of Unique Hobbies ===");
        long count = collected.stream().count();
        System.out.println(count);

        // 4️⃣ anyMatch() – Check if any hobby contains "Dance"
        System.out.println("\n=== Any Hobby Contains 'Dance'? ===");
        boolean anyDance = collected.stream().anyMatch(h -> h.contains("Dance"));
        System.out.println(anyDance);

        // 5️⃣ allMatch() – Check if all hobbies contain at least one vowel
        System.out.println("\n=== All Hobbies Have a Vowel? ===");
        boolean allVowel = collected.stream().allMatch(h -> h.matches(".*[AEIOUaeiou].*"));
        System.out.println(allVowel);

        // 6️⃣ findFirst() – Find the first hobby alphabetically
        System.out.println("\n=== First Hobby (Sorted) ===");
        Optional<String> first = collected.stream().sorted().findFirst();
        first.ifPresent(System.out::println);

        // 7️⃣ toArray() – Convert to array
        System.out.println("\n=== Hobbies as Array ===");
        String[] hobbyArray = collected.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(hobbyArray));
    }

    static class User {
        private String name;
        private List<String> hobbies;

        public User(String name, List<String> hobbies) {
            this.name = name;
            this.hobbies = hobbies;
        }

        public String getName() {
            return name;
        }

        public List<String> getHobbies() {
            return hobbies;
        }
    }
}

