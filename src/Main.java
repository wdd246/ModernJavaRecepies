public class Main {
    public static void main(String[] args) {
        BufforFib bf = new BufforFib();
        //System.out.println(bf.fib(3));

        Reduce rs = new Reduce();
        System.out.println(rs.doubleSum);
        System.out.println(rs.sum);
        System.out.println(rs.max);
        System.out.println(rs.s);

        Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindrome("Kajak"));
        System.out.println(pal.isPalindrome("Anna"));
        System.out.println(pal.isPalindrome("Tree"));

        SummaryStatistics ss = new SummaryStatistics();
        ss.show();

        Match match = new Match();
        System.out.println(match.isPrime(3));
        System.out.println(match.isPrime(4));

        GruppingBy gb = new GruppingBy();
        gb.show();

        Compute comp = new Compute();
        String passage = "It is a short story about bomb and terrorist , terrorist come to bomb and tell her explode.";
        System.out.println(comp.countWords(passage,"bomb","terrorist"));

    }
}
