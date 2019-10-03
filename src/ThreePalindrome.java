public class ThreePalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }

    public boolean isPalindrome2(String s){
        String forward =
                s.toLowerCase()
                .codePoints() //Zwraca IntStream
                .filter(Character::isLetterOrDigit)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        String backwards = new StringBuilder(forward).reverse().toString();
        return forward.equals(backwards);
    }
}
