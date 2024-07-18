public class TestPeople {
    public static void main(String[] args) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        // Boy b = new Person();  // Throws Error
        // Girl g = new Person();  // Throws Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        // Demonstrate use of getName() and setName()
        aPerson.setName("George");
        System.out.println(aPerson.getName());
        System.out.println(jimmy.getName());
        System.out.println(betty.getName());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.getLifeSpan());
        System.out.println(Girl.lifeSpan());

        // Commented out incorrect cast
        // System.out.println(((Boy)aPerson).talk());
    }
}
