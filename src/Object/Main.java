package Object;

public class Main {



    public static void main(String[] args) {
        PersonService personService = new PersonService();

        Person sarah = new Person("Sarah", 15);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(32);
        System.out.println(sarah);
//       String nameJohn ="John";
//       int ageJohn=13;
//       String nameSarah ="Sarah";
//        int ageSarah=30;
//        String[] names ={"John","Sarah"};
//        int[] ages = {13, 30};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Имя " +names[i] +" Возраст- " + ages[i]);
//        }
//        Person sarah = new Person("sarah",30);
//        System.out.println("sarah.name = " + sarah.getName());
//        System.out.println("sarah.age = " + sarah.getAge());
//        sarah.setAge(31);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        Person john = new Person("John",13);
    }


}
