package creationalpatterns.abstractfactorypattern.example2;

public interface MovieFactoryInterface {

    HollywoodMovieInterface getHollywoodMovie();
    BollywoodMovieInterface getBollywoodMovie();
}

class ActionMoviesFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}


