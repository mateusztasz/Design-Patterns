package lambda;


import com.google.common.base.Optional;

import java.util.LinkedList;
import java.util.List;

import static com.google.common.base.Optional.fromNullable;
import static com.google.common.base.Strings.emptyToNull;

/**
 * Created by Mateusz on 29.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add(null);
        list.add("C");
        list.add(null);
        list.add("E");
        list.add("");

        Optional<String> possible;

        for (int i = 0; i < list.size(); i++) {
            possible = fromNullable(emptyToNull(list.get(i)));
            System.out.println("GET print" + possible+"PRESENT:" + possible.isPresent() + "  index: " + i + " -  value: " + possible.or("no value"));
        }


//        List<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < 100; i++) myList.add(i);
//
//        myList.parallelStream()
//                .filter(x -> x > 90)
//                .forEach(x -> System.out.println(x));

//        //sequential stream
//        Stream<Integer> sequentialStream = myList.stream();
//
//        //parallel stream
//        Stream<Integer> parallelStream = myList.parallelStream();
//
//        //using lambda with Stream API, filter example
//        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
//        //using lambda in forEach
//        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));
//
//        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
//        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));

    }
}
