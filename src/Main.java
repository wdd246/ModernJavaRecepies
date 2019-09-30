public class Main {
    public static void main(String[] args) {
        /*
        
        */
        FiveBufforFib bf = new FiveBufforFib();
        //System.out.println(bf.fib(3));

        ThreeReduce rs = new ThreeReduce();
        System.out.println(rs.doubleSum); //110
        System.out.println(rs.sum); //55
        System.out.println(rs.max); //9
        System.out.println(rs.s); //Hello,World!

        ThreePalindrome pal = new ThreePalindrome();
        System.out.println(pal.isPalindrome("Kajak")); //true
        System.out.println(pal.isPalindrome("Anna")); //true
        System.out.println(pal.isPalindrome("Tree")); //false

        ThreeSummaryStatistics ss = new ThreeSummaryStatistics();
        ss.show(); //Min:1.0575541442126024E-5 Max:0.9999956077837103 Count:100000 Sum:49940.30500952221  Avg:0.4994030500952221

        ThreeMatch threeMatch = new ThreeMatch();
        System.out.println(threeMatch.isPrime(3)); //true
        System.out.println(threeMatch.isPrime(4)); //false

        FourGruppingBy gb = new FourGruppingBy();
        gb.show(); //2: [It, is, of, to, in, of] 3: [use] 4: [long, list, case]  7: [strings, example]

        FiveCompute comp = new FiveCompute();
        String passage = "It is a short story about bomb and terrorist , terrorist come to bomb and tell her explode.";
        System.out.println(comp.countWords(passage,"bomb","terrorist")); //{bomb=2, terrorist=2}

        FivePredicateAnd and = new FivePredicateAnd();
        and.show(); //1 36 1225

        SixOptionalFind op = new SixOptionalFind();
        op.showFirstEven(); //five
        op.showFirstOdd(); //strings

        EughtTime eughtTime = new EughtTime();
        eughtTime.showDateTime(); //Instant.now():2019-09-30T15:03:40.875806900Z LocalDate.now()2019-09-30 LocalTime.now()17:03:40.931774100  LocalDateTime.now()2019-09-30T17:03:40.931774100
        eughtTime.showMoonLandingDateTime(); //First Moon landing:  Data: 1969-07-20  EughtTime: 20:18
        eughtTime.plusTime(); //2017-01-02 2017-01-05 2017-01-12 2017-07-12 2019-07-12
        eughtTime.betweenDays(); //400 days to go...

        NineSequentialParallel seqp = new NineSequentialParallel(); //main doing 6 main doing 2 main doing 8 main doing 2 main doing 10 main doing 18

        //OneDefaultInterface df = new OneDefaultInterface();

        NineFuture fut = new NineFuture();
        fut.doing(); //Przetwarzanie  Witaj, świecie

        //TenPrivateInterface sum = new TenPrivateInterface();
        //sum.addEvens(1,2,3,4,5,6,7,8,9,10);
        //sum.addOdds(1,2,3,4,5,6,7,8,9,10);

        TenRandomWhile rw = new TenRandomWhile();
        System.out.println(rw.nums); //[97, 96, 95, 93, 89, 88, 86, 84, 80, 80, 78, 74]
        System.out.println(rw.nums2); //[75, 77, 78, 80, 80, 81, 81, 82, 83, 84, 84, 85, 91, 92, 92, 92, 98]

        OneLambda lambda = new OneLambda();
        lambda.reference(); //314159
        System.out.println();
        lambda.functionalInterface(); //314159
        System.out.println();
        lambda.lambda(); //314159
        System.out.println();

        OneSorting sort = new OneSorting();
        System.out.println(sort.natural); //[Brosnan, Connery, Craig, Dalton, Lazenby, Moore]
        System.out.println(sort.reverse); //[Moore, Lazenby, Dalton, Craig, Connery, Brosnan]
        System.out.println(sort.lowercase); //[Brosnan, Connery, Craig, Dalton, Lazenby, Moore]
        System.out.println(sort.length); //[Moore, Craig, Dalton, Connery, Lazenby, Brosnan]
        System.out.println(sort.lengthAndNatural); //[Craig, Moore, Dalton, Brosnan, Connery, Lazenby]

    }
}
