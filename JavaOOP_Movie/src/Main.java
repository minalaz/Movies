public class Main {
    public static void main(String[] args){
       Movie movie1 = new Movie("Dune", "Denis Villeneuve", 2021);
       Movie movie2 = new Movie("Harry Potter and the Deathly Hallows", "David Yates", 2010);

        if (movie1.releaseYear > movie2.releaseYear) {
            System.out.println("The movie " + movie1.name + " is newer than the movie " + movie2.name + "!");
        }
        else if(movie2.releaseYear>movie1.releaseYear){
            System.out.println("The movie " + movie2.name + " is newer than the movie " + movie1.name +"!");
        }
        else{
            System.out.println("The movies were released in the same year! ");
        }
    }
}