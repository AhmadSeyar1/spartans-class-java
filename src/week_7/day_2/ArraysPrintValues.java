package week_7.day_2;

public class ArraysPrintValues {
    public static void main(String[] args) {

        String[] studentNames = {"Ahmad", "Nabi", "Khan"};

        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);

        // Print the name in one line
        System.out.println(studentNames[0].concat(studentNames[1].concat(studentNames[2])));
        System.out.println(studentNames[0] + " " + studentNames[1] + " " + studentNames[2]);

        studentNames[2] = "Javid"; //Modified the name Khan to Javid
        System.out.println(studentNames[0] + " " + studentNames[1] + " " + studentNames[2]);

        studentNames[0] = studentNames[0].replace("Ahmad", "John");//Ahmad replaced with John
        System.out.println(studentNames[0] + " " + studentNames[1] + " " + studentNames[2]);

    }
}
