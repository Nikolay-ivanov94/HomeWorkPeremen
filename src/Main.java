public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);

            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);

            var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        System.out.println(boxerOne + boxerTwo);
        System.out.println(boxerTwo % boxerOne);

        var differenceBoxer = boxerTwo % boxerOne;
        System.out.println("Разница в весе боксёров " + differenceBoxer + " кг");

        var time = 640;
        var workTime = 8;
        var worker = time / workTime;
        System.out.println("Всего работников в компании " + worker + " человек");
        var moreWorker = worker + 94;
        System.out.println("Если в компании работает " + moreWorker + " человек, то всего " + (time / moreWorker) + " часов работы может быть поделено между сотрудниками");
        // Возвомжно так будет правильней
        //var newTimeWork = (double) time / moreWorker;
        //System.out.println("Если в компании работает " + moreWorker + " человек, то всего " + newTimeWork + " часов работы может быть поделено между сотрудниками");
    }
}