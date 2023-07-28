package Question2;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<String> menuItems;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;
    private ArrayList<Integer> itemCounts;

    public Restaurant() {
        this.menuItems = new ArrayList<String>();
        this.prices = new ArrayList<Double>();
        this.ratings = new ArrayList<Integer>();
        this.itemCounts = new ArrayList<Integer>();
    }

    public void addItem(String item, double price) {
        int index = this.menuItems.indexOf(item);

        if (index < 0) {
            menuItems.add(item);
            prices.add(price);
            ratings.add(0);
            itemCounts.add(0);
            System.out.println("The item has been successfully added.");
        } else {
            System.out.println("Sorry! That item already exists.");
        }
    }

    public void removeItem(String item) {
        int index = this.menuItems.indexOf(item);

        if (index >= 0) {
            menuItems.remove(item);
            prices.remove(this.prices.get(index));
            ratings.remove(this.ratings.get(index));
            itemCounts.remove(this.itemCounts.get(index));
            System.out.println("The item has been successfully removed.");
        } else {
            System.out.println("Sorry! That item does not exist.");
        }
    }

    public void addRating(String item, int rating) {
        int index = this.menuItems.indexOf(item);

        if (index >= 0) {
            if (rating > 5) {
                System.out.println("Rating is too high. Please put a number from 0 to 5.");
            } else if (rating < 0) {
                System.out.println("Rating is too low. Please put a number from 0 to 5.");
            } else {
                int currentRating = this.ratings.get(index);
                int itemCount = this.itemCounts.get(index);
                ratings.set(index, currentRating + rating);
                itemCounts.set(index, itemCount + 1);
                System.out.println("Your rating has been added successfully!");
            }
        } else {
            System.out.println("Sorry! That item does not exist.");
        }
    }

    public void averageRating(String item) {
        int index = this.menuItems.indexOf(item);

        if (index >= 0) {
            int currentRating = this.ratings.get(index);
            int itemCount = this.itemCounts.get(index);
            double averageRatingValue;
            if (itemCount > 0) {
                averageRatingValue = currentRating / itemCount;
                System.out.println(String.format("The average rating for %s is: %s stars.", item, averageRatingValue));
            } else {
                System.out.println(String.format("No rating yet for %s", item));
            }
        } else {
            System.out.println("Sorry! That item does not exist.");
        }
    }

    public void seeAllItems() {
        for (String item : menuItems) {
            int index = this.menuItems.indexOf(item);
            double price = this.prices.get(index);
            int rating = this.ratings.get(index);
            int count = this.itemCounts.get(index);
            System.out.println(String.format("Name: %s, Price: %s, Rating: %s, Count: %s", item, price, rating, count));
        }
    }
}
