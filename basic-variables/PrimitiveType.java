public class PrimitiveType {
    public static void main(String[] args) {
        System.out.println("Hi");//By useing String as a data type, it is denoted by double Quotes.the variable name is given as firstname
        String firstname = "name-Niharika"; // the variable name is lastname
        String lastname = "Millu"; /* adding two variable,by useing + cahracter that is firstname and lastname
        and stored it in variable called fullname data type String*/
        String fullname = firstname + lastname;
        System.out.println(fullname);
        String name = "Mothername-Rekha";
        System.out.println(name);// This is same as above,but instead of 2 variables.We consider one variable
        int age = 18;
        age = 20; // this is to change the age,by overwriteing previous value
        System.out.println("My age is-"+age);// combineing text and variable
        int a = 2, b = 4, c = 6;// In this we have more than 1 value of same data type. We can write by useing commas
        System.out.println(a + b + c);//adds all the variable value
        byte size = 36;
        System.out.println(size);
        // this is an integer type of size 1 byte
        short marks = 7678;
        System.out.println(marks);
        //this is an integer type of size 4 byte
        float f1 = 688e4f;
        System.out.println(f1);
        // This is a floating point type of size 4 byte
        double d1 = 12e5d;
        System.out.println(d1);
        //This is a floating point type of size 8 byte
        boolean num5 = true;
        System.out.println("Is 5 whole num-" + num5);
        // boolean is a data type
        char section = 'A';
        System.out.println("My section is-"+section);

    }
}
