//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] lessens = {"English","Tehnkal","Practical","SowtSkill","Event"};
        String[] food = {"картошка","суп"};

       MyClass myClass1 = new MyClass();
       myClass1.name ="Nurdan";
       myClass1.surName ="NUrmatov";
       myClass1.age = 21;
       myClass1.lesson = lessens;
        myClass1.getInfo();

        System.out.println();

        MyClass myClass2 = new MyClass("Sultan","Isaev",21,lessens,"Гречка");
       myClass2.getInfo();


    }
}