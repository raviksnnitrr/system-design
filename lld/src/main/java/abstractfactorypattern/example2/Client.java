package abstractfactorypattern.example2;

public class Client {

    public static void main(String[] args){
        MovieFactoryInterface actionMovieFactory = FactoryProducer.getFactory("Action");
        BollywoodMovieInterface bollywoodMovieInterface = actionMovieFactory.getBollywoodMovie();
        System.out.println(bollywoodMovieInterface.getMovieName());
        HollywoodMovieInterface hollywoodActionMovie = actionMovieFactory.getHollywoodMovie();
        System.out.println(hollywoodActionMovie.getMovieName());
    }
}
