
import com.google.gson.Gson;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cameron
 */
public class MealAPI {
    public static final String root = "https://www.themealdb.com/api/json/v1/1";
    public static MealData getRandom(){
        try {
            // URL: /random.php
            URL url = new URL(root + "/random.php"); // Construct URL and make sure its okay.
            HttpURLConnection con = (HttpURLConnection) url.openConnection(); // Open a connection to that URL
            Gson gson = new Gson(); // Start a parsing instance.
            InputStreamReader reader = new InputStreamReader(con.getInputStream()); // Make a reader for that input stream.
            MealResponse response = gson.fromJson(reader, MealResponse.class); // GSON convert from text to class
            response.meals[0].print(); // Print out our data to make sure.
            return  response.meals[0];
            // Get a response.
            // Parse it into a class.
            // Return a useable version of the data.
        } catch (MalformedURLException ex) {
            Logger.getLogger(MealAPI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MealAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public class MealResponse{
        public MealData[] meals;
    }
    
    public class MealData {
        
        // Meal ID, category, instruction, image, and Youtube tutorial fields
        public int idMeal;
        public String strMeal;
        public String strCategory;
        public String strInstructions;  
        public String strMealThumb;
        public String strYoutube;
        
        // Ingredient fields
        public String strIngredient1;
        public String strIngredient2;
        public String strIngredient3;
        public String strIngredient4;
        public String strIngredient5;
        public String strIngredient6;
        public String strIngredient7;
        public String strIngredient8;
        public String strIngredient9;
        public String strIngredient10;
        public String strIngredient11;
        public String strIngredient12;
        public String strIngredient13;
        public String strIngredient14;
        public String strIngredient15;
        public String strIngredient16;
        public String strIngredient17;
        public String strIngredient18;
        public String strIngredient19;
        public String strIngredient20;
        
        // Measurement fields
        public String strMeasure1;
        public String strMeasure2;
        public String strMeasure3;
        public String strMeasure4;
        public String strMeasure5;
        public String strMeasure6;
        public String strMeasure7;
        public String strMeasure8;
        public String strMeasure9;
        public String strMeasure10;
        public String strMeasure11;
        public String strMeasure12;
        public String strMeasure13;
        public String strMeasure14;
        public String strMeasure15;
        public String strMeasure16;
        public String strMeasure17;
        public String strMeasure18;
        public String strMeasure19;
        public String strMeasure20;
        
        public void print(){
            System.out.println("ID: " + idMeal);
            System.out.println("Name: " + strMeal);
            System.out.println("Category: " + strCategory);
            System.out.println("Instructions: " + strInstructions);
            System.out.println("strMealThumb: " + strMealThumb);
            System.out.println("How to make! : " + strYoutube);
            System.out.println("Ingredient 1: " + strIngredient1 + " " + "(" + strMeasure1 + ") ");
            System.out.println("Ingredient 2: " + strIngredient2 + " " + "(" + strMeasure2 + ") ");
            System.out.println("Ingredient 3: " + strIngredient3 + " " + "(" + strMeasure3 + ") ");
            System.out.println("Ingredient 4: " + strIngredient4 + " " + "(" + strMeasure4 + ") ");
            System.out.println("Ingredient 5: " + strIngredient5 + " " + "(" + strMeasure5 + ") ");
            System.out.println("Ingredient 6: " + strIngredient6 + " " + "(" + strMeasure6 + ") ");
            System.out.println("Ingredient 7: " + strIngredient7 + " " + "(" + strMeasure7 + ") ");
            System.out.println("Ingredient 8: " + strIngredient8 + " " + "(" + strMeasure8 + ") ");
            System.out.println("Ingredient 9: " + strIngredient9 + " " + "(" + strMeasure9 + ") ");
            System.out.println("Ingredient 10: " + strIngredient10 + " " + "(" + strMeasure10 + ") ");
            System.out.println("Ingredient 11: " + strIngredient11 + " " + "(" + strMeasure11 + ") ");
            System.out.println("Ingredient 12: " + strIngredient12 + " " + "(" + strMeasure12 + ") ");
            System.out.println("Ingredient 13: " + strIngredient13 + " " + "(" + strMeasure13 + ") ");
            System.out.println("Ingredient 14: " + strIngredient14 + " " + "(" + strMeasure14 + ") ");
            System.out.println("Ingredient 15: " + strIngredient15 + " " + "(" + strMeasure15 + ") ");
            System.out.println("Ingredient 16: " + strIngredient16 + " " + "(" + strMeasure16 + ") ");
            System.out.println("Ingredient 17: " + strIngredient17 + " " + "(" + strMeasure17 + ") ");
            System.out.println("Ingredient 18: " + strIngredient18 + " " + "(" + strMeasure18 + ") ");
            System.out.println("Ingredient 19: " + strIngredient19 + " " + "(" + strMeasure19 + ") ");
            System.out.println("Ingredient 20: " + strIngredient20 + " " + "(" + strMeasure20 + ") ");
            
            
        }
        
        public BufferedImage loadImage(){ // Loads the image into the program along with the recipe chosen
            try {
                URL imageURL = new URL(strMealThumb);
                BufferedImage image = ImageIO.read(imageURL);
                return image;
            } catch (MalformedURLException ex) {
                Logger.getLogger(MealAPI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MealAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
    }
}
