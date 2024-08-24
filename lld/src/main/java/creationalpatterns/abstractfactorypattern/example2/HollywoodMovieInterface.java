package creationalpatterns.abstractfactorypattern.example2;

public interface HollywoodMovieInterface {

    String getMovieName();
}

class HollywoodActionMovie implements HollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "True Lies is Hollywood Action Movie";
    }
}

class HollywoodComedyMovie implements HollywoodMovieInterface {

    @Override
    public String getMovieName() {
        return "The Jerk is Hollywood Comedy Movie";
    }
}

