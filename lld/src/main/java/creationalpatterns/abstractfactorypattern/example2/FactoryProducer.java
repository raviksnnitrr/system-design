package creationalpatterns.abstractfactorypattern.example2;

public class FactoryProducer {

    public static MovieFactoryInterface getFactory(String choice){
        if(choice.equalsIgnoreCase("Comedy")){
            return new ComedyMovieFactory();
        }
        else if(choice.equalsIgnoreCase("Action")){
            return new ActionMoviesFactory();
        }
        return null;
    }

}
