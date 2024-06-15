//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Ex2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Ex3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Ex4
        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend = " + friend);

        friend = friend / 7;
        System.out.println("friend = " + friend);

        //Ex5
        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog = " + frog);

        frog = frog / 3.5;
        System.out.println("frog = " + frog);

        frog = frog + 4;
        System.out.println("frog = " + frog);

        //Ex6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var bothWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса = " + bothWeight);

        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между массами бойцов = " + differenceWeight);

        //Ex7
        var modWeight = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления = " + modWeight);

        //Ex8_1
        var totalHours = 640;
        var hourPerEmployee = 8;
        var employees = totalHours / 8;
        System.out.println("Всего работников в компании - " + employees + " человек");

        //Ex8_2
        employees = employees + 94;
        totalHours = employees * hourPerEmployee;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}