class Animal{
    enum ZOO{
        LION("Danger"), TIGER("Danger"), DOG("Danger");
    }
    ZOO(String text){
        this.text = text;
    }
    
}

public class Enum {
    public static void main(String[] args) {
        enum Day{
            Sunday,Monday,Tuesday,Wednesday,Thusrday,Friday,Saturday
        }
        Day day = Day.Sunday;
        System.out.println(day);
    }
}
/*
--> To have control over the value
--> Enum is faster than string (Meormy management)(Optimization)
--> Usually written in Upper case cause constant are written ini uppercase
*/