package abstractfactorypattern.example2;

public interface BollywoodMovieInterface {

    String getMovieName();
}

class BollywoodActionMovie implements BollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Kill is a Bollywood Action movie";
    }
}

class BollywoodComedyMovie implements BollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "Hera Pheri is a Bollywood Comedy Movie";
    }
}
