public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series =series+ch;
            //time complexity is n^2
            //it is not a minimal solution
        }
        System.out.println(series.length());
    }
}
