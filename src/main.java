public class main {


    public static void main(String[] args) {

        BalancedSymbols balancedSymbols = new BalancedSymbols();
        System.out.println(balancedSymbols.isBalanced("<>(){}")); // yes
        System.out.println(balancedSymbols.isBalanced("<>(>){}")); //no


        //System.out.println(DecodeStrings.decode("a+b*(c^d-e)^(f+g*h)-i")); //abcd^e-fgh*+^*+i-
        // im pretty sure my output is fine- its not itr wrong durrr
        // ohhh this is for post fix is why its won okay

        System.out.println(DecodeStrings.decode("3[a]2[bc]"));
        System.out.println(DecodeStrings.decode("3[a2[c]]"));
        System.out.println(DecodeStrings.decode("2[abc]3[cd]ef"));// okayyyyyy
    }
}
