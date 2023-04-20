public class Main {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(2, 3);
        Circle circleOne = new Circle(6);

        // Here we calculate the area using the abstract method
        // we created in the abstract class "Shape".
        System.out.println("Calculating the Area using the abstract class : " + rectangleOne.calcArea());
        System.out.println("Calculating the Area using the abstract class : " + circleOne.calcArea());

        System.out.println("\n ********************************************** \n");

        // Here we calculate the area using the abstract method
        // we created in the interface "ShapeInterface".
        System.out.println("Calculating the Area using the interface : " + rectangleOne.calc());
        System.out.println("Calculating the Area using the interface : " + circleOne.calc());

        System.out.println("\n ********************************************** \n");

        /*
          As You can see when you run this code
          both the calcArea() and calc() will give the same
          output as they have the same logic.
         */

        System.out.println("The Object inherited DefaultValue1 from the abstract class : " + rectangleOne.defaultValue1);
        System.out.println("The Object inherited DefaultValue1 from the abstract class : " + circleOne.defaultValue1);

        System.out.println("\n ********************************************** \n");

        System.out.println("The Object inherited DefaultValue2 from the interface : " + rectangleOne.defaultValue2);
        System.out.println("The Object inherited DefaultValue2 from the interface :  " + circleOne.defaultValue2);

        System.out.println("\n ********************************************** \n");

        // Getting the values of the variables using the getters in the class.
        System.out.println("The Length of the Rectangle was : " + rectangleOne.getLength());
        System.out.println("The width of the Rectangle was : " + rectangleOne.getWidth());
        System.out.println("The Radius of the Circle was : " + circleOne.getRadius() );

        // Setting a new values to the variables using the setters in the class.
        rectangleOne.setLength(10);
        rectangleOne.setWidth(20);
        circleOne.setRadius(12);
        System.out.println("The Length of the Rectangle became : " + rectangleOne.getLength());
        System.out.println("The width of the Rectangle became : " + rectangleOne.getWidth());
        System.out.println("The Radius of the Circle became : " + circleOne.getRadius());
        // خلي بالك انا كدا غيرت الطول والعرض ونصف القطر فا بالتالي المساحات هتتغير

        System.out.println("\n ********************************************** \n");

        // We can create multiple objects from the same class
        // and each object can have different details from the others.
        Rectangle rectangleTwo = new Rectangle(5, 7);
        Circle circleTwo = new Circle(3);

        System.out.println("The Area of the First Rectangle is " + rectangleOne.calcArea() +
                " While the Area of the Second Rectangle is " + rectangleTwo.calcArea());

        System.out.println("The Area of the First Circle is " + circleOne.calcArea() +
                " While the Area of the Second Circle is " + circleTwo.calcArea());

        /**
         * NOTE : The Area of rectangleOne and circleOne
         * changed from the first print statement
         * as we used the setters to change the values.
         * لما استعملت ال setters الطول والعرض و نصف القطر اتغيرو
         * فا المساحة اتغيرت للمستطيل الاول و الدايرة الاولي
         * عن اول مرة طبعناها خالص
         */
    }
}
