public class main {


    public static void main(String[] args) {

        BalancedSymbols balancedSymbols = new BalancedSymbols();
        System.out.println(balancedSymbols.isBalanced("<>(){}")); // yes
        System.out.println(balancedSymbols.isBalanced("<>(>){}")); //no
    }
}
