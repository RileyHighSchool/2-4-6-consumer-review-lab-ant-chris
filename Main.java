public class Main {

    public static void main(String[] args){
        System.out.println(Review.sentimentVal("Hello"));
        System.out.println(Review.sentimentVal("this"));
        System.out.println(Review.sentimentVal("is"));
        System.out.println(Review.sentimentVal("test"));
        System.out.println(Review.totalSentiment("simpleReview.txt"));
    }
    
}
