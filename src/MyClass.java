public class MyClass {
   public  String name;
   public String surName;
  public  int age;
  public String[] lesson;
  public String food;

     MyClass(){}

    MyClass(String name ,String SurName ,int age,String[] lesson,String food){
         this.name = name;
         this.surName = SurName;
         this.age = age;
         this.lesson = lesson;
         this.food = food;


    }
   public void getInfo() {
         System.out.printf("""
                 Name: %S:
                 SurName: %S:
                 age:  %d
                 Food  %S:
                  """,this.name,this.surName,this.age,this.food);
         if(lesson!=null){
             for(String lessons:lesson){
                 System.out.printf("Lessons: %s ",lessons+"\n");

                 }


         }
         }
     }

