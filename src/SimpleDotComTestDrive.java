public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int [] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "3";
        String result = dot.checkYourself(userGuess);

        String testResult = "Neudacha";

        if (result.equals("Popal")) {
            testResult = "Proiden";
        }
        System.out.println(testResult);
    }
}
