import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
//        Задание:
//        Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа

        int listLength = 10;
        List<Integer> arrList = createRandomList(listLength);
        System.out.println(arrList);
        maxValue(arrList);
        minValue(arrList);
        AvarageValue(arrList);
        System.out.println(deleteEvenNumb(arrList));

    }
    private static List<Integer> createRandomList(int length){
        List<Integer> arrList = new ArrayList<>(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arrList.add(i, rnd.nextInt(0,10));
        }
        return arrList;
    }
    private static void maxValue(List<Integer> arrList){
        int max = arrList.get(0);
        for ( int num: arrList ) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("maximum value is: " + max);
    }
    private static void minValue(List<Integer> arrList){
        int min = arrList.get(0);
        for ( int num: arrList ) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimal value is: " + min);
    }
    private static void AvarageValue(List<Integer> arrList){
        double avrg = 0;
        for ( int num: arrList ) {
            avrg += num;
        }
        System.out.println("Avarage value is: " + (avrg / arrList.size()));
    }
    private static List<Integer> deleteEvenNumb(List<Integer> arrList){
        for (int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i) % 2 == 0){
                arrList.remove(i);
            }
        }
        return arrList;
    }
}
