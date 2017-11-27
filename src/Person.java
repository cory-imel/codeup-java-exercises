class Person {
    private String name;

    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello, " + this.name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person Person1 = new Person("George Bush");
//        String name = Person1.getName();
//        System.out.println(name);
//        Person1.sayHello();
//        Person1.setName("George Washington");
//        name = Person1.getName();
//        System.out.println(name);
//        Person1.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}