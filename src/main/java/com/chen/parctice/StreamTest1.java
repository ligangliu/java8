package com.chen.parctice;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author liu
 * @Date 2018-12-17 15:08
 */
public class StreamTest1 {

    List<Transaction> list = null;

    @Before
    public void before() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        list = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 950)
        );
    }

    //找出2011年发生的所有交易，并按交易排序（从低到高）
    @Test
    public void test1(){
        List<Transaction> result = list.stream().filter(item -> item.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    //交易员都在哪些不同的城市工作过
    @Test
    public void test2(){
        list.stream().map(item -> item.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }
    //查找所有来自剑桥的交易员，并按姓名排序
    @Test
    public void test3(){
        list.stream().map(Transaction::getTrader)
                .filter(item -> item.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }
    //返回所有交易员的姓名字符串，按字母顺序排序。
    @Test
    public void test4(){
        String result = list.stream().map(item -> item.getTrader().getName()).distinct().sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
    //有没有交易员是在米兰工作的
    @Test
    public void test5(){
        boolean result = list.stream().anyMatch(item -> item.getTrader().getCity().equals("Milan"));
        System.out.println(result);
    }
    //打印生活在剑桥的交易员的所有交易额
    @Test
    public void test6(){
        int result = list.stream().filter(item -> item.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.summingInt(Transaction::getValue));
        System.out.println(result);
    }
    //所有交易中，最高的交易额是多少
    @Test
    public void test7(){
       Optional<Transaction> transaction = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Transaction::getValue)));
       Transaction transaction1 = transaction.map(item -> item).get();
       // .ifPresent(value -> System.out.println(value));
    }
    //找到交易额最小的交易
    @Test
    public void test8(){
        list.stream().min(Comparator.comparingInt(Transaction::getValue))
                .ifPresent(System.out::println);
    }
}
