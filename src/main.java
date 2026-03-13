public class main {


    public static void main(String[] args) {

        BalancedSymbols balancedSymbols = new BalancedSymbols();
        System.out.println(balancedSymbols.isBalanced("<>(){}")); // yes
        System.out.println(balancedSymbols.isBalanced("<>(>){}")); //no


        System.out.println(DecodeStrings.decode("a+b*(c^d-e)^(f+g*h)-i")); //abcd^e-fgh*+^*+i-
        // im pretty sure my output is fine- its not itr wrong
    }
}
