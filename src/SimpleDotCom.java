public class SimpleDotCom {

    int numOfHits = 0;

    int location[] = new int[3];


    public void setLocationCells(int[] location) {
        this.location = location;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Mimo";
        for (int i = 0; i < location.length; i++) {
            if (guess == location[i]) {
                numOfHits++;
                if (numOfHits == location.length) {
                    result = "Potopil";
                    break;
                } else {
                    result = "Popal";
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
