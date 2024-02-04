import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {
    public void filterList(){
        List<String> list1 = new ArrayList<>();
        list1.add("ABC");

        String[] myArray = new String[]{"ABC","XYZ","NPR"};
        List<String> list2 = List.of(myArray);

        List<String> list3 = Stream.of("ABC","XYZ","NPR").collect(Collectors.toList());

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);

        Integer[] myArray2 = new Integer[]{1,2,3};
        List<Integer> list5 = List.of(myArray2);

        List<Integer> list6 = Stream.of(1,2,3).collect(Collectors.toList());

        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);

        Product product1 = new Product(1,"table",10.00);
        Product product2 = new Product(2, "chair", 8.00);
        Product product3 = new Product(3, "lamp", 12.00);
        List<Product> list7 = new ArrayList<>();
        list7.add(product1);
        list7.add(product2);
        list7.add(product3);

        Product[] myArray3 = new Product[]{product1,product2,product3};
        List<Product> list8 = List.of(myArray3);

        List<Product> list9 = Stream.of(product1,product2,product3).collect(Collectors.toList());

        System.out.println(list7);
        System.out.println(list8);
        System.out.println(list9);

        List<String> list10 = list1.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list10);

        List<Integer> list11 = list4.stream().map(x -> x*3).collect(Collectors.toList());
        System.out.println(list4);
        System.out.println(list11);

        List<Double> list12 = list7.stream().map(x -> x.getPrice()).collect(Collectors.toList());
        System.out.println(list7);
        System.out.println(list12);

        list4.add(4);
        list4.add(5);
        list4.add(5);
        list4.add(6);
        list4.add(7);
        list4.add(7);
        List<Integer> list13 = list4.stream().map(x -> x*1).filter(x -> x < 50).distinct().collect(Collectors.toList());;

        System.out.println(list4);
        System.out.println(list13);

        Product product4 = new Product(4, "bottle", 55.00);
        Product product5 = new Product(5, "pencil", 40.50);
        Product product6 = new Product(6, "fan", 35.00);
        list7.add(product4);
        list7.add(product5);
        list7.add(product6);
        List<Double> list14 = list7.stream().map(x -> x.getPrice()).filter(x -> x >= 10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list7);
        System.out.println(list14);
    }
}
