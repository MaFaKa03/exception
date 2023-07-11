package exception.lesson1;

public class Task1 {
    public static void main(String[] args) {
        Integer array [] = new Integer[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(find(null, 0));
    }
    /*
    Текст задачи:
        Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
         Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
          в качестве кода ошибки, иначе - длину массива.
    */

    public static Integer arrayLength(Integer [] array){
        if (array == null)
            return -3;
        if (array.length < 10)
            return -1;
        return array.length;
    }

    public static Integer find(Integer [] array, int index){
        if (array == null)
            return -3;
        for (int i = 0; i < array.length; i++) {
            if (index == array[i])
                return i;

        }
        return -2;
    }

}
