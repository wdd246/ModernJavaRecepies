public class Main {
    public static void main(String[] args) {
        /*
        
        */
        BufforFib bf = new BufforFib();
        //System.out.println(bf.fib(3));

        Reduce rs = new Reduce();
        System.out.println(rs.doubleSum); //110
        System.out.println(rs.sum); //55
        System.out.println(rs.max); //9
        System.out.println(rs.s); //Hello,World!

        Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindrome("Kajak")); //true
        System.out.println(pal.isPalindrome("Anna")); //true
        System.out.println(pal.isPalindrome("Tree")); //false

        SummaryStatistics ss = new SummaryStatistics();
        ss.show(); //Min:1.0575541442126024E-5 Max:0.9999956077837103 Count:100000 Sum:49940.30500952221  Avg:0.4994030500952221

        Match match = new Match();
        System.out.println(match.isPrime(3)); //true
        System.out.println(match.isPrime(4)); //false

        GruppingBy gb = new GruppingBy();
        gb.show(); //2: [It, is, of, to, in, of] 3: [use] 4: [long, list, case]  7: [strings, example]

        Compute comp = new Compute();
        String passage = "It is a short story about bomb and terrorist , terrorist come to bomb and tell her explode.";
        System.out.println(comp.countWords(passage,"bomb","terrorist")); //{bomb=2, terrorist=2}

        PredicateAnd and = new PredicateAnd();
        and.show(); //1 36 1225

        OptionalFind op = new OptionalFind();
        op.showFirstEven(); //five
        op.showFirstOdd(); //strings

        Time time = new Time();
        time.showDateTime(); //Instant.now():2019-09-30T15:03:40.875806900Z LocalDate.now()2019-09-30 LocalTime.now()17:03:40.931774100  LocalDateTime.now()2019-09-30T17:03:40.931774100
        time.showMoonLandingDateTime(); //First Moon landing:  Data: 1969-07-20  Time: 20:18
        time.plusTime(); //2017-01-02 2017-01-05 2017-01-12 2017-07-12 2019-07-12
        time.betweenDays(); //400 days to go...

        SequentialParallel seqp = new SequentialParallel(); //main doing 6 main doing 2 main doing 8 main doing 2 main doing 10 main doing 18

        //DefaultInterface df = new DefaultInterface();

        Future fut = new Future();
        fut.doing(); //Przetwarzanie  Witaj, świecie

        //PrivateInterface sum = new PrivateInterface();
        //sum.addEvens(1,2,3,4,5,6,7,8,9,10);
        //sum.addOdds(1,2,3,4,5,6,7,8,9,10);

        RandomWhile rw = new RandomWhile();
        System.out.println(rw.nums); //[97, 96, 95, 93, 89, 88, 86, 84, 80, 80, 78, 74]
        System.out.println(rw.nums2); //[75, 77, 78, 80, 80, 81, 81, 82, 83, 84, 84, 85, 91, 92, 92, 92, 98]

        Lambda lambda = new Lambda();
        lambda.reference(); //314159
        System.out.println();
        lambda.functionalInterface(); //314159
        System.out.println();
        lambda.lambda(); //314159

    }
}
