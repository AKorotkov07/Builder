public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sydney")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Anton")
                .build();
        System.out.println("Mom: " + mom);
        System.out.println("Son: " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


