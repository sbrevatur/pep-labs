public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return 
     */
    public int compare (char[] a, char[] b){
        for(int i=0; i<a.length;i++){
            if (a[i]<b[i]){
                return -1;
            } else {
                if (a[i]>b[i]){
                    return 1;
                }
            }
        }
        return 0;
    }
}
