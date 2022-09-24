public class Main {
    public static void main(String[] args) {

        // Задача 1
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
// Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
// Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var allBoxerWeight = (firstBoxerWeight + secondBoxerWeight);
        var differenceBetweenBoxer = (firstBoxerWeight - secondBoxerWeight);
        System.out.println("Общий вес боксеров " + allBoxerWeight);
        System.out.println("Разница в весе между боксерами " + differenceBetweenBoxer);
// Задача 7
        var weightdifferenceBetweenBoxer = (secondBoxerWeight - firstBoxerWeight);
        System.out.println("Разница в весе между боксерами " + weightdifferenceBetweenBoxer);
        var weightDifference = (secondBoxerWeight % firstBoxerWeight);
        System.out.println("Разница в весе между боксерами " + weightDifference);
// Задача 8
        var workHours = 640;
        var workHoursPerWeek = 8;
        var allEmployee = (workHours / workHoursPerWeek);
        System.out.println("Всего работников в компании - " + allEmployee);
        allEmployee = allEmployee + 94;
        var workHoursNew = (workHours / allEmployee);
        System.out.println("Если в компании работает " + allEmployee + " человек, то всего " + workHoursNew + " часов работы может быть поделено между сотрудниками.");
    }
}
