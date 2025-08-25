import java.util.HashMap;

public class BookReviews {
    private HashMap<String, Integer> review = new HashMap<>();
    private int reviewCount = 0;
    private double rating;

    public HashMap<String, Integer> getReview() {
        return review;
    }

    public void setReview(String review, int rating) {
        this.review.put(review, rating);
        reviewCount++;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public double getRating() {
        return this.rating;
    }


}
