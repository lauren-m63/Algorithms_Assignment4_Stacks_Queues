public class main {


    public static void main(String[] args) {

        BalancedSymbols balancedSymbols = new BalancedSymbols();
        System.out.println(balancedSymbols.isBalanced("<>(){}"));
        System.out.println(balancedSymbols.isBalanced("<>(>){}"));
    }
}
