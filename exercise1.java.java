public class App {
     static boolean iWillNotCheat = false;
    static boolean iWillWin = true;
    public static void main(String[] args) throws Exception {
        assert iWillNotCheat == true :"YANN CHEATERRRR";
        enterCompetition();
        assert iWillWin == true:"BAWI NALANG NEXT TIME";


    }
    static void enterCompetition(){
        iWillWin = false;

    }
}
